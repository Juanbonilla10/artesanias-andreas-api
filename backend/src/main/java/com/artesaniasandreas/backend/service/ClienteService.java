package com.artesaniasandreas.backend.service;

import com.artesaniasandreas.backend.domain.model.Cliente;
import com.artesaniasandreas.backend.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public List<Cliente> obtenerTodos() {
        return repository.findAll();
    }
}
