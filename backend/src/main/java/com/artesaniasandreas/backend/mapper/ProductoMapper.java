package com.artesaniasandreas.backend.mapper;

import com.artesaniasandreas.backend.domain.model.Producto;
import com.artesaniasandreas.backend.dto.request.ProductoCreateRequestDTO;
import com.artesaniasandreas.backend.dto.response.ProductoCreateResponseDTO;

import java.time.LocalDateTime;

public class ProductoMapper {

    private ProductoMapper() {}

    public static Producto toEntity(ProductoCreateRequestDTO request) {
        Producto producto = new Producto();
        producto.setNombre(request.getNombre());
        producto.setDescripcion(request.getDescripcion());
        producto.setPrecio(request.getPrecio());
        producto.setActivo(true);
        return producto;
    }

    public static ProductoCreateResponseDTO toResponse(Producto producto) {
        ProductoCreateResponseDTO response = new ProductoCreateResponseDTO();
        response.setId(producto.getId());
        response.setNombre(producto.getNombre());
        response.setDescripcion(producto.getDescripcion());
        response.setPrecio(producto.getPrecio());
        response.setActivo(producto.getActivo());
        return response;
    }
}
