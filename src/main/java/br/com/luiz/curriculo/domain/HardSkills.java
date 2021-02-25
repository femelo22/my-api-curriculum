package br.com.luiz.curriculo.domain;

import java.util.ArrayList;
import java.util.List;

public class HardSkills {

	public Integer id;
	
	public String descricao;
	
	List<CursosComplementares> cursosComplementares = new ArrayList<>();
	
	public HardSkills() {}

	public HardSkills(Integer id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
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

	public List<CursosComplementares> getCursosComplementares() {
		return cursosComplementares;
	}

	public void setCursosComplementares(List<CursosComplementares> cursosComplementares) {
		this.cursosComplementares = cursosComplementares;
	}
	
	
	
}
