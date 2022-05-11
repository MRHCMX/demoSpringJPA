package com.mrhc.demoSpringJPA.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrhc.demoSpringJPA.domain.service.IClienteService;
import com.mrhc.demoSpringJPA.persistence.entity.Cliente;

@RestController
@RequestMapping("/cliente")
public class ClienteContoller {

	@Autowired 
	IClienteService clienteSrv;
	
	@GetMapping("/listar")
	public  List<Cliente> listClientes()
	{
		List<Cliente> clientes;
		clientes = clienteSrv.findAll();
		return clientes;
	}
	
	@GetMapping("/findById/{id}")
	public  Optional <Cliente> findById(@PathVariable("id") String id)
	{
		return clienteSrv.findById(id);
	}
	
	@GetMapping("/findByNombreOrderByNombreAsc/{nombre}")
	public  List<Cliente> findByNombreOrderByNombreAsc(@PathVariable("nombre") String nombre)
	{
		return clienteSrv.findByNombreOrderByNombreAsc(nombre);
	}
	
	@GetMapping("/findByNombreNotLike/{nombre}")
	public  List<Cliente> findByNombreNotLike(@PathVariable("nombre") String nombre)
	{
		return clienteSrv.findByNombreNotLike(nombre);
	}
	
	@GetMapping("/encuentraByCorreoElectronico/{correo}")
	public  List<Cliente> encuentraByCorreoElectronico(@PathVariable("correo") String correo)
	{
		return clienteSrv.encuentraByCorreoElectronico(correo);
	}
	
	@PostMapping("/save")
	public void saveCliente(@RequestBody Cliente cliente) throws Exception
	{
		Optional<Cliente> cliente2 = clienteSrv.findById(cliente.getId());
		if ( cliente2.isEmpty() )
		{
			clienteSrv.save(cliente);
		} else {
			throw new Exception("El cliente ya existe, no es posible insertarlo"); 
		}
	}
	
	@PutMapping("/update")
	public void updateCliente(@RequestBody Cliente cliente)
	{
		clienteSrv.save(cliente);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") String id)
	{
		clienteSrv.delete(id);
	}
	
}
