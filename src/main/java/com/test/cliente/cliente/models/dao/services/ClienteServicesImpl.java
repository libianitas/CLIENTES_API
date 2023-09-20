package com.test.cliente.cliente.models.dao.services;

import com.test.cliente.cliente.models.dao.IClienteDao;
import com.test.cliente.cliente.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ClienteServicesImpl implements IClienteService  {
    @Autowired
    private IClienteDao iClienteDao;
    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) iClienteDao.findAll();
    }
}
