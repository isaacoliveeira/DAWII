package br.edu.ifpb.es.daw;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.edu.ifpb.es.daw.dao.ProjetoDAO;
import br.edu.ifpb.es.daw.dao.impl.ProjetoDAOImpl;
import br.edu.ifpb.es.daw.entities.Projeto.Projeto;
import br.edu.ifpb.es.daw.entities.Projeto.ProjetoGrande;
import br.edu.ifpb.es.daw.entities.Projeto.ProjetoPequeno;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainProjetoSave {

	public static void main(String[] args) throws DawException {
		try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("daw")) {
			ProjetoDAO dao = new ProjetoDAOImpl(emf);

			Projeto projeto = new Projeto();
			projeto.setNome("Nome do projeto");

			ProjetoGrande projetoGrande = new ProjetoGrande();
			projetoGrande.setNome("Projeto grande");
			projetoGrande.setOrcamento(new BigDecimal(100000));

			ProjetoPequeno projetoPequeno = new ProjetoPequeno();
			projetoPequeno.setNome("Projeto pequeno");
			projetoPequeno.setPrazoMaximoConclusao(LocalDate.now());

			ProjetoPequeno pequeno = new ProjetoPequeno();
			pequeno.setNome("Projeto Pequeno");
			pequeno.setPrazoMaximoConclusao(LocalDate.of(2025, 1, 21));

			ProjetoGrande grande = new ProjetoGrande();
			grande.setNome("Projeto Grande");
			grande.setOrcamento(new BigDecimal("1000000"));

			dao.save(pequeno);
			dao.save(grande);
			dao.save(projeto);
			dao.save(projetoGrande);
			dao.save(projetoPequeno);

			System.out.println("Projetos salvos com sucesso!");
		}
	}

}
