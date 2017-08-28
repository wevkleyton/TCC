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


}
