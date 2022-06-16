package com.test.carcenter.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.test.common.cliente.model.Cliente;

@Entity
@Table(name = "facturas")
public class Factura implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "America/Bogota", locale = "es_CO")
	@Temporal(TemporalType.DATE)
	private Date createAt;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@JoinColumn(name = "factura_id")
	private List<ItemFactura> listaItems;

	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

	@PrePersist
	public void prePersist() {
		this.createAt = new Date();
	}

	public Factura() {
		this.listaItems = new ArrayList<>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public List<ItemFactura> getListaItems() {
		return listaItems;
	}

	public void setListaItems(List<ItemFactura> listaItems) {
		this.listaItems = listaItems;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void addItem(ItemFactura item) {
		listaItems.add(item);
	}

	public void removeItem(ItemFactura item) {
		listaItems.remove(item);
	}

	public Double getTotal() {
		Double total = 0.0;
		for (ItemFactura itemFactura : listaItems) {
			total += itemFactura.getValorItem();
		}
		return total;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1841548L;

}
