package com.formacionbdi.springboot.app.productos.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.springboot.app.productos.models.entity.Producto;

public interface IProductoRepository extends CrudRepository<Producto, Long>{

}
