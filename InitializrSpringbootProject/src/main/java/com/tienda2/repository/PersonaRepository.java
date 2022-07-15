package com.tienda2.repository;
//Oscar Sanchez B.

import com.tienda2.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CrudRepository<Persona,Long>{
    Persona findByNombre(String nombre);
}
