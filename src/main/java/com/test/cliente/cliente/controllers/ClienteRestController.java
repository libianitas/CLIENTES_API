package com.test.cliente.cliente.controllers;

import com.test.cliente.cliente.models.dao.services.IClienteService;
import com.test.cliente.cliente.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/api")
public class ClienteRestController {
    @Autowired
    IClienteService clienteServices;
    @GetMapping("/clientes")
    public List<Cliente> index(){
         return  clienteServices.findAll();
    }
}
