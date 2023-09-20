package com.test.cliente.cliente.models.dao;

import com.test.cliente.cliente.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
}
