package com.upe.Papagaio_Post.entities;

import java.sql.Date;
import java.util.List;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Getter
@Setter
public class Post {
    
    @Id
    @GeneratedValue
    private UUID postId;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "donoId", nullable = false)
    private Usuario dono;

    private String titulo;
    
    private String conteudo;
    
    private int curtida;

    @ElementCollection
    private List<String> hashtag;

    private Date dataPublicacao;

    @JsonIgnore   @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comentario> comentarios;

}
