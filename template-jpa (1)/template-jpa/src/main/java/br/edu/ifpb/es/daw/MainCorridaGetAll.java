package br.edu.ifpb.es.daw;

import java.util.List;

import br.edu.ifpb.es.daw.dao.corridaDAO;
import br.edu.ifpb.es.daw.dao.impl.corridaDAoimpl;
import br.edu.ifpb.es.daw.entities.Corrida;
import br.edu.ifpb.es.daw.entities.GRID_LARGADA;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainCorridaGetAll {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			corridaDAO dao = new corridaDAoimpl(emf);
				List<Corrida> corrida = dao.getAll();	

				for (Corrida corridas : corrida){
					System.err.println(corridas);
				}
			
		}
	}
}
