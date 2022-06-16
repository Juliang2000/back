package com.test.carcenter.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.carcenter.model.Cliente;
import com.test.carcenter.service.ClienteService;
import com.test.common.carcenter.controller.CommonController;


@RestController
public class ClienteController extends CommonController<Cliente, ClienteService> {

	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Cliente cliente, @PathVariable Long id) {

		Optional<Cliente> objOptional = service.findById(id);
		if (!objOptional.isPresent()) {
			return ResponseEntity.notFound().build();
		}

		Cliente clienteBD = objOptional.get();
		clienteBD.setIdentificacion(cliente.getIdentificacion());
		clienteBD.setNombres(cliente.getNombres());
		clienteBD.setApellidos(cliente.getApellidos());
		clienteBD.setTelefono(cliente.getTelefono());
		clienteBD.setDireccion(cliente.getDireccion());
		clienteBD.setEdad(cliente.getEdad());
		clienteBD.setTipo(cliente.getTipo());

		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(clienteBD));
	}

}
