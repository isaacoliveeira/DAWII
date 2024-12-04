package br.edu.ifpb.es.daw;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainCorridaDeleteAll {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			// TODO
		}
	}

}
