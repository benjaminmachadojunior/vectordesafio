package com.produtos.apirest.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apirest.models.Contas;
import com.produtos.apirest.models.Pessoas;
import com.produtos.apirest.repository.ContasRepository;
import com.produtos.apirest.service.ContasService;

@RestController
@RequestMapping(value="/vector")
public class ContasController {

	@Autowired
	ContasRepository contasRepository;

//	@Autowired
//	ContasService contasService;
	
//	@GetMapping("/contas")
//	public List<Contas> listaContas(){
//		return contasRepository.findAll();
//	}

	@PostMapping("/criacaodeumaconta")
	public Contas salvaConta(@RequestBody @Valid Contas contas) {
		return contasRepository.save(contas);
	}

	@PostMapping("/bloqueiodeumaconta")
	public Contas bloquearConta(@RequestBody @Valid Contas contas) {
		return contasRepository.save(contas);
	}

	
	
	
}
