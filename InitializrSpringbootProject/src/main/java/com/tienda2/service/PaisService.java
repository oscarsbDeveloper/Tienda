package com.tienda2.service;
//Oscar Sanchez B.

import com.tienda2.entity.Pais;
import com.tienda2.repository.PaisRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


public class PaisService {
    @Autowired
    private PaisRepository paisRepository;
    
    public List<Pais>listCountry(){
        return (List<Pais>)paisRepository.findAll();
    }
}
