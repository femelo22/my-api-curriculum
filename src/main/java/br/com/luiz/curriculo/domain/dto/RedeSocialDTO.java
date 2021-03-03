package br.com.luiz.curriculo.domain.dto;

import br.com.luiz.curriculo.domain.RedesSociais;

public class RedeSocialDTO{

	private String rede;
	private String link;
	
	public RedeSocialDTO() {}
	
	public RedeSocialDTO(RedesSociais redes) {
		this.rede = redes.getRede();
		this.link = redes.getLink();
	}

	public String getRede() {
		return rede;
	}

	
	public void setRede(String rede) {
		this.rede = rede;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
}
