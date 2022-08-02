package com.tiendita.servicio.compras.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tiendita.servicio.compras.models.dao.ComprasDao;
import com.tiendita.servicio.compras.models.entity.Compra;

@Service
public class CompraServiceImp implements ICompraService{

	@Autowired
	private ComprasDao compraDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Compra> findAll() {
		return (List<Compra>) compraDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Compra findById(Long id) {
		return compraDao.findById(id).orElse(null);
	}

}
