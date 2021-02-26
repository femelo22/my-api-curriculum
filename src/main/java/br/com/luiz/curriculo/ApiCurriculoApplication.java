package br.com.luiz.curriculo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.luiz.curriculo.domain.Endereco;
import br.com.luiz.curriculo.domain.ExperienciaProfissional;
import br.com.luiz.curriculo.domain.HardSkills;
import br.com.luiz.curriculo.domain.HistoricoAcademico;
import br.com.luiz.curriculo.domain.Pessoa;
import br.com.luiz.curriculo.domain.RedesSociais;
import br.com.luiz.curriculo.domain.SoftSkills;
import br.com.luiz.curriculo.repositories.EnderecoRepository;
import br.com.luiz.curriculo.repositories.ExperienciaRepository;
import br.com.luiz.curriculo.repositories.HardSkillsRepository;
import br.com.luiz.curriculo.repositories.HistoricoAcademicoRepository;
import br.com.luiz.curriculo.repositories.PessoaRepository;
import br.com.luiz.curriculo.repositories.RedesSociaisRepository;
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
	
	@Autowired
	private ExperienciaRepository experienciaRepository;
	
	@Autowired
	private RedesSociaisRepository redesRepository;
	
	@Autowired
	private HardSkillsRepository hardRepository;
	
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
		
		ExperienciaProfissional exp1 = new ExperienciaProfissional(null, "Nvoip", "Java Junior Developer", "Tempo integral", "Set. de 2020" , "Atual", pessoa);
		ExperienciaProfissional exp2 = new ExperienciaProfissional(null, "Nvoip", "Java Developer", "Estagio", "Jun. de 2020" , "Set. de 2020", pessoa);
		ExperienciaProfissional exp3 = new ExperienciaProfissional(null, "Esdeva Soluções Integradas", "Javascript Developer", "Estagio", "Set. de 2019" , "Jan. de 2020", pessoa);
		ExperienciaProfissional exp4 = new ExperienciaProfissional(null, "Prefeitura de Juiz de Fora", "Redes e Conectividades", "Estagio", "Mar. de 2019" , "Out. de 2019", pessoa);
		
		RedesSociais redes1 = new RedesSociais(null, "Linkedin", "https://www.linkedin.com/in/luiz-fernando-de-melo-%F0%9F%90%BA-4a553b195/", pessoa);
		RedesSociais redes2 = new RedesSociais(null, "Github", "https://github.com/femelo22", pessoa);
		RedesSociais redes3 = new RedesSociais(null, "Instagram", "https://www.instagram.com/lf.melo/?hl=pt-br", pessoa);
		RedesSociais redes4 = new RedesSociais(null, "Repl", "https://repl.it/@femelo22", pessoa);
		
		HardSkills hard1 = new HardSkills(null, "Tecnologias",pessoa);
		hard1.getConhecimentos().addAll(Arrays.asList("Java 11","Spring Boot","Spring Security","REST","API", "Javascript","Boas práticas e padrões de projeto"));
		
		HardSkills hard2 = new HardSkills(null, "Servidores",pessoa);
		hard2.getConhecimentos().addAll(Arrays.asList("Amazon S3","Apache"));
		
		pessoaRepository.save(pessoa);
		enderecoRepository.save(end);
		historicoRepository.save(histAcad);
		experienciaRepository.saveAll(Arrays.asList(exp1,exp2,exp3,exp4));
		softRepository.saveAll(Arrays.asList(soft1,soft2,soft3,soft4));
		redesRepository.saveAll(Arrays.asList(redes1,redes2,redes3,redes4));
		hardRepository.saveAll(Arrays.asList(hard1,hard2));
	
		
	}

}
