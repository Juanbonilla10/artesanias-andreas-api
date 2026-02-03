package com.artesaniasandreas.backend.controller;

import com.artesaniasandreas.backend.dto.request.ProductoCreateRequestDTO;
import com.artesaniasandreas.backend.dto.response.ProductoCreateResponseDTO;
import com.artesaniasandreas.backend.service.ProductoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    private final ProductoService service;

    public ProductoController(ProductoService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductoCreateResponseDTO crear(@Valid @RequestBody ProductoCreateRequestDTO request) {
        return service.crear(request);
    }

    @GetMapping
    public List<ProductoCreateResponseDTO> listar() {
        return service.obtenerTodos();
    }
}
