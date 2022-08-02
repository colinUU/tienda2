package com.tiendita.servicio.categorias.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.tiendita.servicio.categorias.models.entity.Categoria;

// Las operaciones que realice las queremos exclusicamente para la clase categorias
/*
 * private >>>Long<<<  idCategorias;
 * */
public interface CategoriasDao extends CrudRepository<Categoria, Long>{
	/*
	 * Harémos que se cumpla con los requisitos en CRUD
	 * */
}
