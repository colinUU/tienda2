package com.tiendita.servicio.clientes.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTES")
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long idCliente;
	private String nombre;
	private String apellidos;
	private Integer celular;
	private String direccion;
	@Column(name="correo_electronico")
	private String correoElectronico;
	
	// METODOS
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Integer getCelular() {
		return celular;
	}
	public void setCelular(Integer celular) {
		this.celular = celular;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [idCliente=").append(idCliente).append(", nombre=").append(nombre)
				.append(", apellidos=").append(apellidos).append(", celular=").append(celular).append(", direccion=")
				.append(direccion).append(", correoElectronico=").append(correoElectronico).append("]");
		return builder.toString();
	}

}
