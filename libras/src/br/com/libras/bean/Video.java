package br.com.libras.bean;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.lang.annotation.Retention;

/**
 * Autor: Wev Kleyton 27/08/2017
 * Criação do Bean de Video
 */

@Entity
public class Video {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;
    private byte imagen;
    private byte video;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getImagen() {
        return imagen;
    }

    public void setImagen(byte imagen) {
        this.imagen = imagen;
    }

    public byte getVideo() {
        return video;
    }

    public void setVideo(byte video) {
        this.video = video;
    }
}
