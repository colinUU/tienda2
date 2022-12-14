package com.tiendita.servicio.categorias.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiendita.servicio.categorias.models.entity.Categoria;
import com.tiendita.servicio.categorias.models.service.ICategoriaService;

@RestController //Controlador rest
@RequestMapping("/categoria")
public class CategoriaController {
	
	// funcionalidad CategoriaServie
	@Autowired // se genera implicitamente constructor, metodos variables en memoria 
	private ICategoriaService categoriaService;
	
	// Metodos -> acceder a la información de nuestro microservicio
	
	@GetMapping("/listar") // verbo a utilizar
	public List<Categoria> listar(){
		return categoriaService.findAll();
	}
	
	@GetMapping("/listar/{id}") // verbo con parametro
	public Categoria detalle(@PathVariable Long id) {
		return categoriaService.findById(id);
	}
}
