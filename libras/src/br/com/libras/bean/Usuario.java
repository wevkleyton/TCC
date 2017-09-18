//package br.com.libras.bean;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//
///**
// * Autor: Wev Kleyton
// * Data : 16/09/17
// * OBS: Para utilização do JPA a classe deve:
// *  - Ser anotada como javax.persistence.Entity
// *  - A classe deve ter um contrutor sem argumento
// *  - A classe assim como os metodos ou instancias de variaveis de persistencia, não pedem ser declaradas como "final"
// *  - Se uma classe e "passada" como valor em um objeto individual, ela deve ser implementada como "Serializable Interface"
// *  - Entities podem extender  classes definidas ou não como Entities. Tambem e possivel que classes que não são definidas como Entity extendam classes que são definidas
// *  como Entity
// *  - As variaveis que serão persistidas no banco de dados desem ser declaradas como private, protected ou packege-private e podem ser acessadas diretamente por seus
// *  metodos (getters e setters)
// */
//
//@Entity
//public class Usuario {
//
//    @Id
//    @GeneratedValue
//    private  Long id;
//    private String nome;
//    private String senha;
//
//    public Usuario(){
//        super();
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getSenha() {
//        return senha;
//    }
//
//    public void setSenha(String senha) {
//        this.senha = senha;
//    }
//}
