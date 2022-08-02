package com.tiendita.servicio.comprasProductos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tiendita.servicio.comprasProductos.models.dao.ComprasProductosDao;
import com.tiendita.servicio.comprasProductos.models.entity.CompraProducto;

@Service
public class CompraProductoServiceImp implements ICompraProductoService{

	@Autowired
	private ComprasProductosDao compraProductoDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<CompraProducto> findAll() {
		return (List<CompraProducto>) compraProductoDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public CompraProducto findById(Long id) {
		return compraProductoDao.findById(id).orElse(null);
	}

}
