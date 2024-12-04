package br.edu.ifpb.es.daw.dao.impl;

import br.edu.ifpb.es.daw.dao.corridaDAO;
import br.edu.ifpb.es.daw.entities.Corrida;
import jakarta.persistence.EntityManagerFactory;

public class corridaDAoimpl extends AbstractDAOImpl<Corrida, Long> implements corridaDAO{
    
    public corridaDAoimpl(EntityManagerFactory emf) {
        super(Corrida.class, emf);
    }
}
