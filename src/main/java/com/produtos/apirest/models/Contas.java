package com.produtos.apirest.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contas")
public class Contas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idConta;
	private Long idPessoa;
	private Double saldo;
	private Double limiteSaqueDiario;
	private Boolean flagAtivo;
	private Long tipoConta;
	private Date DataCriacao;
	public Long getIdConta() {
		return idConta;
	}
	public void setIdConta(Long idConta) {
		this.idConta = idConta;
	}
	public Long getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Long idPessoa) {
		this.idPessoa = idPessoa;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Double getLimiteSaqueDiario() {
		return limiteSaqueDiario;
	}
	public void setLimiteSaqueDiario(Double limiteSaqueDiario) {
		this.limiteSaqueDiario = limiteSaqueDiario;
	}
	public Boolean getFlagAtivo() {
		return flagAtivo;
	}
	public void setFlagAtivo(Boolean flagAtivo) {
		this.flagAtivo = flagAtivo;
	}
	public Long getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(Long tipoConta) {
		this.tipoConta = tipoConta;
	}
	public Date getDataCriacao() {
		return DataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		DataCriacao = dataCriacao;
	}
	
	
}
