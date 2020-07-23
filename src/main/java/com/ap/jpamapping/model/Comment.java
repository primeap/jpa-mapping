package com.ap.jpamapping.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.tomcat.jni.Address;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="COMMENTS")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Comment implements Serializable {
    @EmbeddedId
    private CommentKey key;

    @Column(name="COMMENT")
    private String comment;

    @OneToOne
    @JoinColumns({
            @JoinColumn(name="POST_PLATFORM", referencedColumnName="PLATFORM"),
            @JoinColumn(name="POST_USER_ID", referencedColumnName="USER_ID")
    })
    private Post post;

}
