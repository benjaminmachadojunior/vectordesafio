package com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.produtos.apirest.models.Pessoas;


@Repository
public interface PessoaRepository extends JpaRepository<Pessoas, Long>{

	Pessoas findById(long id);
}
