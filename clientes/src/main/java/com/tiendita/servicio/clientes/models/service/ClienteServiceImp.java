package com.tiendita.servicio.clientes.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tiendita.servicio.clientes.models.dao.ClientesDao;
import com.tiendita.servicio.clientes.models.entity.Cliente;

@Service
public class ClienteServiceImp implements IClienteService{

	@Autowired
	private ClientesDao clienteDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Cliente findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}

}
