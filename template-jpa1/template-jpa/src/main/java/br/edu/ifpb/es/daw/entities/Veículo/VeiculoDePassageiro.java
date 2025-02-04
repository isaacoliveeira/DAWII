package br.edu.ifpb.es.daw.entities.Veículo;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("PASSAGEIRO")
public class VeiculoDePassageiro extends Veiculo {
    
    @Column
    public Integer numeroMaximoPassageiro;

    public VeiculoDePassageiro(){}

    public VeiculoDePassageiro(String nome, String construtora, Integer numeroMaximoPassageiro) {
        super(nome, construtora);
        this.numeroMaximoPassageiro =numeroMaximoPassageiro;
    }

    public Integer getNumeroMaximoPassageiro() {
        return numeroMaximoPassageiro;
    }

    public void setNumeroMaximoPassageiro(Integer numeroMaximoPassageiro) {
        this.numeroMaximoPassageiro = numeroMaximoPassageiro;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.toString(), numeroMaximoPassageiro);
    }

    @Override
    public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null || getClass() != obj.getClass())
        return false;
    if (!super.equals(obj))
        return false;

    VeiculoDePassageiro other = (VeiculoDePassageiro) obj;
    return Objects.equals(numeroMaximoPassageiro, other.numeroMaximoPassageiro);
    
    }


    @Override
    public String toString() {
        return super.toString() + ",VeiculoDePassageiro [numeroMaximoPassageiro=" + numeroMaximoPassageiro + "]";
    }
}