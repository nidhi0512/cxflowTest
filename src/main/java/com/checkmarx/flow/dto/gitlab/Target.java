
package com.checkmarx.flow.dto.gitlab;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "description",
    "web_url",
    "avatar_url",
    "git_ssh_url",
    "git_http_url",
    "namespace",
    "visibility_level",
    "path_with_namespace",
    "default_branch",
    "homepage",
    "url",
    "ssh_url",
    "http_url"
})
public class Target {

    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("web_url")
    private String webUrl;
    @JsonProperty("avatar_url")
    private Object avatarUrl;
    @JsonProperty("git_ssh_url")
    private String gitSshUrl;
    @JsonProperty("git_http_url")
    private String gitHttpUrl;
    @JsonProperty("namespace")
    private String namespace;
    @JsonProperty("visibility_level")
    private Integer visibilityLevel;
    @JsonProperty("path_with_namespace")
    private String pathWithNamespace;
    @JsonProperty("default_branch")
    private String defaultBranch;
    @JsonProperty("homepage")
    private String homepage;
    @JsonProperty("url")
    private String url;
    @JsonProperty("ssh_url")
    private String sshUrl;
    @JsonProperty("http_url")
    private String httpUrl;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Target withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Target withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("web_url")
    public String getWebUrl() {
        return webUrl;
    }

    @JsonProperty("web_url")
    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public Target withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    @JsonProperty("avatar_url")
    public Object getAvatarUrl() {
        return avatarUrl;
    }

    @JsonProperty("avatar_url")
    public void setAvatarUrl(Object avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Target withAvatarUrl(Object avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    @JsonProperty("git_ssh_url")
    public String getGitSshUrl() {
        return gitSshUrl;
    }

    @JsonProperty("git_ssh_url")
    public void setGitSshUrl(String gitSshUrl) {
        this.gitSshUrl = gitSshUrl;
    }

    public Target withGitSshUrl(String gitSshUrl) {
        this.gitSshUrl = gitSshUrl;
        return this;
    }

    @JsonProperty("git_http_url")
    public String getGitHttpUrl() {
        return gitHttpUrl;
    }

    @JsonProperty("git_http_url")
    public void setGitHttpUrl(String gitHttpUrl) {
        this.gitHttpUrl = gitHttpUrl;
    }

    public Target withGitHttpUrl(String gitHttpUrl) {
        this.gitHttpUrl = gitHttpUrl;
        return this;
    }

    @JsonProperty("namespace")
    public String getNamespace() {
        return namespace;
    }

    @JsonProperty("namespace")
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public Target withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    @JsonProperty("visibility_level")
    public Integer getVisibilityLevel() {
        return visibilityLevel;
    }

    @JsonProperty("visibility_level")
    public void setVisibilityLevel(Integer visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
    }

    public Target withVisibilityLevel(Integer visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
        return this;
    }

    @JsonProperty("path_with_namespace")
    public String getPathWithNamespace() {
        return pathWithNamespace;
    }

    @JsonProperty("path_with_namespace")
    public void setPathWithNamespace(String pathWithNamespace) {
        this.pathWithNamespace = pathWithNamespace;
    }

    public Target withPathWithNamespace(String pathWithNamespace) {
        this.pathWithNamespace = pathWithNamespace;
        return this;
    }

    @JsonProperty("default_branch")
    public String getDefaultBranch() {
        return defaultBranch;
    }

    @JsonProperty("default_branch")
    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public Target withDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
        return this;
    }

    @JsonProperty("homepage")
    public String getHomepage() {
        return homepage;
    }

    @JsonProperty("homepage")
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public Target withHomepage(String homepage) {
        this.homepage = homepage;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Target withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("ssh_url")
    public String getSshUrl() {
        return sshUrl;
    }

    @JsonProperty("ssh_url")
    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public Target withSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
        return this;
    }

    @JsonProperty("http_url")
    public String getHttpUrl() {
        return httpUrl;
    }

    @JsonProperty("http_url")
    public void setHttpUrl(String httpUrl) {
        this.httpUrl = httpUrl;
    }

    public Target withHttpUrl(String httpUrl) {
        this.httpUrl = httpUrl;
        return this;
    }

}
