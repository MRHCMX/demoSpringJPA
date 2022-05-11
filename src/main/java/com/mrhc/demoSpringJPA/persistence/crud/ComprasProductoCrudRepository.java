package com.mrhc.demoSpringJPA.persistence.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mrhc.demoSpringJPA.persistence.entity.ComprasProducto;
import com.mrhc.demoSpringJPA.persistence.entity.ComprasProductoPK;

@Repository
public interface ComprasProductoCrudRepository extends CrudRepository<ComprasProducto, ComprasProductoPK>{

}
