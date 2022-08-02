package com.tiendita.servicio.categorias.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // indicar a la clase es una entidad
@Table(name = "CATEGORIAS") // tabla a la que hacemos referencia
public class Categoria implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_categorias")
	// ATRIBUTOS
	private Long idCategorias;
	private String descripcion;
	private Integer estado;
	
	// encapsulado de java
	// GETTER -> modificar desde otras intancias de java
	public String getDescripcion() {
		return descripcion;
	}
	
	public Long getIdCategorias() {
		return idCategorias;
	}
	
	public Integer getEstado() {
		return estado;
	}
	// SETTER
	public void setIdCategorias(Long idCategorias) {
		this.idCategorias = idCategorias;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Categoria [idCategorias=");
		builder.append(idCategorias);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", estado=");
		builder.append(estado);
		builder.append("]");
		return builder.toString();
	}
	
	
}
