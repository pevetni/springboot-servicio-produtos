package com.formacionbdi.springboot.app.productos.repository;

import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.springboot.app.commons.models.entity.Producto;

public interface IProductoRepository extends CrudRepository<Producto, Long>{

}
