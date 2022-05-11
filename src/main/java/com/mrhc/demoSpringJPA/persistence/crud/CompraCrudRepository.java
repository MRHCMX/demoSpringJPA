package com.mrhc.demoSpringJPA.persistence.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mrhc.demoSpringJPA.persistence.entity.Compra;

@Repository
public interface CompraCrudRepository extends CrudRepository<Compra, Integer>{

}
