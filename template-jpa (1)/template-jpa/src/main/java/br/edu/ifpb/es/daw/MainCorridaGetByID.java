package br.edu.ifpb.es.daw;

import java.sql.Date;
import java.time.LocalDate;

import br.edu.ifpb.es.daw.dao.corridaDAO;
import br.edu.ifpb.es.daw.dao.impl.corridaDAoimpl;
import br.edu.ifpb.es.daw.entities.Corrida;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainCorridaGetByID {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			corridaDAO dao = new corridaDAoimpl(emf);

			Corrida corrida = new Corrida();

			corrida.setNome("interlagos");
			corrida.setStatus(null);
			
		}
	}

}
