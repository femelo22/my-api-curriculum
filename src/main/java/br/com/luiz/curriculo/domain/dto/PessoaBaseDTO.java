package br.com.luiz.curriculo.domain.dto;

import java.util.ArrayList;
import java.util.List;

import br.com.luiz.curriculo.domain.Pessoa;
import br.com.luiz.curriculo.domain.RedesSociais;

public class PessoaBaseDTO {

	private Integer id;
	private String nome;
	private String sobrenome;
	private String email;
	private String pequenaDescricao;
	
	List<RedesSociais> redesSociais = new ArrayList<>();
	
	public PessoaBaseDTO() {}
	
	public PessoaBaseDTO(Pessoa pessoa) {
		this.id = pessoa.getId();
		this.nome = pessoa.getNome();
		this.sobrenome = pessoa.getSobrenome();
		this.email = pessoa.getEmail();
		this.pequenaDescricao = pessoa.getPequenaDescricao();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPequenaDescricao() {
		return pequenaDescricao;
	}

	public void setPequenaDescricao(String pequenaDescricao) {
		this.pequenaDescricao = pequenaDescricao;
	}
	
	
	
	
}
