package com.tiendita.servicio.comprasProductos.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMPRAS_PRODUCTOS")
public class CompraProducto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_compra_producto")
	private Long idCompraProducto;
	@Column(name="id_compra")
	private Long idCompra;
	@Column(name="id_producto")
	private Long idProducto;
	private Integer cantidad;
	private Double total;
	private Integer estado;
	
	// METODOS
	public Long getIdCompraProducto() {
		return idCompraProducto;
	}
	public void setIdCompraProducto(Long idCompraProducto) {
		this.idCompraProducto = idCompraProducto;
	}
	public Long getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(Long idCompra) {
		this.idCompra = idCompra;
	}
	public Long getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
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
	// toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CompraProducto [idCompraProducto=");
		builder.append(idCompraProducto);
		builder.append(", idCompra=");
		builder.append(idCompra);
		builder.append(", idProducto=");
		builder.append(idProducto);
		builder.append(", cantidad=");
		builder.append(cantidad);
		builder.append(", total=");
		builder.append(total);
		builder.append(", estado=");
		builder.append(estado);
		builder.append("]");
		return builder.toString();
	}
}
