package com.tiendita.servicio.comprasProductos.models.service;

import java.util.List;

import com.tiendita.servicio.comprasProductos.models.entity.CompraProducto;

public interface ICompraProductoService {
	
	public List<CompraProducto> findAll();
	public CompraProducto findById(Long id);
}
