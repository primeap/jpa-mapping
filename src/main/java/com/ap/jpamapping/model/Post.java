package com.ap.jpamapping.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.tomcat.jni.Address;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "POSTS")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Post implements Serializable {
    @EmbeddedId
    private PostKey key;

    @Column(name="TITLE")
    private String title;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "post")
    private Comment comment;

}

