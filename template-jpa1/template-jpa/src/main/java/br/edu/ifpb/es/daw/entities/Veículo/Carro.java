package br.edu.ifpb.es.daw.entities.Veículo;

import java.util.Objects;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("PASSAGEIRO")
public class Carro extends VeiculoDePassageiro {
    
    @Column
    public Integer numeroDePortas;

    public Carro() {}

    public Carro(String nome, String construtora, Integer numeroMaximoPassageiro, Integer numeroDePortas ) {
        super(nome, construtora, numeroMaximoPassageiro);
        this.numeroDePortas = numeroDePortas;
    }

    public Integer getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(Integer numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.toString(), numeroDePortas);
    }

    @Override
    public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null || getClass() != obj.getClass())
        return false;
    if (!super.equals(obj))
        return false;

    Carro other = (Carro) obj;
    return Objects.equals(numeroDePortas, other.numeroDePortas);

    }


    @Override
    public String toString() {
        return super.toString() + ", Carro [numeroDePortas=" + numeroDePortas + "]";
    }

    
}
