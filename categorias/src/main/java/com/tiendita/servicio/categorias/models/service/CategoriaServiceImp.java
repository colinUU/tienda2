package com.tiendita.servicio.categorias.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tiendita.servicio.categorias.models.dao.CategoriasDao;
import com.tiendita.servicio.categorias.models.entity.Categoria;

@Service // indicamos que se trata de un servicio y será llamado por todas la clases que lo necesiten
public class CategoriaServiceImp implements ICategoriaService  {
	@Autowired
	private CategoriasDao categoriaDao;
	
	// Se estandariza lo que vamos a implementar en todas las clases que implementen la interface
	@Override
	@Transactional(readOnly=true)
	public List<Categoria> findAll() {
		return (List<Categoria>) categoriaDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Categoria findById(Long id) {
		
		return categoriaDao.findById(id).orElse(null);
	}

}
