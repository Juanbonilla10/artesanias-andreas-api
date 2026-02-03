package com.artesaniasandreas.backend.repository;

import com.artesaniasandreas.backend.domain.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {

    Optional<Cliente> findByEmail(String email);

    Optional<Cliente> findByGoogleId(String googleId);


}
