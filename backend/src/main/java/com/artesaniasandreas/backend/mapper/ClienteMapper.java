package com.artesaniasandreas.backend.mapper;

import com.artesaniasandreas.backend.controller.dto.ClienteResponseDTO;
import com.artesaniasandreas.backend.domain.model.Cliente;

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
}