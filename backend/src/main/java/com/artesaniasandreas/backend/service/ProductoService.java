package com.artesaniasandreas.backend.service;

import com.artesaniasandreas.backend.domain.model.Producto;
import com.artesaniasandreas.backend.dto.request.ProductoCreateRequestDTO;
import com.artesaniasandreas.backend.dto.response.ProductoCreateResponseDTO;
import com.artesaniasandreas.backend.mapper.ProductoMapper;
import com.artesaniasandreas.backend.repository.ClienteRepository;
import com.artesaniasandreas.backend.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public ProductoCreateResponseDTO crear(ProductoCreateRequestDTO request) {
        Producto producto = ProductoMapper.toEntity(request);
        return ProductoMapper.toResponse(productoRepository.save(producto));
    }

    public List<ProductoCreateResponseDTO> obtenerTodos() {
        return productoRepository.findAll()
                .stream()
                .map(ProductoMapper::toResponse)
                .toList();
    }
}
