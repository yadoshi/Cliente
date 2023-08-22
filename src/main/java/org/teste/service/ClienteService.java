package org.teste.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.teste.dao.ClienteDao;
import org.teste.model.Cliente;

import java.util.List;

@ApplicationScoped
public class ClienteService {

    @Inject
    ClienteDao clienteDao;

    public List<Cliente> findAllClientes(){

        return clienteDao.findAll().list();
    }

    public void addCliente(Cliente cliente){
        clienteDao.persist(cliente);
    }
}
