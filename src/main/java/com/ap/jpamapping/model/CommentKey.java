package com.ap.jpamapping.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;


@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CommentKey implements Serializable {
    @Column(name="COMMENT_FROM")
    private String commentFrom;
    @Column(name="COMMENT_TO")
    private String commentTo;
}
