package com.tiendita.servicio.clientes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiendita.servicio.clientes.models.entity.Cliente;
import com.tiendita.servicio.clientes.models.service.IClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	IClienteService clienteService;
	
	@GetMapping("/listarclientes")
	public List<Cliente> listar(){
		return clienteService.findAll();
	}
	@GetMapping("/listarcliente/{id}")
	public Cliente detalle(@PathVariable Long id) {
		return clienteService.findById(id);
	}
}
