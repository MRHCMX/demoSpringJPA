package com.mrhc.demoSpringJPA.domain.service;

import java.util.List;
import java.util.Optional;

import com.mrhc.demoSpringJPA.persistence.entity.Cliente;

public interface IClienteService {
    List <Cliente> findAll();
    void save(Cliente cliente);
    Optional <Cliente> findById(String id);
    void delete(String id);
    
    List<Cliente> findByNombreOrderByNombreAsc(String nombre);
    List<Cliente> findByNombreNotLike(String nombre);
    
    List<Cliente> encuentraByCorreoElectronico(String correo);
}
