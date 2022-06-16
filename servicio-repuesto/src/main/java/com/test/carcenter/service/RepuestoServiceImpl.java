package com.test.carcenter.service;

import org.springframework.stereotype.Service;

import com.test.carcenter.repository.RepuestoRepository;
import com.test.common.carcenter.service.CommonServiceImpl;
import com.test.common.repuesto.model.Repuesto;

@Service
public class RepuestoServiceImpl  extends CommonServiceImpl<Repuesto, RepuestoRepository> implements RepuestoService  {

}
