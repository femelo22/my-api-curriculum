package br.com.luiz.curriculo.domain.dto;

import br.com.luiz.curriculo.domain.ExperienciaProfissional;

public class ExperienciaDTO {

	private String local;
	
	private String cargo;
	
	private String tipo;
	
	private String dataInicio;
	
	private String dataTermino;
	
	public ExperienciaDTO(ExperienciaProfissional xp) {
		this.local = xp.getLocal();
		this.cargo = xp.getCargo();
		this.tipo = xp.getTipo();
		this.dataInicio = xp.getDataInicio();
		this.dataTermino = xp.getDataTermino();
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}
	
	
}
