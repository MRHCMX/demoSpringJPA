package com.mrhc.demoSpringJPA.persistence.crud;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mrhc.demoSpringJPA.persistence.entity.Cliente;

public interface ClienteCrudRepository extends JpaRepository<Cliente, String>{
	List<Cliente> findByNombreOrderByNombreAsc(String nombre);
	List<Cliente> findByNombreNotLike(String nombre);
	
	@Query("select c from Cliente c where c.correoElectronico like %?1%")
	List<Cliente> encuentraByCorreoElectronico(String correoElectronico);
}
