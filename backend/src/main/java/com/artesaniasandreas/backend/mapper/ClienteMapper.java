package com.artesaniasandreas.backend.mapper;

import com.artesaniasandreas.backend.dto.request.ClienteCreateRequestDTO;
import com.artesaniasandreas.backend.dto.response.ClienteResponseDTO;
import com.artesaniasandreas.backend.domain.model.Cliente;

import java.time.LocalDateTime;

public class ClienteMapper {

    private ClienteMapper() {
        // utility class
    }

    public static ClienteResponseDTO toResponse(Cliente cliente) {
        return new ClienteResponseDTO(
                cliente.getId(),
                cliente.getEmail(),
                cliente.getNombre(),
                cliente.getApellido()
        );
    }

    public static Cliente fromCreateRequest(ClienteCreateRequestDTO dto) {
        Cliente cliente = new Cliente();
        cliente.setNombre(dto.getNombre());
        cliente.setApellido(dto.getApellido());
        cliente.setEmail(dto.getEmail());
        cliente.setGoogleId(dto.getGoogleId());
        cliente.setEstado("ACTIVO");
        cliente.setCreatedAt(LocalDateTime.now());
        return cliente;
    }


}