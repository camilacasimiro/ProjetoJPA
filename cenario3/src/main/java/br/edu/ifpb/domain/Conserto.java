package br.edu.ifpb.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Conserto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double valor;

    @Temporal(TemporalType.DATE)
    private Date dataConserto;

    @OneToMany
    private List<Funcionario> funcionario;

    @ManyToOne
    private Oficina oficina;

    public Conserto() {

    }

    public Conserto(double valor, Date dataConserto, List<Funcionario> funcionario, Oficina oficina) {
        this.valor = valor;
        this.dataConserto = dataConserto;
        this.funcionario = funcionario;
        this.oficina = oficina;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataConserto() {
        return dataConserto;
    }

    public void setDataConserto(Date dataConserto) {
        this.dataConserto = dataConserto;
    }

    public List<Funcionario> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(List<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conserto conserto = (Conserto) o;
        return Objects.equals(id, conserto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
