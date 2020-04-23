
package com.itschool.oauthexample.github_api;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Repository implements Serializable
{

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("node_id")
    @Expose
    private String nodeId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("private")
    @Expose
    private boolean _private;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("fork")
    @Expose
    private boolean fork;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("archive_url")
    @Expose
    private String archiveUrl;
    @SerializedName("assignees_url")
    @Expose
    private String assigneesUrl;
    @SerializedName("blobs_url")
    @Expose
    private String blobsUrl;
    @SerializedName("branches_url")
    @Expose
    private String branchesUrl;
    @SerializedName("collaborators_url")
    @Expose
    private String collaboratorsUrl;
    @SerializedName("comments_url")
    @Expose
    private String commentsUrl;
    @SerializedName("commits_url")
    @Expose
    private String commitsUrl;
    @SerializedName("compare_url")
    @Expose
    private String compareUrl;
    @SerializedName("contents_url")
    @Expose
    private String contentsUrl;
    @SerializedName("contributors_url")
    @Expose
    private String contributorsUrl;
    @SerializedName("deployments_url")
    @Expose
    private String deploymentsUrl;
    @SerializedName("downloads_url")
    @Expose
    private String downloadsUrl;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;
    @SerializedName("forks_url")
    @Expose
    private String forksUrl;
    @SerializedName("git_commits_url")
    @Expose
    private String gitCommitsUrl;
    @SerializedName("git_refs_url")
    @Expose
    private String gitRefsUrl;
    @SerializedName("git_tags_url")
    @Expose
    private String gitTagsUrl;
    @SerializedName("git_url")
    @Expose
    private String gitUrl;
    @SerializedName("issue_comment_url")
    @Expose
    private String issueCommentUrl;
    @SerializedName("issue_events_url")
    @Expose
    private String issueEventsUrl;
    @SerializedName("issues_url")
    @Expose
    private String issuesUrl;
    @SerializedName("keys_url")
    @Expose
    private String keysUrl;
    @SerializedName("labels_url")
    @Expose
    private String labelsUrl;
    @SerializedName("languages_url")
    @Expose
    private String languagesUrl;
    @SerializedName("merges_url")
    @Expose
    private String mergesUrl;
    @SerializedName("milestones_url")
    @Expose
    private String milestonesUrl;
    @SerializedName("notifications_url")
    @Expose
    private String notificationsUrl;
    @SerializedName("pulls_url")
    @Expose
    private String pullsUrl;
    @SerializedName("releases_url")
    @Expose
    private String releasesUrl;
    @SerializedName("ssh_url")
    @Expose
    private String sshUrl;
    @SerializedName("stargazers_url")
    @Expose
    private String stargazersUrl;
    @SerializedName("statuses_url")
    @Expose
    private String statusesUrl;
    @SerializedName("subscribers_url")
    @Expose
    private String subscribersUrl;
    @SerializedName("subscription_url")
    @Expose
    private String subscriptionUrl;
    @SerializedName("tags_url")
    @Expose
    private String tagsUrl;
    @SerializedName("teams_url")
    @Expose
    private String teamsUrl;
    @SerializedName("trees_url")
    @Expose
    private String treesUrl;
    @SerializedName("clone_url")
    @Expose
    private String cloneUrl;
    @SerializedName("mirror_url")
    @Expose
    private String mirrorUrl;
    @SerializedName("hooks_url")
    @Expose
    private String hooksUrl;
    @SerializedName("svn_url")
    @Expose
    private String svnUrl;
    @SerializedName("homepage")
    @Expose
    private String homepage;
    @SerializedName("language")
    @Expose
    private Object language;
    @SerializedName("forks_count")
    @Expose
    private int forksCount;
    @SerializedName("stargazers_count")
    @Expose
    private int stargazersCount;
    @SerializedName("watchers_count")
    @Expose
    private int watchersCount;
    @SerializedName("size")
    @Expose
    private int size;
    @SerializedName("default_branch")
    @Expose
    private String defaultBranch;
    @SerializedName("open_issues_count")
    @Expose
    private int openIssuesCount;
    @SerializedName("is_template")
    @Expose
    private boolean isTemplate;
    @SerializedName("topics")
    @Expose
    private List<String> topics = null;
    @SerializedName("has_issues")
    @Expose
    private boolean hasIssues;
    @SerializedName("has_projects")
    @Expose
    private boolean hasProjects;
    @SerializedName("has_wiki")
    @Expose
    private boolean hasWiki;
    @SerializedName("has_pages")
    @Expose
    private boolean hasPages;
    @SerializedName("has_downloads")
    @Expose
    private boolean hasDownloads;
    @SerializedName("archived")
    @Expose
    private boolean archived;
    @SerializedName("disabled")
    @Expose
    private boolean disabled;
    @SerializedName("visibility")
    @Expose
    private String visibility;
    @SerializedName("pushed_at")
    @Expose
    private String pushedAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("permissions")
    @Expose
    private Permissions permissions;
    @SerializedName("template_repository")
    @Expose
    private Object templateRepository;
    @SerializedName("temp_clone_token")
    @Expose
    private String tempCloneToken;
    @SerializedName("subscribers_count")
    @Expose
    private int subscribersCount;
    @SerializedName("network_count")
    @Expose
    private int networkCount;
    @SerializedName("license")
    @Expose
    private License license;
    private final static long serialVersionUID = -1806423348618075797L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Repository() {
    }

    /**
     * 
     * @param sshUrl
     * @param archiveUrl
     * @param languagesUrl
     * @param language
     * @param assigneesUrl
     * @param commitsUrl
     * @param cloneUrl
     * @param forksCount
     * @param subscribersUrl
     * @param createdAt
     * @param forksUrl
     * @param watchersCount
     * @param _private
     * @param permissions
     * @param issueCommentUrl
     * @param statusesUrl
     * @param id
     * @param collaboratorsUrl
     * @param updatedAt
     * @param labelsUrl
     * @param visibility
     * @param templateRepository
     * @param defaultBranch
     * @param tempCloneToken
     * @param subscribersCount
     * @param keysUrl
     * @param downloadsUrl
     * @param contentsUrl
     * @param pushedAt
     * @param tagsUrl
     * @param license
     * @param commentsUrl
     * @param size
     * @param isTemplate
     * @param treesUrl
     * @param name
     * @param mergesUrl
     * @param nodeId
     * @param teamsUrl
     * @param blobsUrl
     * @param issueEventsUrl
     * @param hasPages
     * @param milestonesUrl
     * @param issuesUrl
     * @param releasesUrl
     * @param description
     * @param branchesUrl
     * @param contributorsUrl
     * @param networkCount
     * @param gitRefsUrl
     * @param hooksUrl
     * @param openIssuesCount
     * @param archived
     * @param stargazersCount
     * @param disabled
     * @param hasIssues
     * @param owner
     * @param hasWiki
     * @param compareUrl
     * @param gitCommitsUrl
     * @param topics
     * @param htmlUrl
     * @param stargazersUrl
     * @param fullName
     * @param svnUrl
     * @param url
     * @param pullsUrl
     * @param mirrorUrl
     * @param hasDownloads
     * @param fork
     * @param hasProjects
     * @param deploymentsUrl
     * @param eventsUrl
     * @param gitTagsUrl
     * @param notificationsUrl
     * @param gitUrl
     * @param subscriptionUrl
     * @param homepage
     */
    public Repository(int id, String nodeId, String name, String fullName, Owner owner, boolean _private, String htmlUrl, String description, boolean fork, String url, String archiveUrl, String assigneesUrl, String blobsUrl, String branchesUrl, String collaboratorsUrl, String commentsUrl, String commitsUrl, String compareUrl, String contentsUrl, String contributorsUrl, String deploymentsUrl, String downloadsUrl, String eventsUrl, String forksUrl, String gitCommitsUrl, String gitRefsUrl, String gitTagsUrl, String gitUrl, String issueCommentUrl, String issueEventsUrl, String issuesUrl, String keysUrl, String labelsUrl, String languagesUrl, String mergesUrl, String milestonesUrl, String notificationsUrl, String pullsUrl, String releasesUrl, String sshUrl, String stargazersUrl, String statusesUrl, String subscribersUrl, String subscriptionUrl, String tagsUrl, String teamsUrl, String treesUrl, String cloneUrl, String mirrorUrl, String hooksUrl, String svnUrl, String homepage, Object language, int forksCount, int stargazersCount, int watchersCount, int size, String defaultBranch, int openIssuesCount, boolean isTemplate, List<String> topics, boolean hasIssues, boolean hasProjects, boolean hasWiki, boolean hasPages, boolean hasDownloads, boolean archived, boolean disabled, String visibility, String pushedAt, String createdAt, String updatedAt, Permissions permissions, Object templateRepository, String tempCloneToken, int subscribersCount, int networkCount, License license) {
        super();
        this.id = id;
        this.nodeId = nodeId;
        this.name = name;
        this.fullName = fullName;
        this.owner = owner;
        this._private = _private;
        this.htmlUrl = htmlUrl;
        this.description = description;
        this.fork = fork;
        this.url = url;
        this.archiveUrl = archiveUrl;
        this.assigneesUrl = assigneesUrl;
        this.blobsUrl = blobsUrl;
        this.branchesUrl = branchesUrl;
        this.collaboratorsUrl = collaboratorsUrl;
        this.commentsUrl = commentsUrl;
        this.commitsUrl = commitsUrl;
        this.compareUrl = compareUrl;
        this.contentsUrl = contentsUrl;
        this.contributorsUrl = contributorsUrl;
        this.deploymentsUrl = deploymentsUrl;
        this.downloadsUrl = downloadsUrl;
        this.eventsUrl = eventsUrl;
        this.forksUrl = forksUrl;
        this.gitCommitsUrl = gitCommitsUrl;
        this.gitRefsUrl = gitRefsUrl;
        this.gitTagsUrl = gitTagsUrl;
        this.gitUrl = gitUrl;
        this.issueCommentUrl = issueCommentUrl;
        this.issueEventsUrl = issueEventsUrl;
        this.issuesUrl = issuesUrl;
        this.keysUrl = keysUrl;
        this.labelsUrl = labelsUrl;
        this.languagesUrl = languagesUrl;
        this.mergesUrl = mergesUrl;
        this.milestonesUrl = milestonesUrl;
        this.notificationsUrl = notificationsUrl;
        this.pullsUrl = pullsUrl;
        this.releasesUrl = releasesUrl;
        this.sshUrl = sshUrl;
        this.stargazersUrl = stargazersUrl;
        this.statusesUrl = statusesUrl;
        this.subscribersUrl = subscribersUrl;
        this.subscriptionUrl = subscriptionUrl;
        this.tagsUrl = tagsUrl;
        this.teamsUrl = teamsUrl;
        this.treesUrl = treesUrl;
        this.cloneUrl = cloneUrl;
        this.mirrorUrl = mirrorUrl;
        this.hooksUrl = hooksUrl;
        this.svnUrl = svnUrl;
        this.homepage = homepage;
        this.language = language;
        this.forksCount = forksCount;
        this.stargazersCount = stargazersCount;
        this.watchersCount = watchersCount;
        this.size = size;
        this.defaultBranch = defaultBranch;
        this.openIssuesCount = openIssuesCount;
        this.isTemplate = isTemplate;
        this.topics = topics;
        this.hasIssues = hasIssues;
        this.hasProjects = hasProjects;
        this.hasWiki = hasWiki;
        this.hasPages = hasPages;
        this.hasDownloads = hasDownloads;
        this.archived = archived;
        this.disabled = disabled;
        this.visibility = visibility;
        this.pushedAt = pushedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.permissions = permissions;
        this.templateRepository = templateRepository;
        this.tempCloneToken = tempCloneToken;
        this.subscribersCount = subscribersCount;
        this.networkCount = networkCount;
        this.license = license;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public boolean isPrivate() {
        return _private;
    }

    public void setPrivate(boolean _private) {
        this._private = _private;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFork() {
        return fork;
    }

    public void setFork(boolean fork) {
        this.fork = fork;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getArchiveUrl() {
        return archiveUrl;
    }

    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    public String getBlobsUrl() {
        return blobsUrl;
    }

    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    public String getBranchesUrl() {
        return branchesUrl;
    }

    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public String getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public String getCompareUrl() {
        return compareUrl;
    }

    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    public String getContentsUrl() {
        return contentsUrl;
    }

    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    public String getContributorsUrl() {
        return contributorsUrl;
    }

    public void setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    public String getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public void setDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }

    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    public void setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public String getForksUrl() {
        return forksUrl;
    }

    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    public String getIssuesUrl() {
        return issuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public String getKeysUrl() {
        return keysUrl;
    }

    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    public String getLabelsUrl() {
        return labelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public String getLanguagesUrl() {
        return languagesUrl;
    }

    public void setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    public String getMergesUrl() {
        return mergesUrl;
    }

    public void setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    public String getPullsUrl() {
        return pullsUrl;
    }

    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    public String getReleasesUrl() {
        return releasesUrl;
    }

    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    public String getSshUrl() {
        return sshUrl;
    }

    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public String getStargazersUrl() {
        return stargazersUrl;
    }

    public void setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    public String getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    public void setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    public String getTagsUrl() {
        return tagsUrl;
    }

    public void setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }

    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public String getTreesUrl() {
        return treesUrl;
    }

    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    public String getMirrorUrl() {
        return mirrorUrl;
    }

    public void setMirrorUrl(String mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    public String getHooksUrl() {
        return hooksUrl;
    }

    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public String getSvnUrl() {
        return svnUrl;
    }

    public void setSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public Object getLanguage() {
        return language;
    }

    public void setLanguage(Object language) {
        this.language = language;
    }

    public int getForksCount() {
        return forksCount;
    }

    public void setForksCount(int forksCount) {
        this.forksCount = forksCount;
    }

    public int getStargazersCount() {
        return stargazersCount;
    }

    public void setStargazersCount(int stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    public int getWatchersCount() {
        return watchersCount;
    }

    public void setWatchersCount(int watchersCount) {
        this.watchersCount = watchersCount;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public int getOpenIssuesCount() {
        return openIssuesCount;
    }

    public void setOpenIssuesCount(int openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    public boolean isIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public boolean isHasIssues() {
        return hasIssues;
    }

    public void setHasIssues(boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    public boolean isHasProjects() {
        return hasProjects;
    }

    public void setHasProjects(boolean hasProjects) {
        this.hasProjects = hasProjects;
    }

    public boolean isHasWiki() {
        return hasWiki;
    }

    public void setHasWiki(boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    public boolean isHasPages() {
        return hasPages;
    }

    public void setHasPages(boolean hasPages) {
        this.hasPages = hasPages;
    }

    public boolean isHasDownloads() {
        return hasDownloads;
    }

    public void setHasDownloads(boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Permissions getPermissions() {
        return permissions;
    }

    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    public Object getTemplateRepository() {
        return templateRepository;
    }

    public void setTemplateRepository(Object templateRepository) {
        this.templateRepository = templateRepository;
    }

    public String getTempCloneToken() {
        return tempCloneToken;
    }

    public void setTempCloneToken(String tempCloneToken) {
        this.tempCloneToken = tempCloneToken;
    }

    public int getSubscribersCount() {
        return subscribersCount;
    }

    public void setSubscribersCount(int subscribersCount) {
        this.subscribersCount = subscribersCount;
    }

    public int getNetworkCount() {
        return networkCount;
    }

    public void setNetworkCount(int networkCount) {
        this.networkCount = networkCount;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "Repository{" +
                "id=" + id +
                ", nodeId='" + nodeId + '\'' +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", owner=" + owner +
                ", _private=" + _private +
                ", htmlUrl='" + htmlUrl + '\'' +
                ", description='" + description + '\'' +
                ", fork=" + fork +
                ", url='" + url + '\'' +
                ", archiveUrl='" + archiveUrl + '\'' +
                ", assigneesUrl='" + assigneesUrl + '\'' +
                ", blobsUrl='" + blobsUrl + '\'' +
                ", branchesUrl='" + branchesUrl + '\'' +
                ", collaboratorsUrl='" + collaboratorsUrl + '\'' +
                ", commentsUrl='" + commentsUrl + '\'' +
                ", commitsUrl='" + commitsUrl + '\'' +
                ", compareUrl='" + compareUrl + '\'' +
                ", contentsUrl='" + contentsUrl + '\'' +
                ", contributorsUrl='" + contributorsUrl + '\'' +
                ", deploymentsUrl='" + deploymentsUrl + '\'' +
                ", downloadsUrl='" + downloadsUrl + '\'' +
                ", eventsUrl='" + eventsUrl + '\'' +
                ", forksUrl='" + forksUrl + '\'' +
                ", gitCommitsUrl='" + gitCommitsUrl + '\'' +
                ", gitRefsUrl='" + gitRefsUrl + '\'' +
                ", gitTagsUrl='" + gitTagsUrl + '\'' +
                ", gitUrl='" + gitUrl + '\'' +
                ", issueCommentUrl='" + issueCommentUrl + '\'' +
                ", issueEventsUrl='" + issueEventsUrl + '\'' +
                ", issuesUrl='" + issuesUrl + '\'' +
                ", keysUrl='" + keysUrl + '\'' +
                ", labelsUrl='" + labelsUrl + '\'' +
                ", languagesUrl='" + languagesUrl + '\'' +
                ", mergesUrl='" + mergesUrl + '\'' +
                ", milestonesUrl='" + milestonesUrl + '\'' +
                ", notificationsUrl='" + notificationsUrl + '\'' +
                ", pullsUrl='" + pullsUrl + '\'' +
                ", releasesUrl='" + releasesUrl + '\'' +
                ", sshUrl='" + sshUrl + '\'' +
                ", stargazersUrl='" + stargazersUrl + '\'' +
                ", statusesUrl='" + statusesUrl + '\'' +
                ", subscribersUrl='" + subscribersUrl + '\'' +
                ", subscriptionUrl='" + subscriptionUrl + '\'' +
                ", tagsUrl='" + tagsUrl + '\'' +
                ", teamsUrl='" + teamsUrl + '\'' +
                ", treesUrl='" + treesUrl + '\'' +
                ", cloneUrl='" + cloneUrl + '\'' +
                ", mirrorUrl='" + mirrorUrl + '\'' +
                ", hooksUrl='" + hooksUrl + '\'' +
                ", svnUrl='" + svnUrl + '\'' +
                ", homepage='" + homepage + '\'' +
                ", language=" + language +
                ", forksCount=" + forksCount +
                ", stargazersCount=" + stargazersCount +
                ", watchersCount=" + watchersCount +
                ", size=" + size +
                ", defaultBranch='" + defaultBranch + '\'' +
                ", openIssuesCount=" + openIssuesCount +
                ", isTemplate=" + isTemplate +
                ", topics=" + topics +
                ", hasIssues=" + hasIssues +
                ", hasProjects=" + hasProjects +
                ", hasWiki=" + hasWiki +
                ", hasPages=" + hasPages +
                ", hasDownloads=" + hasDownloads +
                ", archived=" + archived +
                ", disabled=" + disabled +
                ", visibility='" + visibility + '\'' +
                ", pushedAt='" + pushedAt + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", permissions=" + permissions +
                ", templateRepository=" + templateRepository +
                ", tempCloneToken='" + tempCloneToken + '\'' +
                ", subscribersCount=" + subscribersCount +
                ", networkCount=" + networkCount +
                ", license=" + license +
                '}';
    }
}
