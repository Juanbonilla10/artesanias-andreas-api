package com.artesaniasandreas.backend.repository;

import com.artesaniasandreas.backend.domain.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductoRepository extends JpaRepository<Producto, UUID>  {
}
