package com.votacion.sistema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.votacion.sistema.models.Departamentos;


@Repository
public interface IDepartamentosRepository extends JpaRepository<Departamentos, String> {

}
