
package com.itschool.oauthexample.github_api;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Permissions implements Serializable
{

    @SerializedName("admin")
    @Expose
    private boolean admin;
    @SerializedName("push")
    @Expose
    private boolean push;
    @SerializedName("pull")
    @Expose
    private boolean pull;
    private final static long serialVersionUID = -8907917695110496567L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Permissions() {
    }

    /**
     * 
     * @param pull
     * @param admin
     * @param push
     */
    public Permissions(boolean admin, boolean push, boolean pull) {
        super();
        this.admin = admin;
        this.push = push;
        this.pull = pull;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isPush() {
        return push;
    }

    public void setPush(boolean push) {
        this.push = push;
    }

    public boolean isPull() {
        return pull;
    }

    public void setPull(boolean pull) {
        this.pull = pull;
    }

}
