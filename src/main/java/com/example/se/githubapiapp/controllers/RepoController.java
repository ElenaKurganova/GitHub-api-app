package com.example.se.githubapiapp.controllers;

import com.example.se.githubapiapp.Repo;
import com.example.se.githubapiapp.services.RepoService;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class RepoController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RepoService repoService;

    @RequestMapping(
            value = "/repos",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<Repo[]> getRepos() {
        Repo[] repos = repoService.getReposList();

        if (repos.length == 0) {
            return new ResponseEntity<Repo[]>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Repo[]>(repos, HttpStatus.OK);
    }


    @RequestMapping("/repos/{name}")
    public ResponseEntity<Repo> getRepoByName(@PathVariable(value = "name") String name) {
        Repo repo = repoService.getByName(name);
        if (repo == null) {
            return new ResponseEntity<Repo>(HttpStatus.NOT_FOUND);
        }
        logger.info("getRepoByName");
        return new ResponseEntity<Repo>(repo, HttpStatus.OK);
    }
}


