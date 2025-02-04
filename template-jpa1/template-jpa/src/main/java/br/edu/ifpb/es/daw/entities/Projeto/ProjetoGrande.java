package br.edu.ifpb.es.daw.entities.Projeto;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("GRANDE")
public class ProjetoGrande extends Projeto {
    
    @Column(nullable = false)
    private BigDecimal orcamento;

    public ProjetoGrande(){

    }

    public ProjetoGrande(String nome, BigDecimal orcamento){
        super(nome);
        this.orcamento = orcamento;
    }

    public BigDecimal getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(BigDecimal orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNome(), getOrcamento());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        if (!super.equals(obj))
            return false;
        
        ProjetoGrande other = (ProjetoGrande) obj;
        return Objects.equals(getNome(), other.getNome()) &&
               Objects.equals(orcamento, other.orcamento);
    }

    @Override
    public String toString() {
        return super.toString() + ", ProjetoGrande [orcamento=" + orcamento + "]";
    }   

}
