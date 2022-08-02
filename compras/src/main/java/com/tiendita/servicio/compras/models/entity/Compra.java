package com.tiendita.servicio.compras.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMPRAS")
public class Compra implements Serializable{

	private static final long serialVersionUID = 1L;
	
	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_compra")
	private Long idCompra;
	@Column(name="id_cliente")
	private Long idCliente;
	private Date fecha;
	@Column(name="medio_pago")
	private Character medioPago;
	private String comentario;
	private Integer estado;
	
	// METODOS
	public Long getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(Long idCompra) {
		this.idCompra = idCompra;
	}
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Character getMedioPago() {
		return medioPago;
	}
	public void setMedioPago(Character medioPago) {
		this.medioPago = medioPago;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
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
		builder.append("Compra [idCompra=");
		builder.append(idCompra);
		builder.append(", idCliente=");
		builder.append(idCliente);
		builder.append(", fecha=");
		builder.append(fecha);
		builder.append(", medioPago=");
		builder.append(medioPago);
		builder.append(", comentario=");
		builder.append(comentario);
		builder.append(", estado=");
		builder.append(estado);
		builder.append("]");
		return builder.toString();
	}
}
