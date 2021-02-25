package br.com.luiz.curriculo.domain;

public class RedesSociais {

	private Integer id;
	
	private String rede;
	
	private String link;

	public RedesSociais() {}
	
	public RedesSociais(Integer id, String rede, String link) {
		super();
		this.id = id;
		this.rede = rede;
		this.link = link;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

