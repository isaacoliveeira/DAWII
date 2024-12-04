package br.edu.ifpb.es.daw.entities;

import jakarta.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "CORRIDAS")
public class Corrida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Date dataRealizacao;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusCorrida status;

    @OneToMany(mappedBy = "corrida", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GRID_LARGADA> gridLargada;

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

    public List<GRID_LARGADA> getGridLargada() {
        return gridLargada;
    }

    public void setGridLargada(List<GRID_LARGADA> gridLargada) {
        this.gridLargada = gridLargada;
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
}
