package org.teste.dao;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.teste.model.Cliente;

@ApplicationScoped
public class ClienteDao implements PanacheRepository<Cliente> {

}
