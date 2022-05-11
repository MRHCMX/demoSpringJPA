package com.mrhc.demoSpringJPA.persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mrhc.demoSpringJPA.persistence.entity.Categoria;

@Repository
public interface CategoriaCrudRepository extends JpaRepository<Categoria, Integer> {
}
