package com.upe.Papagaio_Post.entities;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Getter
@Setter
public class Comentario {
    
    @Id
    @GeneratedValue
    private UUID comentarioId;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "postId", nullable = false)
    private Post post;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "donoId", nullable = false)
    private Usuario dono;

    private String conteudo;

    private int curtida;

    private Date dataPublicacao;

}
