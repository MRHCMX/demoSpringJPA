package com.mrhc.demoSpringJPA.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrhc.demoSpringJPA.persistence.crud.ClienteCrudRepository;
import com.mrhc.demoSpringJPA.persistence.entity.Cliente;

@Service
public class ClienteService implements IClienteService{

	@Autowired
	ClienteCrudRepository clienteCrudRepository;
	
	@Override
	public List<Cliente> findAll() {
		return clienteCrudRepository.findAll();
	}

	@Override
	public void save(Cliente cliente) {
		clienteCrudRepository.save(cliente);
	}

	@Override
	public Optional<Cliente> findById(String id) {
		return clienteCrudRepository.findById(id);
	}

	@Override
	public void delete(String id) {
		clienteCrudRepository.deleteById(id);
	}

	@Override
	public List<Cliente> findByNombreOrderByNombreAsc(String nombre) {
		return clienteCrudRepository.findByNombreOrderByNombreAsc(nombre) ;
	}

	@Override
	public List<Cliente> findByNombreNotLike(String nombre) {
		return clienteCrudRepository.findByNombreNotLike(nombre) ;
	}

	@Override
	public List<Cliente> encuentraByCorreoElectronico(String correo) {
		return clienteCrudRepository.encuentraByCorreoElectronico(correo);
	}

}
