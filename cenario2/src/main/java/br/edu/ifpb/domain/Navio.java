package br.edu.ifpb.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Navio implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int capacidade;
    private String pais;

    @OneToOne
    private Comandante comandante;

    public Navio() {
    }

    public Navio(Long id, String nome, int capacidade, String pais, Comandante comandante) {
        this.id = id;
        this.nome = nome;
        this.capacidade = capacidade;
        this.pais = pais;
        this.comandante = comandante;
    }

    public Long getCodNavio() {
        return id;
    }

    public void setCodNavio(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Comandante getComandante() {
        return comandante;
    }

    public void setComandante(Comandante comandante) {
        this.comandante = comandante;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Navio navio = (Navio) object;
        return java.util.Objects.equals(id, navio.id);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Navio{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", capacidade=" + capacidade +
                ", pais='" + pais + '\'' +
                ", comandante=" + comandante +
                '}';
    }
}