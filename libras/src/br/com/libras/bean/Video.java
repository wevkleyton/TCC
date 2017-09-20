package br.com.libras.bean;

import org.hibernate.annotations.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
  * Autor: Wev Kleyton 27/08/2017
  * OBS: Para utilização do JPA a classe deve:
 *  - Ser anotada como javax.persistence.Entity
 *  - A classe deve ter um contrutor sem argumento
 *  - A classe assim como os metodos ou instancias de variaveis de persistencia, não pedem ser declaradas como "final"
 *  - Se uma classe e "passada" como valor em um objeto individual, ela deve ser implementada como "Serializable Interface"
 *  - Entities podem extender  classes definidas ou não como Entities. Tambem e possivel que classes que não são definidas como Entity extendam classes que são definidas
 *  como Entity
 *  - As variaveis que serão persistidas no banco de dados desem ser declaradas como private, protected ou packege-private e podem ser acessadas diretamente por seus
 *  metodos (getters e setters)
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
