package br.edu.ifpb.es.daw.dao;

import java.util.List;

import br.edu.ifpb.es.daw.entities.Empregado;

public interface EmpregradoDAO {

    void save( Empregado empregado) throws PersistenciaDawException;

    Empregado update(Empregado empregado) throws PersistenciaDawException;

    void delete(Integer id) throws PersistenciaDawException;

    Empregado getById(Integer empregadoId) throws PersistenciaDawException;
    
    List<Empregado> getAll() throws PersistenciaDawException;
}
