package br.edu.ifpb.es.daw.entities.Veículo;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("TRANSPORTE")
public class VeiculoDeTransporte extends Veiculo {
    
    @Column
    public Integer cargaMaximaKG;

    public VeiculoDeTransporte() {}

    public VeiculoDeTransporte(String nome, String construtora, Integer cargaMaximaKG){
        super(nome, construtora);
        this.cargaMaximaKG = cargaMaximaKG;
    }

    public Integer getCargaMaximaKG() {
        return cargaMaximaKG;
    }

    public void setCargaMaximaKG(Integer cargaMaximaKG) {
        this.cargaMaximaKG = cargaMaximaKG;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((cargaMaximaKG == null) ? 0 : cargaMaximaKG.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null || getClass() != obj.getClass())
        return false;
    if (!super.equals(obj))
        return false;

    VeiculoDeTransporte other = (VeiculoDeTransporte) obj;
    return Objects.equals(cargaMaximaKG, other.cargaMaximaKG);
    
    }

    @Override
    public String toString() {
        return super.toString() + ", VeiculoDeTransporte [cargaMaximaKG=" + cargaMaximaKG + "]";
    }

    
    
}
