package com.artesaniasandreas.backend.controller;

import com.artesaniasandreas.backend.controller.dto.ClienteResponseDTO;
import com.artesaniasandreas.backend.domain.model.Cliente;
import com.artesaniasandreas.backend.mapper.ClienteMapper;
import com.artesaniasandreas.backend.service.ClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping
    public List<ClienteResponseDTO> listarClientes() {
        return service.obtenerTodos()
                .stream()
                .map(ClienteMapper::toResponse)
                .toList();
    }
}
