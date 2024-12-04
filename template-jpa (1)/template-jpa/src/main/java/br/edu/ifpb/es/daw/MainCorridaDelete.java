package br.edu.ifpb.es.daw;

import br.edu.ifpb.es.daw.dao.corridaDAO;
import br.edu.ifpb.es.daw.dao.impl.corridaDAoimpl;
import br.edu.ifpb.es.daw.entities.GRID_LARGADA;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainCorridaDelete {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			corridaDAO dao = new corridaDAoimpl(emf);

			GRID_LARGADA grid_largada = new GRID_LARGADA();

			
		}
	}

}
