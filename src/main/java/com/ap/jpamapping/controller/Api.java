package com.ap.jpamapping.controller;

import com.ap.jpamapping.model.Comment;
import com.ap.jpamapping.model.CommentKey;
import com.ap.jpamapping.model.Post;
import com.ap.jpamapping.model.PostKey;
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



//       Post post = Post.builder().key( PostKey.builder().platformId(1).userId("AP").build() )
//             .title("TL").
//               comment(
//                       Comment.builder().comment("FST-CMT").key(CommentKey.builder().commentFrom("X").commentTo("Y").build())
//                               .build()
//               ).build();
//
//        repo.save(post);