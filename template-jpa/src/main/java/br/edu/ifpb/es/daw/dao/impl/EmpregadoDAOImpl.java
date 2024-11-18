package br.edu.ifpb.es.daw.dao.impl;

import java.util.List;

import br.edu.ifpb.es.daw.dao.DAO1;
import br.edu.ifpb.es.daw.dao.EmpregradoDAO;
import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.entities.Empregado;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Id;
import jakarta.persistence.PersistenceException;
import jakarta.persistence.TypedQuery;

public class EmpregadoDAOImpl extends DAO1 implements EmpregradoDAO {
    
    public EmpregadoDAOImpl(EntityManagerFactory emf) {
            super(emf);
    }

    @Override
    public void save(Empregado empregado) throws PersistenciaDawException {
        try(EntityManager em = getEntityManager()){
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            try {
                em.persist(empregado);
                transaction.commit();
            } catch (PersistenceException pe) {
                pe.printStackTrace();
                if(transaction.isActive()) {
                    transaction.rollback();
                }
                throw new PersistenciaDawException("Erro ao tentar salvar empregado", pe);
            }
        }
    }

    @Override
    public Empregado update(Empregado empregado) throws PersistenciaDawException {
        try (EntityManager em = getEntityManager()) {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            Empregado resultado = empregado;
            try {
                resultado = em.merge(empregado);
                transaction.commit();
            } catch (PersistenceException pe) {
                pe.printStackTrace();
                if (transaction.isActive()) {
                    transaction.rollback();
                }
                throw new PersistenciaDawException("Erro ao atualizar usurio", pe);
            }
            return resultado;
        }
    }

    @Override
    public void delete(Integer id) throws PersistenciaDawException {
        try(EntityManager em = getEntityManager()) {
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			try {
				Empregado empregado = em.find(Empregado.class, id );
				em.remove(empregado);
				transaction.commit();
			} catch (PersistenceException pe) {
				pe.printStackTrace();
				if (transaction.isActive()) {
					transaction.rollback();
				}
				throw new PersistenciaDawException("Ocorreu algum erro ao tentar remover o usuário.", pe);
			}
		}
    }

    @Override
    public Empregado getById(Integer empregadoId) throws PersistenciaDawException {
        try(EntityManager em = getEntityManager()) {
			Empregado resultado = null;
			try {
				resultado = em.find(Empregado.class, empregadoId);
			} catch (PersistenceException pe) {
				pe.printStackTrace();
				throw new PersistenciaDawException("Ocorreu algum erro ao tentar recuperar o usuário com base no ID.", pe);
			}
			return resultado;
		}
    }

    @Override
    public List<Empregado> getAll() throws PersistenciaDawException {
        		try(EntityManager em = getEntityManager()) {
			List<Empregado> resultado = null;
			try {
				TypedQuery<Empregado> query = em.createQuery("SELECT u FROM UserST u", Empregado.class);
				resultado = query.getResultList();
			} catch (PersistenceException pe) {
				pe.printStackTrace();
				throw new PersistenciaDawException("Ocorreu algum erro ao tentar recuperar todos os usuários.", pe);
			}
			return resultado;
		}
    }
}
