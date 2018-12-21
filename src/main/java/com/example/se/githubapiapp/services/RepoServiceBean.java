package com.example.se.githubapiapp.services;

import com.example.se.githubapiapp.Repo;
import com.example.se.githubapiapp.RepoList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class RepoServiceBean implements RepoService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private String url = "https://api.github.com/";
    /**
     * The RestTemplate used to retrieve data from the remote Quote API.
     */
    private final RestTemplate restTemplate;

    public RepoServiceBean(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public Repo[] getReposList() {
        logger.info("getReposList");
        Repo[] response = restTemplate.getForObject(url + "users/ElenaKurganova/repos", Repo[].class);
        return response;
    }

    public Repo getByName(String name) {
        logger.info(name);
        Repo response = restTemplate.getForObject(url + "repos/ElenaKurganova/" + name, Repo.class, name);
        return response;
    }
}

