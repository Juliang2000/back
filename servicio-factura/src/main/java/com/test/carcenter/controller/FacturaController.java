package com.test.carcenter.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.carcenter.model.Factura;
import com.test.carcenter.model.ItemFactura;
//import com.test.carcenter.model.ItemFactura;
import com.test.carcenter.service.FacturaService;
import com.test.common.carcenter.controller.CommonController;


@RestController
public class FacturaController extends CommonController<Factura, FacturaService>{
	
	@Autowired
	FacturaService serviceFactura;

	@PutMapping("/editar/{id}")
	public ResponseEntity<?> modificar(@Valid @RequestBody Factura factura, BindingResult result, @PathVariable Long id) {
		if (result.hasErrors()) {
			return this.validar(result);
		}
		Optional<Factura> optional = serviceFactura.findById(id);
		if (!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		Factura facturaBD = optional.get();
		facturaBD.setCliente(factura.getCliente());
		//facturaBD.setListaItems(factura.getListaItems());

		return ResponseEntity.status(HttpStatus.CREATED).body(serviceFactura.save(facturaBD));
	}
	
	@PutMapping("/{id}/add-item")
	public ResponseEntity<?> adicionarItem(@Valid @RequestBody ItemFactura itemFactura, BindingResult result, @PathVariable Long id) {
		if (result.hasErrors()) {
			return this.validar(result);
		}
		Optional<Factura> optional = serviceFactura.findById(id);
		if (!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		Factura facturaBD = optional.get();
		itemFactura.setPrecio(itemFactura.getRepuesto().getPrecio());
		facturaBD.addItem(itemFactura);

		return ResponseEntity.status(HttpStatus.CREATED).body(serviceFactura.save(facturaBD));
	}
	
	@PutMapping("/remove/{id}")
	public ResponseEntity<?> removeItem(@Valid @RequestBody ItemFactura itemFactura, BindingResult result, @PathVariable Long id) {
		if (result.hasErrors()) {
			return this.validar(result);
		}
		Optional<Factura> optional = serviceFactura.findById(id);
		if (!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		Factura facturaBD = optional.get();
		facturaBD.removeItem(itemFactura);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(serviceFactura.save(facturaBD));
	}
	
	protected ResponseEntity<?> validar(BindingResult result) {
		Map<String, Object> errores = new HashMap<>();
		result.getFieldErrors().forEach(err -> {
			errores.put(err.getField(), "El atributo" + err.getField() + " " + err.getDefaultMessage());
		});
		return ResponseEntity.badRequest().body(errores);
	}
	
}
