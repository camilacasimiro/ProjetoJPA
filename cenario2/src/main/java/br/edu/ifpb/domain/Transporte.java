package br.edu.ifpb.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Transporte implements Serializable{

    @OneToOne
    private Carga carga;

    @OneToOne
    private Navio navio;

    @oneToMany
    private Produto produto;

    @Temporal(TemporalType.DATE)
    private Date data;

    private double valor;

    public Navio() {
    }

    public Transporte(Navio navio, Carga carga, Produto produto, Date data, double valor) {
        this.navio = navio;
        this.carga = carga;
        this.produto = produto;
        this.data = data;
        this.valor = valor;
    }

    public Navio getNavio() {
        return navio;
    }

    public void setNavio(Navio navio) {
        this.navio = navio;
    }

    public Carga getCarga() {
        return carga;
    }

    public void setCarga(Carga carga) {
        this.carga = carga;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Transporte{" +
                "navio=" + navio +
                ", carga=" + carga +
                ", produto=" + produto +
                ", data=" + data +
                ", valor=" + valor +
                '}';
    }
}