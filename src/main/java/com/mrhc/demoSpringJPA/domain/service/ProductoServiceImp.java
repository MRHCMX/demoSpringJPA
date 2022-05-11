package com.mrhc.demoSpringJPA.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrhc.demoSpringJPA.persistence.crud.ProductoCrudRepository;
import com.mrhc.demoSpringJPA.persistence.entity.Producto;

@Service
public class ProductoServiceImp implements IProductoService {
	
	@Autowired
	private ProductoCrudRepository productoCrudRepository;

	@Override
	public List<Producto> findAll() {
		return productoCrudRepository.findAll();
	}

	@Override
	public void save(Producto producto) {
		productoCrudRepository.save(producto);
	}

	@Override
	public Optional<Producto> findById(Integer idProducto) {
		return productoCrudRepository.findById(idProducto);
	}

}
