package com.example.se.githubapiapp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Repo {

    private String id;
    private String name;
    private String privacy;
    private Owner owner;
    private String html_url;
    private String description;
    private Date created_at;
    private Date updated_at;
    private String language;
    private String license;
    private int forks;
    private int size;
    private boolean isPrivate;

    public Repo() {
    }

    public Repo(String id, String name, String privacy, Owner owner, String html_url, String description, Date created_at, Date updated_at, String language, String license, int forks, int size, boolean isPrivate) {
        this.id = id;
        this.name = name;
        this.privacy = privacy;
        this.owner = owner;
        this.html_url = html_url;
        this.description = description;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.language = language;
        this.license = license;
        this.forks = forks;
        this.size = size;
        this.isPrivate = isPrivate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public int getForks() {
        return forks;
    }

    public void setForks(int forks) {
        this.forks = forks;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    @Override
    public String toString() {
        return "Repo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", privacy='" + privacy + '\'' +
                ", owner=" + owner +
                ", html_url='" + html_url + '\'' +
                ", description='" + description + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", language='" + language + '\'' +
                ", license='" + license + '\'' +
                ", forks=" + forks +
                ", size=" + size +
                ", isPrivate=" + isPrivate +
                '}';
    }
}

