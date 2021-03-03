package br.com.luiz.curriculo.domain.dto;

import br.com.luiz.curriculo.domain.CursoComplementar;

public class CursoDTO {
	
	private String descricao;
	
	private String dataConclusao;
	
	private String linkCertificado;
	
	private String pessoa;
	
	public CursoDTO(CursoComplementar curso) {
		this.descricao = curso.getDescricao();
		this.dataConclusao = curso.getDataConclusao();
		this.linkCertificado = curso.getLinkCertificado();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataConclusao() {
		return dataConclusao;
	}

	public void setDataConclusao(String dataConclusao) {
		this.dataConclusao = dataConclusao;
	}

	public String getLinkCertificado() {
		return linkCertificado;
	}

	public void setLinkCertificado(String linkCertificado) {
		this.linkCertificado = linkCertificado;
	}

	public String getPessoa() {
		return pessoa;
	}

	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}
	
}
