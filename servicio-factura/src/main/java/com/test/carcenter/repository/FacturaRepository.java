package com.test.carcenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.carcenter.model.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long>{

}
