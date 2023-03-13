package com.meuprojeto.projeto.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuprojeto.projeto.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, UUID>{

}
