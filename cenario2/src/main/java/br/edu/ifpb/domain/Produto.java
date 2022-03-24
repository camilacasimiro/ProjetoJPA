package br.edu.ifpb.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Produto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String categoria;
    private String nome;

    public Produto() {
    }

    public Produto(Long id, String categoria, String nome) {
        this.id = id;
        this.categoria = categoria;
        this.nome = nome;
    }

    public Long getCodProduto() {
        return id;
    }

    public void setCodProduto(Long id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Produto produto = (Produto) object;
        return java.util.Objects.equals(id, produto.id);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Produto{" +
                "id=" + id +
                ", categoria='" + categoria + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}