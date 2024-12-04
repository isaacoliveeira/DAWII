package br.edu.ifpb.es.daw;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import br.edu.ifpb.es.daw.dao.corridaDAO;
import br.edu.ifpb.es.daw.dao.impl.corridaDAoimpl;
import br.edu.ifpb.es.daw.entities.Corrida;
import br.edu.ifpb.es.daw.entities.StatusCorrida;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainCorridaSave {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			corridaDAO dao = new corridaDAoimpl(emf);

			Corrida corrida = new Corrida();

			corrida.setNome("interlagos");
			corrida.setDataRealizacao(new Date(0));
			corrida.setStatus(StatusCorrida.AGENDADA);
			Map<Integer, String> map = new HashMap<>();
			map.put(1, "fernando alonso");
			map.put(2, "felipe massa");

			dao.save(corrida);

			System.out.println(corrida);

		}
	}

}
