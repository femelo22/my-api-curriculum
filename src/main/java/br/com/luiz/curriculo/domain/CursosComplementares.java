package br.com.luiz.curriculo.domain;

public class CursosComplementares {

	private Integer id;
	
	private String descricao;
	
	private String dataConclusao;
	
	private String linkCertificado;
	
	private Pessoa pessoa;
	
	public CursosComplementares () {}

	public CursosComplementares(Integer id, String descricao, String dataConclusao, String linkCertificado,Pessoa pessoa) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.dataConclusao = dataConclusao;
		this.linkCertificado = linkCertificado;
		this.pessoa = pessoa;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLinkCertificado() {
		return linkCertificado;
	}

	public void setLinkCertificado(String linkCertificado) {
		this.linkCertificado = linkCertificado;
	}

	public String getDataConclusao() {
		return dataConclusao;
	}


	public void setDataConclusao(String dataConclusao) {
		this.dataConclusao = dataConclusao;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
}
