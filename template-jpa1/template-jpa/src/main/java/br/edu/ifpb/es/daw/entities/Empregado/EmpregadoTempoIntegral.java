package br.edu.ifpb.es.daw.entities.Empregado;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("TEMPO INTEGRAL")
public class EmpregadoTempoIntegral extends Empregado {
    
    @Column
    private BigDecimal salario;

    public EmpregadoTempoIntegral(){}

    public EmpregadoTempoIntegral(String nome, BigDecimal salario) {
        super(nome);
        this.salario = salario;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salario);
    }

    @Override
    public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null || getClass() != obj.getClass())
        return false;
    if (!super.equals(obj))
        return false;

    EmpregadoTempoIntegral other = (EmpregadoTempoIntegral) obj;
        return Objects.equals(salario, other.salario);
    }

    @Override
    public String toString() {
        return super.toString() + ", EmpregadoTempoIntegral [salario=" + salario + "]";
    }

}
