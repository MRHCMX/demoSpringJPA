package com.mrhc.demoSpringJPA.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrhc.demoSpringJPA.persistence.crud.CategoriaCrudRepository;
import com.mrhc.demoSpringJPA.persistence.entity.Categoria;

@Service
public class CategoriaServiceImp implements ICategoriaService {
	
	@Autowired
	CategoriaCrudRepository categoriaCrudRepository;

	@Override
	public List<Categoria> findAll() {
		return categoriaCrudRepository.findAll();
	}

	@Override
	public void save(Categoria categoria) {
		categoriaCrudRepository.save(categoria);
		
	}

	@Override
	public Optional<Categoria> findById(Integer id) {
		return categoriaCrudRepository.findById(id);
	}

	@Override
	public void delete(Integer id) {
		categoriaCrudRepository.deleteById(id);
	}

}
