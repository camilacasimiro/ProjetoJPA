package br.edu.ifpb.infra;

import br.edu.ifpb.domain.Conserto;

import javax.ejb.Stateless;
import javax.persistence.*;
import java.util.List;

@Stateless
public class ConsertoDAO {

    @PersistenceContext
    private EntityManager manager;

    public Conserto salvar(Conserto conserto){
        manager.persist(conserto);
        return conserto;
    }

    public void remover(Conserto conserto){
         manager.remove(conserto);
    }

}
