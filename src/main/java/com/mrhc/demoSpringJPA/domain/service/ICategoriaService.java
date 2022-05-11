package com.mrhc.demoSpringJPA.domain.service;

import java.util.List;
import java.util.Optional;

import com.mrhc.demoSpringJPA.persistence.entity.Categoria;

public interface ICategoriaService {
    List <Categoria> findAll();
    void save(Categoria categoria);
    Optional <Categoria> findById(Integer id);
    void delete(Integer id);
}
