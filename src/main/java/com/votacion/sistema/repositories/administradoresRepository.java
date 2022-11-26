package com.votacion.sistema.repositories;

import com.votacion.sistema.models.Administradores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface administradoresRepository extends JpaRepository<Administradores, Integer> {
}
