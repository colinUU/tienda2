package com.tiendita.servicio.compras.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.tiendita.servicio.compras.models.entity.Compra;

public interface ComprasDao extends CrudRepository<Compra, Long>{

}
