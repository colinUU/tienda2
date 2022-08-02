package com.tiendita.servicio.comprasProductos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.tiendita.servicio.comprasProductos.models.entity.CompraProducto;

public interface ComprasProductosDao extends CrudRepository<CompraProducto, Long>{

}
