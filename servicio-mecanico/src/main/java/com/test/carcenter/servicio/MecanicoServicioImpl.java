package com.test.carcenter.servicio;

import org.springframework.stereotype.Service;

import com.test.carcenter.repository.MecanicoRepository;
import com.test.common.carcenter.service.CommonServiceImpl;
import com.test.common.mecanico.model.Mecanico;

@Service
public class MecanicoServicioImpl extends CommonServiceImpl<Mecanico, MecanicoRepository> implements MecanicoServicio{

}
