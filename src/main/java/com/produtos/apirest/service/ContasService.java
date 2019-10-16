package com.produtos.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.produtos.apirest.models.Contas;
import com.produtos.apirest.repository.ContasRepository;

public class ContasService {

	@Autowired
	ContasRepository contasRepository;
	
//	public List<Contas> findByCriarConta (Contas contas){
//	return (List<Contas>) contasRepository.save(contas);
//	}
}
