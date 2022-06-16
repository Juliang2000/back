package com.test.carcenter.controller;

import org.springframework.web.bind.annotation.RestController;

import com.test.carcenter.servicio.MecanicoServicio;
import com.test.common.carcenter.controller.CommonController;
import com.test.common.mecanico.model.Mecanico;


@RestController
public class MecanicoController extends CommonController<Mecanico, MecanicoServicio>{

}
