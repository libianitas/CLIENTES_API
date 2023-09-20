package com.test.cliente.cliente.models.dao.services;

import com.test.cliente.cliente.models.entity.Cliente;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();
}
