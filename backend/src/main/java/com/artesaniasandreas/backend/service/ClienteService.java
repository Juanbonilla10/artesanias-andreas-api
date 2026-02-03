package com.artesaniasandreas.backend.service;

import com.artesaniasandreas.backend.domain.model.Cliente;
import com.artesaniasandreas.backend.dto.request.ClienteCreateRequestDTO;
import com.artesaniasandreas.backend.mapper.ClienteMapper;
import com.artesaniasandreas.backend.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public List<Cliente> obtenerTodos() {
        return repository.findAll();
    }

    public Cliente crearCliente(ClienteCreateRequestDTO dto){
        Optional<Cliente> existente = repository.findByEmail(dto.getEmail());

        if (existente.isPresent()) {
            return existente.get();
        }

        Cliente cliente = ClienteMapper.fromCreateRequest(dto);
        return repository.save(cliente);
    }
}
