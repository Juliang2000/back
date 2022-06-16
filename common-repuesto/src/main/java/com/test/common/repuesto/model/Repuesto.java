package com.test.common.repuesto.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "repuestos")
public class Repuesto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 456254852452L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty(message = "No puede estar vacio")
	@Size(min = 3, max = 20, message = "El numero de caracteres debe estar entre 3 y 20")
	private String codigo;
	@NotEmpty(message = "No puede estar vacio")
	@Size(min = 2, max = 40, message = "El numero de caracteres debe estar entre 3 y 40")
	private String nombre;
	@NotNull
	@Min(value = 0, message = "El valor no puede ser negativo")
	private Double precio;
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;

	@PrePersist
	public void prePersist() {
		this.fechaCreacion = new Date();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(!(obj instanceof Repuesto)) {
			return false;
		}
		
		Repuesto repuesto = (Repuesto) obj;
		return this.id!=null&& this.id.equals(repuesto.getId());
		
	}

}
