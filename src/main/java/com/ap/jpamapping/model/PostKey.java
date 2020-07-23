package com.ap.jpamapping.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class PostKey implements Serializable {
    @Column(name="PLATFORM")
    private int platformId;
    @Column(name="USER_ID")
    private String userId;
}
