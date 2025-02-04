package br.edu.ifpb.es.daw;

import br.edu.ifpb.es.daw.dao.VeiculoDAO;
import br.edu.ifpb.es.daw.dao.impl.VeiculoDAOImpl;
import br.edu.ifpb.es.daw.entities.Veículo.Bicicleta;
import br.edu.ifpb.es.daw.entities.Veículo.Caminhao;
import br.edu.ifpb.es.daw.entities.Veículo.Carro;
import br.edu.ifpb.es.daw.entities.Veículo.Veiculo;
import br.edu.ifpb.es.daw.entities.Veículo.VeiculoDePassageiro;
import br.edu.ifpb.es.daw.entities.Veículo.VeiculoDeTransporte;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainVeículoSave {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			VeiculoDAO dao = new VeiculoDAOImpl(emf);

			Veiculo veiculo = new Veiculo();
			veiculo.setNome("Veiculo");
			veiculo.setConstrutora("Scania");

			VeiculoDePassageiro veiculoDePassageiro = new VeiculoDePassageiro();
			veiculoDePassageiro.setNome("Veiculo passageiro");
			veiculoDePassageiro.setConstrutora("Scania");
			veiculoDePassageiro.setNumeroMaximoPassageiro(15);

			VeiculoDeTransporte veiculoDeTransporte = new VeiculoDeTransporte();
			veiculoDeTransporte.setNome("D20");
			veiculoDeTransporte.setConstrutora("volksvagen");
			veiculoDeTransporte.setCargaMaximaKG(1200);

			Caminhao caminhao = new Caminhao();
			caminhao.setNome("710");
			caminhao.setConstrutora("Mercedes");
			caminhao.setCargaMaximaKG(7000);
			caminhao.setNumeroDeVagoes(3);

			Carro carro = new Carro();
			carro.setNome("sandero");
			carro.setConstrutora("renault");
			carro.setNumeroMaximoPassageiro(5);
			carro.setNumeroDePortas(4);

			Bicicleta bicicleta = new Bicicleta();
			bicicleta.setNome("Caloi");
			bicicleta.setConstrutora("Caloi");
			bicicleta.setAlturaDoSelimEmCm(55);

			dao.save(caminhao);
			dao.save(carro);
			dao.save(bicicleta);
			dao.save(veiculo);
			dao.save(veiculoDePassageiro);
			dao.save(veiculoDeTransporte);

			System.out.println("Veiculos salvos");			
		}
	}

}
