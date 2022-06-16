package com.test.carcenter.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.carcenter.model.Factura;
import com.test.carcenter.repository.FacturaRepository;
import com.test.common.carcenter.service.CommonServiceImpl;

@Service
public class FacturaServiceImpl extends CommonServiceImpl<Factura, FacturaRepository> implements FacturaService {
	
	@Autowired
	FacturaRepository repositoryFactura;

	@Override
	public Optional<Factura> findById(Long idFactura) {
		return repositoryFactura.findById(idFactura);
	}

	@Override
	public Factura save(Factura entity) {
		return repositoryFactura.save(entity);
	}

	
}
