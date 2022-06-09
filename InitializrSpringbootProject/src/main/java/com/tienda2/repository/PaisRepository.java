package com.tienda2.repository;
//

import com.tienda2.entity.Pais;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PaisRepository extends CrudRepository<Pais,Long>  {
    
}
