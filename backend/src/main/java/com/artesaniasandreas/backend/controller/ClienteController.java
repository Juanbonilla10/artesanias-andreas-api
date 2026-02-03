package com.artesaniasandreas.backend.controller;

import com.artesaniasandreas.backend.dto.request.ClienteCreateRequestDTO;
import com.artesaniasandreas.backend.dto.response.ClienteResponseDTO;
import com.artesaniasandreas.backend.mapper.ClienteMapper;
import com.artesaniasandreas.backend.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<ClienteResponseDTO> crear(
            @Valid @RequestBody ClienteCreateRequestDTO request) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(ClienteMapper.toResponse(service.crearCliente(request)));
    }
}
