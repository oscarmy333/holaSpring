package com.myoscorp.dao;

import com.myoscorp.dominio.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long>{
    
}
