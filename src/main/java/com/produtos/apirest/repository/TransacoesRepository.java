package com.produtos.apirest.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.produtos.apirest.models.Transacoes;

@Repository
public interface TransacoesRepository extends JpaRepository<Transacoes, Long>{

	Transacoes findById(long id);
	
	@Query("select t from Transacoes t where t.idConta IN ?1 and t.dataTransacao >= ?2 and t.dataTransacao <= ?3")
	List<Transacoes> findExtrato(Long idConta, Date dataTransacao, Date dataFim);

	@Query("select SUM(valor) from Transacoes t where t.idConta IN ?1")
	List<Transacoes> findSaldo(Long idConta);

}
