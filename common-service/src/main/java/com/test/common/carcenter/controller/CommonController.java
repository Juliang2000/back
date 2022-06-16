package com.test.common.carcenter.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.test.common.carcenter.service.CommonService;

public class CommonController<E, S extends CommonService<E>> {

	@Autowired
	protected S service;
	
	@GetMapping
	public ResponseEntity<?> list(){
		return ResponseEntity.ok().body(service.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> listById(@PathVariable Long id){
		Optional<E> optional = service.findById(id);
		
		if (!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(optional.get());
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody E entity){
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(entity));
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Long id){
		service.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
