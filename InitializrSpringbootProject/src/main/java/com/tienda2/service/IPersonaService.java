package com.tienda2.service;
//Oscar Sanchez Boza

import com.tienda2.entity.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona>getAllPersona();
    public Persona getPersonaById (long id);
    public void savePersona(Persona persona);
    public void delete(long id);
}
