package com.artesaniasandreas.backend.controller.dto;

import java.util.UUID;

public class ClienteResponseDTO {

    private UUID id;
    private String email;
    private String nombre;
    private String apellido;
    private Boolean activo;

    public ClienteResponseDTO(UUID id, String email, String nombre, String apellido) {
        this.id = id;
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // getters
}