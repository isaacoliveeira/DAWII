package br.edu.ifpb.es.daw.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "GRIDS_LARGADA")
public class GRID_LARGADA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "corrida_id", nullable = false)
    private Corrida corrida;
    
    @Column(name = "posicao", nullable = false)
    private Integer posicao;

    @Column(name = "nome_do_piloto", nullable = false)
    private String nome_piloto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    public String getNome_piloto() {
        return nome_piloto;
    }

    public void setNome_piloto(String nome_piloto) {
        this.nome_piloto = nome_piloto;
    }



    public String toString() {
        return "GridLargada{" +
               "id=" + id +
               ", posicao=" + posicao +
               ", nomePiloto='" + nome_piloto + '\'' +
               '}';
    }

    public Corrida getCorrida() {
        return corrida;
    }

    public void setCorrida(Corrida corrida) {
        this.corrida = corrida;
    }
 
}
