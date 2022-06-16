package com.test.carcenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.common.repuesto.model.Repuesto;

public interface RepuestoRepository extends JpaRepository<Repuesto, Long> {

}
