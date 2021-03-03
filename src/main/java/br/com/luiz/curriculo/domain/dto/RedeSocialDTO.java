package br.com.luiz.curriculo.domain.dto;

import br.com.luiz.curriculo.domain.RedesSociais;
import br.com.luiz.curriculo.domain.interfaces.MyNameInterface;

public class RedeSocialDTO implements MyNameInterface{

	private String rede;
	private String link;
	
	private String pessoa;
	
	public RedeSocialDTO() {}
	
	public RedeSocialDTO(RedesSociais redes) {
		this.rede = redes.getRede();
		this.link = redes.getLink();
		this.pessoa = MyNameInterface.getMyName();
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

	public String getPessoa() {
		return pessoa;
	}

	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}

	public String meuNome() {
		return "Luiz Fernando de Melo Gonçalves";
	}
}
