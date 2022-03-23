package br.edu.ifpb.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Jennifer
 */
@Entity
public class Ator implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sexo;
    private String nascionalidade;

    @OneToMany
    private Ator ator;

    public Ator() {
    }

    public Ator(String nome, String sexo, String nascionalidade) {
        this.nome = nome;
        this.sexo = sexo;
        this.nascionalidade = nascionalidade;
    }

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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNascionalidade() {
        return nascionalidade;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }
}
