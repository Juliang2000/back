package com.test.carcenter.service;

import org.springframework.stereotype.Service;

import com.test.carcenter.model.Cliente;
import com.test.carcenter.repository.ClienteRepository;
import com.test.common.carcenter.service.CommonServiceImpl;

@Service
public class ClienteServiceImpl extends CommonServiceImpl<Cliente, ClienteRepository> implements ClienteService{

}
