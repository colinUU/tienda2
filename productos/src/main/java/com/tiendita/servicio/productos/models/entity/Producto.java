package com.tiendita.servicio.productos.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTOS")
public class Producto implements Serializable{

	private static final long serialVersionUID = 1L;

	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "id_producto")
	private Long idProducto;
	private String nombre;
	//@ManyToOne
	@Column(name = "id_categoria")
	private Long idCategoria;
	@Column(name = "codigo_barras")
	private String codigoBarras;
	@Column(name = "precio_venta")
	private Double precioVenta;
	@Column(name = "cantidad_stock")
	private Long cantidadStock;
	private Integer estado;
	
	// METODOS
	public Long getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Long getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public Double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public Long getCantidadStock() {
		return cantidadStock;
	}
	public void setCantidadStock(Long cantidadStock) {
		this.cantidadStock = cantidadStock;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	// ToString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [idProducto=").append(idProducto).append(", nombre=").append(nombre)
				.append(", idCategoria=").append(idCategoria).append(", codigoBarras=").append(codigoBarras)
				.append(", precioVenta=").append(precioVenta).append(", cantidadStock=").append(cantidadStock)
				.append(", estado=").append(estado).append("]");
		return builder.toString();
	}
	
}
