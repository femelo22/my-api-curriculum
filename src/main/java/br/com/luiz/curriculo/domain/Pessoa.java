package br.com.luiz.curriculo.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nome;
	private String sobrenome;
	private String email;
	private String telefone;
	private String pequenaDescricao;
	
	@OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
	List<Endereco> endereco = new ArrayList<>();
	
	@OneToOne(mappedBy = "pessoa",cascade = CascadeType.ALL)
	private HistoricoAcademico historicoAcademico;
	
	@OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
	List<ExperienciaProfissional> experienciasProfissionais = new ArrayList<>();
	
	@OneToMany(mappedBy = "pessoa", cascade = CascadeType.ALL)
	List<SoftSkills> softSkills = new ArrayList<>();
	
	//List<RedesSociais> redes = new ArrayList<>();
	//List<HardSkills> hardSkills = new ArrayList<>();
	
	public Pessoa() {}

	public Pessoa(Integer id, String nome, String sobrenome, String email, String telefone, String pequenaDescricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.telefone = telefone;
		this.pequenaDescricao = pequenaDescricao;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

	public String getPequenaDescricao() {
		return pequenaDescricao;
	}

	public void setPequenaDescricao(String pequenaDescricao) {
		this.pequenaDescricao = pequenaDescricao;
	}
	

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
	
	public HistoricoAcademico getHistoricoAcademico() {
		return historicoAcademico;
	}

	public void setHistoricoAcademico(HistoricoAcademico historicoAcademico) {
		this.historicoAcademico = historicoAcademico;
	}
	
	

	/*public List<RedesSociais> getRedes() {
		return redes;
	}

	public void setRedes(List<RedesSociais> redes) {
		this.redes = redes;
	}*/

	public List<ExperienciaProfissional> getExperienciasProfissionais() {
		return experienciasProfissionais;
	}

	public void setExperienciasProfissionais(List<ExperienciaProfissional> experienciasProfissionais) {
		this.experienciasProfissionais = experienciasProfissionais;
	}

	public List<SoftSkills> getSoftSkills() {
		return softSkills;
	}

	public void setSoftSkills(List<SoftSkills> softSkills) {
		this.softSkills = softSkills;
	}

	/*public List<HardSkills> getHardSkills() {
		return hardSkills;
	}

	public void setHardSkills(List<HardSkills> hardSkills) {
		this.hardSkills = hardSkills;
	}*/

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
