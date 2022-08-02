package com.tiendita.servicio.comprasProductos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiendita.servicio.comprasProductos.models.entity.CompraProducto;
import com.tiendita.servicio.comprasProductos.models.service.ICompraProductoService;

@RestController
@RequestMapping("/compra_producto")
public class CompraProductoController {

	@Autowired
	ICompraProductoService compraProductoServicio;
	
	@GetMapping("/listarCompraProductos")
	public List<CompraProducto> listaar(){
		return compraProductoServicio.findAll();
	}
	@GetMapping("/listarCompraProducto/{id}")
	public CompraProducto detalle(@PathVariable Long id) {
		return compraProductoServicio.findById(id);
	}
}
