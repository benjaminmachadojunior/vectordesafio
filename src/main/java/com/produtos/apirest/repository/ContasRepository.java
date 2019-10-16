package com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.produtos.apirest.models.Contas;

@Repository
public interface ContasRepository extends JpaRepository<Contas, Long>{

	Contas findById(long id);
}
