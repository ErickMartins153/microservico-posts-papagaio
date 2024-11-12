package com.upe.Papagaio_Post.entities;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Getter
@Setter
public class Hashtag {
    
    @Id
    @GeneratedValue
    private UUID id;

    private String tag;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "postId", nullable = false)
    private Post post;


}
