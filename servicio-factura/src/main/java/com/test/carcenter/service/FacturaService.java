package com.test.carcenter.service;

import java.util.Optional;

import com.test.carcenter.model.Factura;
import com.test.common.carcenter.service.CommonService;

public interface FacturaService extends CommonService<Factura>{
	
	public Optional<Factura> findById(Long idFactura);
	
	public Factura save(Factura entity);
	
}
