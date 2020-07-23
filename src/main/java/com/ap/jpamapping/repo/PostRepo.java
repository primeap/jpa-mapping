package com.ap.jpamapping.repo;

import com.ap.jpamapping.model.Post;
import com.ap.jpamapping.model.PostKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepo extends JpaRepository<Post, PostKey> {
    @Query("SELECT p  from Post p Join p.comment c WHERE p.key.platformId=1 AND p.title='TL' ")
    public List<Post> getPost();

}
