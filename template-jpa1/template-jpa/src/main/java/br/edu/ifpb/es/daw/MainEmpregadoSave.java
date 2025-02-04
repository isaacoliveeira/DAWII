package br.edu.ifpb.es.daw;

import java.math.BigDecimal;

import br.edu.ifpb.es.daw.dao.EmpregadoDAO;
import br.edu.ifpb.es.daw.dao.impl.EmpregadoDAOImpl;
import br.edu.ifpb.es.daw.entities.Empregado.Empregado;
import br.edu.ifpb.es.daw.entities.Empregado.EmpregadoTempoIntegral;
import br.edu.ifpb.es.daw.entities.Empregado.EmpregadoTempoParcial;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainEmpregadoSave {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {			
			EmpregadoDAO dao = new EmpregadoDAOImpl(emf);

			Empregado empregado = new Empregado();
			empregado.setNome("isaac");

			EmpregadoTempoParcial etp = new EmpregadoTempoParcial();
			etp.setNome("Gaby");
			etp.setValorHora(new BigDecimal(62.50));

			EmpregadoTempoIntegral eti = new EmpregadoTempoIntegral();
			eti.setNome("luiz");
			eti.setSalario(new BigDecimal(5421.54));

			dao.save(empregado);
			dao.save(etp);
			dao.save(eti);

			System.out.println("salvos");

		}
	}
}
