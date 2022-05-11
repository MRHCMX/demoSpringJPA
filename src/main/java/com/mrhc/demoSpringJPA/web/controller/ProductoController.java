package com.mrhc.demoSpringJPA.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrhc.demoSpringJPA.domain.service.IProductoService;
import com.mrhc.demoSpringJPA.persistence.entity.Producto;

@RestController
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
    private IProductoService productoSrv;
	
	@GetMapping("/listProductos")
	public List<Producto> listProductos()
	{
		List<Producto> productos;
		productos = productoSrv.findAll();
    	return productos;
	}	
}
