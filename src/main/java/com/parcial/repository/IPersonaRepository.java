package com.parcial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parcial.model.Persona;

public interface IPersonaRepository extends JpaRepository<Persona, Long> {

	
	
}
