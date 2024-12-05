package br.edu.ifpb.es.daw;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import br.edu.ifpb.es.daw.dao.corridaDAO;
import br.edu.ifpb.es.daw.dao.impl.CorridaDAoimpl;
import br.edu.ifpb.es.daw.entities.Corrida;
import br.edu.ifpb.es.daw.entities.StatusCorrida;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainCorridaSave {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			corridaDAO dao = new CorridaDAoimpl(emf);

			Corrida corrida = new Corrida();

			corrida.setNome("Interlagos");
			corrida.setDataRealizacao(Date.valueOf("2024-12-05"));
			corrida.setStatus(StatusCorrida.AGENDADA);
			Map<Integer, String> grids = new HashMap<>();
			grids.put(1, "isaac");
			grids.put(2, "luiz");
			grids.put(3, "felipe massaa");
			
			corrida.setGridLargada(grids);
			
			dao.save(corrida);

			System.out.println(corrida);

		}
	}

}
