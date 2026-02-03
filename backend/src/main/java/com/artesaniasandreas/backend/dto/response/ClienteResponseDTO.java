package com.artesaniasandreas.backend.dto.response;

import java.util.UUID;

public class ClienteResponseDTO {

    private UUID id;
    private String email;
    private String nombre;
    private String apellido;

    public ClienteResponseDTO(UUID id, String email, String nombre, String apellido) {
        this.id = id;
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // getters

    public UUID getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}