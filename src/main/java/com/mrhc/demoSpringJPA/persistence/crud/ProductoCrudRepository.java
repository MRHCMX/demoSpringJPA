package com.mrhc.demoSpringJPA.persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mrhc.demoSpringJPA.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductoCrudRepository extends JpaRepository<Producto, Integer> {
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
