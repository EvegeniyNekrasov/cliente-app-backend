package com.study.evgeniy.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.study.evgeniy.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
	
}
