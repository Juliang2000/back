package com.test.carcenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.common.mecanico.model.Mecanico;

@Repository
public interface MecanicoRepository extends JpaRepository<Mecanico, Long>{

}
