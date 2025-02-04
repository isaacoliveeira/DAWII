package br.edu.ifpb.es.daw.entities.Projeto;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("PEQUENA")
public class ProjetoPequeno extends Projeto {

    @Column(nullable = false)
    private LocalDate prazoMaximoConclusao;

    public ProjetoPequeno(){}

    public ProjetoPequeno(String nome, LocalDate prazoMaximoConclusao){
        super(nome) ;
        this.prazoMaximoConclusao = prazoMaximoConclusao;       
    }

    public LocalDate getPrazoMaximoConclusao() {
        return prazoMaximoConclusao;
    }

    public void setPrazoMaximoConclusao(LocalDate prazoMaximoConclusao) {
        this.prazoMaximoConclusao = prazoMaximoConclusao;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNome(),getPrazoMaximoConclusao());
    }

    @Override
    public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null || getClass() != obj.getClass())
        return false;
    if (!super.equals(obj))
        return false;

    ProjetoPequeno other = (ProjetoPequeno) obj;
    return Objects.equals(getNome(), other.getNome()) &&
           Objects.equals(prazoMaximoConclusao, other.prazoMaximoConclusao);
    }

    @Override
    public String toString(){
        return super.toString() + ", Projeto Pequeno [Prazo Máximo=" + prazoMaximoConclusao +"]";
    }
}
