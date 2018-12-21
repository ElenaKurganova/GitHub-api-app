package com.example.se.githubapiapp.services;

import com.example.se.githubapiapp.Repo;

public interface RepoService {

    Repo[] getReposList();

    Repo getByName(String name);
}
