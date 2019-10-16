package com.produtos.apirest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apirest.models.Pessoas;
import com.produtos.apirest.repository.PessoaRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/vector")
public class PessoasController {

	@Autowired
	PessoaRepository pessoaRepository;
	
	@GetMapping("/pessoas")
	public List<Pessoas> listaPessoas(){
		return pessoaRepository.findAll();
	}
}
