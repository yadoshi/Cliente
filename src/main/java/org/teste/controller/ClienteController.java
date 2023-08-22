package org.teste.controller;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.teste.model.Cliente;
import org.teste.service.ClienteService;

import java.util.ArrayList;
import java.util.List;

@Path("/api/cliente")
public class ClienteController {

    @Inject
    ClienteService clienteService;


    @GET
    public List<Cliente> buscaCliente(){

        List<Cliente> clientes = new ArrayList<>();
        try {
            clientes = clienteService.findAllClientes();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return clientes;
    }

    @POST
    @Transactional
    public void addCliente(Cliente cliente) {
        clienteService.addCliente(cliente);
    }




}
