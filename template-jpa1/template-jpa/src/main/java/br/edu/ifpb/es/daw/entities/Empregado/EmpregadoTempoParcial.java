package br.edu.ifpb.es.daw.entities.Empregado;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("TEMPO PARCIAL")
public class EmpregadoTempoParcial extends Empregado {
    
    @Column
    public BigDecimal valorHora;

    public EmpregadoTempoParcial(){}

    public EmpregadoTempoParcial(String nome, BigDecimal valorHora) {
        super(nome);
        this.valorHora = valorHora;
    }

    public BigDecimal getValorHora() {
        return valorHora;
    }

    public void setValorHora(BigDecimal valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.toString() ,valorHora);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
        return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        if (!super.equals(obj))
            return false;

    EmpregadoTempoParcial other = (EmpregadoTempoParcial) obj;
        return Objects.equals(valorHora, other.valorHora);
    }

    @Override
    public String toString() {
        return  super.toString() + ", EmpregadoTempoParcial [valorHora=" + valorHora + "]";
    }

    
}
