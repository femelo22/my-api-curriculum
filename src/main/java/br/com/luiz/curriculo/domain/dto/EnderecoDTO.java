package br.com.luiz.curriculo.domain.dto;

import br.com.luiz.curriculo.domain.Endereco;
import br.com.luiz.curriculo.domain.Pessoa;

public class EnderecoDTO {
	
	private String pais;
	private String estado;
	private String cidade;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cep;
	
	
	public EnderecoDTO(Endereco endereco) {
		this.pais = endereco.getPais();
		this.estado = endereco.getEstado();
		this.cidade = endereco.getCidade();
		this.logradouro = endereco.getLogradouro();
		this.numero = endereco.getNumero();
		this.complemento = endereco.getComplemento();
		this.bairro = endereco.getBairro();
		this.cep = endereco.getCep();
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
}
