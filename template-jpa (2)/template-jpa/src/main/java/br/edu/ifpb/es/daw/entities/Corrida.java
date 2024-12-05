package br.edu.ifpb.es.daw.entities;

import jakarta.persistence.*;
import java.sql.Date;
import java.util.Map;
import java.util.Objects;


@Entity
@Table(name = "corrida")
public class Corrida {

    @Id
    @PrimaryKeyJoinColumn
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Date dataRealizacao;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusCorrida status;

    @ElementCollection //mapea coleções que nao sao entidades, por exemplo inteiro e string;
    @CollectionTable(name = "grid_largada", joinColumns = @JoinColumn(name = "corrida_id")) //define a taela que vai armazenar os dados
    @MapKeyColumn(name = "posicao") //sera a chave princial do map
    @Column(name = "nome_piloto")  //vali armazenar os valores dos nomes dos pilotos
    private Map<Integer, String> gridLargada;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(Date dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public StatusCorrida getStatus() {
        return status;
    }

    public void setStatus(StatusCorrida status) {
        this.status = status;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Corrida corrida = (Corrida) o;
        return Objects.equals(nome, corrida.nome) && Objects.equals(dataRealizacao, corrida.dataRealizacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, dataRealizacao);
    }

    @Override
    public String toString() {
        return "Corrida{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataRealizacao='" + dataRealizacao + '\'' +
                ", status=" + status +
                ", gridLargada=" + gridLargada +
                '}';
    }

    public Map<Integer, String> getGridLargada() {
        return gridLargada;
    }

    public void setGridLargada(Map<Integer, String> gridLargada) {
        this.gridLargada = gridLargada;
    }

}
