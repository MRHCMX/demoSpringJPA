package com.mrhc.demoSpringJPA.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrhc.demoSpringJPA.domain.service.ICategoriaService;
import com.mrhc.demoSpringJPA.persistence.entity.Categoria;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
    private ICategoriaService categoriaSrv;
	
	@GetMapping("/listCategorias")
	public List<Categoria> listCategorias()
	{
		return categoriaSrv.findAll();
	}

}
