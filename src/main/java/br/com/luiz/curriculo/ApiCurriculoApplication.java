package br.com.luiz.curriculo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.luiz.curriculo.domain.Endereco;
import br.com.luiz.curriculo.domain.HistoricoAcademico;
import br.com.luiz.curriculo.domain.Pessoa;
import br.com.luiz.curriculo.domain.SoftSkills;
import br.com.luiz.curriculo.repositories.EnderecoRepository;
import br.com.luiz.curriculo.repositories.HistoricoAcademicoRepository;
import br.com.luiz.curriculo.repositories.PessoaRepository;
import br.com.luiz.curriculo.repositories.SoftSkillsRepository;

@SpringBootApplication
public class ApiCurriculoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ApiCurriculoApplication.class, args);
	}
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private HistoricoAcademicoRepository historicoRepository;

	@Autowired
	private SoftSkillsRepository softRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Rodante ✔");
		
		Pessoa pessoa = new Pessoa(null, "Luiz Fernando", "Melo Gonçalves", "luiz123jfmg@gmail.com", "32999956148",
				"Aspirante a desenvolvedor, apaixonado pela programação e motivado por novos desafios!");
		
		Endereco end = new Endereco(null, "Brasil", "Juiz de Fora", "Minas Gerais", "Rua Coronel Vaz de Melo", "124", "201", "Bom Pastor", "36021-370", pessoa);
		
		HistoricoAcademico histAcad = new HistoricoAcademico(null, "Bacharelado", "Sistemas de Informação", "7° Período", false ,"Faculdade Metodista Granbery", pessoa);
		
		SoftSkills soft1 = new SoftSkills(null, "Comunicativo", "Comunicação clara com as pessoa que trabalho e um bom ouvinte", pessoa);
		SoftSkills soft2 = new SoftSkills(null, "Flexível", "Boa habilidade de adaptação a mudanças", pessoa);
		SoftSkills soft3 = new SoftSkills(null, "Motivador", "Gosto de incentivar a equipe a dar sempre seu melhor", pessoa);
		SoftSkills soft4 = new SoftSkills(null, "Positvo", "Por mais difíceis que sejam os desafios, sempre matenho a positividade", pessoa);
		
		pessoaRepository.save(pessoa);
		enderecoRepository.save(end);
		historicoRepository.save(histAcad);
		softRepository.saveAll(Arrays.asList(soft1,soft2,soft3,soft4));
		
	}

}
