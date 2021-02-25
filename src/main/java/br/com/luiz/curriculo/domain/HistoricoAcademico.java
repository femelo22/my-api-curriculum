package br.com.luiz.curriculo.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class HistoricoAcademico implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String tipo;
	
	private String formacao;
	
	private String periodo;
	
	private boolean formado;
	
	private String instituicao;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "pessoa_id")
	private Pessoa pessoa;
	
	public HistoricoAcademico () {}


	public HistoricoAcademico(Integer id, String tipo, String formacao, String periodo, boolean formado,
			String instituicao, Pessoa pessoa) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.formacao = formacao;
		this.periodo = periodo;
		this.formado = formado;
		this.instituicao = instituicao;
		this.pessoa = pessoa;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}


	public String getPeriodo() {
		return periodo;
	}


	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}


	public boolean isFormado() {
		return formado;
	}


	public void setFormado(boolean formado) {
		this.formado = formado;
	}
	
	
	
	
}
