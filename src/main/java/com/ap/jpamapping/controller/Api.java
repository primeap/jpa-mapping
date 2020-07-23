package com.ap.jpamapping.controller;

import com.ap.jpamapping.model.Post;
import com.ap.jpamapping.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Api {

    @Autowired
    PostRepo repo;
    @RequestMapping("/api")
    public @ResponseBody
    List<Post> greeting() {
        return repo.getPost();
    }
}
