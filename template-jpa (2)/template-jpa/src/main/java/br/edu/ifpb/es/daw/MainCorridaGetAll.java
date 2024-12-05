package br.edu.ifpb.es.daw;

import java.util.List;
import br.edu.ifpb.es.daw.dao.corridaDAO;
import br.edu.ifpb.es.daw.dao.impl.CorridaDAoimpl;
import br.edu.ifpb.es.daw.entities.Corrida;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainCorridaGetAll {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			corridaDAO dao = new CorridaDAoimpl(emf);
			List<Corrida> corrida = dao.getAll();

			for(Corrida corridas : corrida) {
				System.out.println(corridas);
			}
		}
	}
}
