package com.study.evgeniy.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.study.evgeniy.models.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long> {
	
}
