package com.produtos.apirest.Controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apirest.models.Transacoes;
import com.produtos.apirest.repository.TransacoesRepository;

@RestController
@RequestMapping(value="/vector")

	
public class TransacoesController {

	@Autowired
	TransacoesRepository transacoesRepository;
	
	@GetMapping("/transacoes")
	public List<Transacoes> listaTransacoes(){
		return transacoesRepository.findAll();
	}

	@PostMapping("/depositoemumaconta")
	public Transacoes deposito(@RequestBody @Valid Transacoes transacoes) {
		return transacoesRepository.save(transacoes);
	}
	@PostMapping("/saqueemumaconta")
	public Transacoes saque(@RequestBody @Valid Transacoes transacoes) {
		return transacoesRepository.save(transacoes);
	}

	@GetMapping("/extratodetransacoesdeconta/{id}")
	public Transacoes extrato(@PathVariable(value="id") long id){
		return transacoesRepository.findById(id);
	}
	
	@GetMapping("/extratoporperiodo")
    public List<Transacoes> findAll(@RequestParam(value = "idConta") Long idConta,
    		@RequestParam(value = "inicio") Date dataTransacao,
    		@RequestParam(value = "fim") Date dataFim) throws Exception {
        return transacoesRepository.findExtrato(idConta, dataTransacao, dataFim);
    }

	@GetMapping("/saldo")
    public List<Transacoes> findSaldo(@RequestParam(value = "idConta") Long idConta) throws Exception {
        return transacoesRepository.findSaldo(idConta);
    }

	
}
