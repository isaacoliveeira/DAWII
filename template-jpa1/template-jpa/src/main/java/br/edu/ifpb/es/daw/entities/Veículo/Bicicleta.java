package br.edu.ifpb.es.daw.entities.Veículo;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("PASSAGEIRO")
public class Bicicleta extends VeiculoDePassageiro {

    @Column
    public Integer alturaDoSelimEmCm;

    public Bicicleta() {

    }

    public Bicicleta(String nome, String construtora, Integer numeroMaximoPassageiro , Integer alturaDoSelimEmCm) {
        super(nome, construtora, numeroMaximoPassageiro);
        this.alturaDoSelimEmCm = alturaDoSelimEmCm;
    }

    public Integer getAlturaDoSelimEmCm() {
        return alturaDoSelimEmCm;
    }

    public void setAlturaDoSelimEmCm(Integer alturaDoSelimEmCm) {
        this.alturaDoSelimEmCm = alturaDoSelimEmCm;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.toString(), alturaDoSelimEmCm);
    }

    @Override
    public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null || getClass() != obj.getClass())
        return false;
    if (!super.equals(obj))
        return false;

    Bicicleta other = (Bicicleta) obj;
    return Objects.equals(alturaDoSelimEmCm, other.alturaDoSelimEmCm);

    }

    @Override
    public String toString() {
        return super.toString() + ", Bicicleta [alturaDoSelimEmCm=" + alturaDoSelimEmCm + "]";
    }

    
    
}
