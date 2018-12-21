package com.example.se.githubapiapp;

import java.util.ArrayList;
import java.util.List;

public class RepoList {

    private List<Repo> repos;

    public RepoList() {
        repos = new ArrayList<>();
    }

    public List<Repo> getRepos() {
        return repos;
    }

    public void setRepos(List<Repo> repos) {
        this.repos = repos;
    }
}
