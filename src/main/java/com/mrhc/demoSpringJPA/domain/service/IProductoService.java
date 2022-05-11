package com.mrhc.demoSpringJPA.domain.service;

import java.util.List;
import java.util.Optional;

import com.mrhc.demoSpringJPA.persistence.entity.Producto;

public interface IProductoService {
	List<Producto> findAll();
    void save(Producto producto);
    Optional <Producto> findById(Integer idProducto);
}
