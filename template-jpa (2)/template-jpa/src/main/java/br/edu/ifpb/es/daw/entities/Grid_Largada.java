package br.edu.ifpb.es.daw.entities;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "grid_largada")
public class Grid_Largada implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer posicao;

    @Column(name = "nome_piloto",nullable = false)
    private String nome_piloto;

    @ManyToOne
    @JoinColumn(name = "corrida_id", nullable = false)
    private Corrida corrida;

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

    public Corrida getCorrida() {
        return corrida;
    }

    public void setCorrida(Corrida corrida) {
        this.corrida = corrida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grid_Largada that = (Grid_Largada) o;
        return Objects.equals(posicao, that.posicao) && Objects.equals(corrida, that.corrida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(posicao, corrida);
    }
}
