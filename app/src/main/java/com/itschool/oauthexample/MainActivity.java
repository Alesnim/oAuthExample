package com.itschool.oauthexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.net.wifi.rtt.ResponderLocation;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.itschool.oauthexample.github_api.AccessToken;
import com.itschool.oauthexample.github_api.GithubAPI;
import com.itschool.oauthexample.github_api.Repository;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    Retrofit retrofit;
    Button button, button2;
    private String clientId     = "0da15e67c3ee44fb8d43";
    private String clientSecret = "80ac8d8f1ece33e43bf2445a4f93831386102411";
    private String redirectUrl  = "http://exampleauth/callback";
    private String code;
    private String accessToken2;
    private String tokenType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initCall();
            }
        });


        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showUserRepo();
            }
        });


        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("http://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create());

        retrofit =  builder.build();









        //showUserRepo();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        SharedPreferences preferences = getPreferences(MODE_PRIVATE);
        // code = preferences.getString("code", "");
        if (code == null || code.equals("")) {
            Uri s = getIntent().getData();
            if (s != null && s.toString().startsWith(redirectUrl)) {
                code = s.getQueryParameter("code");
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("code", code);
                editor.commit();

            }

        }
        Retrofit.Builder builder2 = new Retrofit.Builder()
                .baseUrl("https://github.com/")
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit2 = builder2.build();

        GithubAPI githubAPI = retrofit2.create(GithubAPI.class);

        if(code != null && !code.equals("")) {
            final Call<AccessToken> accessToken = githubAPI.getToken( clientId, clientSecret, code);
            accessToken.enqueue(new Callback<AccessToken>() {
                @Override
                public void onResponse(Call<AccessToken> call, Response<AccessToken> response) {
                    if (response.isSuccessful()) {
                        AccessToken token = response.body();
                        accessToken2 = token.getAccessToken();
                        tokenType = token.getTokenType();

                    }
                    else {
                        Log.d("TAG", "TOKEN " + response.message());

                    }

                }

                @Override
                public void onFailure(Call<AccessToken> call, Throwable throwable) {
                    Log.d("TAG", String.valueOf(throwable.getMessage()));

                }
            });
        }

    }

    @Override
    protected void onResume() {
        super.onResume();


    }


    private void initCall() {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://github.com/login/oauth/authorize/" + "?client_id="
                        + clientId +"&scope=repo"
                        + "&redirect_uri=" + redirectUrl));
        Log.d("TAG", "https://github.com/login/oauth/authorize/" + "?client_id="
                + clientId +"&scope=repo"
                + "&redirect_uri=" + redirectUrl);
        // intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        // "&redirect_uri=" + "com.itschool.oauthexample://callback"
        startActivity(intent);
    }

    private void showUserRepo() {
            GithubAPI githubAPI = retrofit.create(GithubAPI.class);

            final Call<List<Repository>> repos = githubAPI.reposUser(tokenType + " " + accessToken2, "alesnim");

            repos.enqueue(new Callback<List<Repository>>() {
                @Override
                public void onResponse(Call<List<Repository>> call, Response<List<Repository>> response) {
                    if (response.isSuccessful()) {
                        List<Repository> repos = response.body();
                        for (Repository rep: repos) {
                            Log.d("TAG", rep.toString());

                        }
                    }
                }

                @Override
                public void onFailure(Call<List<Repository>> call, Throwable throwable) {

                }
            });

    }
}
