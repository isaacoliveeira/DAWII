package br.edu.ifpb.es.daw;

import java.util.List;

import br.edu.ifpb.es.daw.dao.impl.VeiculoDAOImpl;
import br.edu.ifpb.es.daw.entities.Veículo.Veiculo;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainVeículoDeleteAll {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			VeiculoDAOImpl dao = new VeiculoDAOImpl(emf);

			List<Veiculo> veiculos = dao.getAll();

			for (Veiculo veiculo : veiculos) {
				dao.delete(veiculo.getId());
			}

			System.out.println("Todos os projetos foram removidos com sucesso.");
		}
	}

}
