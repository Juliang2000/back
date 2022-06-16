package com.test.carcenter.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.test.common.repuesto.model.Repuesto;

@Entity
@Table(name = "items_factura")
public class ItemFactura implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	@JoinColumn(name = "repuesto_id")
	@NotNull(message = "No puede ir vacío")
	private Repuesto repuesto;
	private Integer cantidad;
	private Double precio;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Repuesto getRepuesto() {
		return repuesto;
	}

	public void setProducto(Repuesto repuesto) {
		this.repuesto = repuesto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getValorItem() {
		System.out.println(precio * cantidad);
		return precio * cantidad;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 48514855515151L;

}
