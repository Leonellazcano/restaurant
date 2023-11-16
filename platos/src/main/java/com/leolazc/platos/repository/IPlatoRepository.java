
package com.leolazc.platos.repository;

import com.leolazc.platos.model.Plato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlatoRepository extends JpaRepository<Plato, Long>{
    
}
