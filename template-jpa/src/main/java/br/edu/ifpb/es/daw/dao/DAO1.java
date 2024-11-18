package br.edu.ifpb.es.daw.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public abstract class DAO1 {

	private EntityManagerFactory emf;

	public DAO1(EntityManagerFactory emf) {
		this.emf = emf;
	}

	protected EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

}
