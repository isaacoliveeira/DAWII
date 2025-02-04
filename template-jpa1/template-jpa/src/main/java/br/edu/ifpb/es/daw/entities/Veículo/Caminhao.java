package br.edu.ifpb.es.daw.entities.Veículo;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("TRANSPORTE")
public class Caminhao extends VeiculoDeTransporte{

    @Column
    public Integer numeroDeVagoes;

    public Caminhao() {}

    public Caminhao(String nome, String construtora, Integer cargaMaximaKG, Integer numeroDeVagoes) {
        super(nome , construtora, cargaMaximaKG);
        this.numeroDeVagoes = numeroDeVagoes;
    }

    public Integer getNumeroDeVagoes() {
        return numeroDeVagoes;
    }

    public void setNumeroDeVagoes(Integer numeroDeVagoes) {
        this.numeroDeVagoes = numeroDeVagoes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.toString(), numeroDeVagoes);
    }

    @Override
    public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null || getClass() != obj.getClass())
        return false;
    if (!super.equals(obj))
        return false;

    Caminhao other = (Caminhao) obj;
    return Objects.equals(cargaMaximaKG, other.cargaMaximaKG);

    }

    @Override
    public String toString() {
        return super.toString() + ", Caminhao [numeroDeVagoes=" + numeroDeVagoes + "]";
    }   

    

}