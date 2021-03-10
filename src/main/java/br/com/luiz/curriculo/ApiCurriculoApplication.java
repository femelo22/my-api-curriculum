package br.com.luiz.curriculo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.luiz.curriculo.domain.CursoComplementar;
import br.com.luiz.curriculo.domain.Endereco;
import br.com.luiz.curriculo.domain.ExperienciaProfissional;
import br.com.luiz.curriculo.domain.HardSkills;
import br.com.luiz.curriculo.domain.HistoricoAcademico;
import br.com.luiz.curriculo.domain.Pessoa;
import br.com.luiz.curriculo.domain.RedesSociais;
import br.com.luiz.curriculo.domain.SoftSkills;
import br.com.luiz.curriculo.repositories.CursoComplementarRepository;
import br.com.luiz.curriculo.repositories.EnderecoRepository;
import br.com.luiz.curriculo.repositories.ExperienciaRepository;
import br.com.luiz.curriculo.repositories.HardSkillsRepository;
import br.com.luiz.curriculo.repositories.HistoricoAcademicoRepository;
import br.com.luiz.curriculo.repositories.PessoaRepository;
import br.com.luiz.curriculo.repositories.RedeSocialRepository;
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
	private RedeSocialRepository redesRepository;
	
	@Autowired
	private HardSkillsRepository hardRepository;
	
	@Autowired
	private CursoComplementarRepository cursosRepository;
	
	public void run(String... args) throws Exception {
		
		System.out.println("Rodante ✔");
		
		Pessoa pessoa = new Pessoa(null, "Luiz Fernando", "Melo Gonçalves", "lf.devmelo@gmail.com", "32999956148",
				"Estudante de sistemas de informação e amante da programação, futuro dev master!");
		
		Endereco end = new Endereco(null, "Brasil", "Juiz de Fora", "Minas Gerais", "Rua Coronel Vaz de Melo", "124", "201", "Bom Pastor", "36021-370", pessoa);
		
		HistoricoAcademico histAcad = new HistoricoAcademico(null, "Bacharelado", "Sistemas de Informação", "7° Período", false ,"Faculdade Metodista Granbery", pessoa);
		
		SoftSkills soft1 = new SoftSkills(null, "Comunicativo", "Comunicação clara com as pessoa que trabalho e um bom ouvinte", pessoa);
		SoftSkills soft2 = new SoftSkills(null, "Flexível", "Boa habilidade de adaptação a mudanças", pessoa);
		SoftSkills soft3 = new SoftSkills(null, "Motivador", "Gosto de incentivar a equipe a dar sempre seu melhor", pessoa);
		SoftSkills soft4 = new SoftSkills(null, "Positvo", "Por mais difíceis que sejam os desafios, busco sempre manter a positividade", pessoa);
		
		ExperienciaProfissional exp1 = new ExperienciaProfissional(null, "Nvoip", "Java Junior Developer", "Tempo integral", "Set. de 2020" , "Atual", pessoa);
		ExperienciaProfissional exp2 = new ExperienciaProfissional(null, "Nvoip", "Java Developer", "Estagio", "Jun. de 2020" , "Set. de 2020", pessoa);
		ExperienciaProfissional exp3 = new ExperienciaProfissional(null, "Esdeva Soluções Integradas", "Javascript Developer", "Estagio", "Set. de 2019" , "Jan. de 2020", pessoa);
		ExperienciaProfissional exp4 = new ExperienciaProfissional(null, "Prefeitura de Juiz de Fora", "Redes e Conectividades", "Estagio", "Mar. de 2019" , "Out. de 2019", pessoa);
		
		RedesSociais redes1 = new RedesSociais(null, "Linkedin", "https://www.linkedin.com/in/luiz-fernando-de-melo-%F0%9F%90%BA-4a553b195/", pessoa);
		RedesSociais redes2 = new RedesSociais(null, "Github", "https://github.com/femelo22", pessoa);
		RedesSociais redes3 = new RedesSociais(null, "Instagram", "https://www.instagram.com/lf.melo/?hl=pt-br", pessoa);
		RedesSociais redes4 = new RedesSociais(null, "Repl", "https://repl.it/@femelo22", pessoa);
		
		HardSkills hard1 = new HardSkills(null, "Tecnologias",pessoa);
		hard1.getConhecimentos().addAll(Arrays.asList("Java 11","Spring Boot", "Github" ,"Spring Security","REST","API", "Javascript","Node JS","Boas práticas e padrões de projeto"));
		
		HardSkills hard2 = new HardSkills(null, "Servidores",pessoa);
		hard2.getConhecimentos().addAll(Arrays.asList("Amazon S3","Apache","Heroku"));
		
		HardSkills hard3 = new HardSkills(null, "Banco de dados",pessoa);
		hard3.getConhecimentos().addAll(Arrays.asList("MySQL"));
		
		
		CursoComplementar c1 = new CursoComplementar(null, "Criando um controle de vendas desktop com Java e MySQL", "30 de Julho de 2020",
				"https://drive.google.com/file/d/1tMfvinB1pG2NZk645AoV6ZvakQviFFOM/view?usp=sharing", pessoa);
		
		CursoComplementar c2 = new CursoComplementar(null, "Projetos ágeis com SCRUM", "13 de Outubro de 2020",
				"https://drive.google.com/file/d/1m7eoxsjvxvbM2Tl17NvnLVv93sGg5IIB/view?usp=sharing", pessoa);
		
		CursoComplementar c3 = new CursoComplementar(null, "Intodrução ao Node JS + Express", "9 de Outubro de 2020",
				"https://drive.google.com/file/d/1tMfvinB1pG2NZk645AoV6ZvakQviFFOM/view?usp=sharing", pessoa);
		
		CursoComplementar c4 = new CursoComplementar(null, "IT Trends: Processos Seletivos", "24 de Setembro de 2020",
				"https://drive.google.com/file/d/15GwX-tqWnBoxPx9rlprwdRFEooQ8qUNE/view?usp=sharing", pessoa);
		
		CursoComplementar c5 = new CursoComplementar(null, "Hackathon - Combate a pandemia", "23 de Julho de 2020",
				"https://drive.google.com/file/d/1zv3h27PhCRbP0xma_vxiTrsfQg6rKsOn/view?usp=sharing", pessoa);
		
		CursoComplementar c6 = new CursoComplementar(null, "Participação no evento MEETUP", "12 de Maio de 2020",
				"https://drive.google.com/file/d/1GZx6NTo7IQimv9fm8GCfeWO4UN-1yDgb/view?usp=sharing", pessoa);

		CursoComplementar c7 = new CursoComplementar(null, "Desenvolvimento web com PHP e MySQL", "14 de Abril de 2020",
				"https://drive.google.com/file/d/1UoWPQ-r3uYSdpcxKUjrBjk73xwjes-Cl/view?usp=sharing", pessoa);

		CursoComplementar c8 = new CursoComplementar(null, "Congresso Metodista: Tecnologia, Criatividade e Ética", "23 de Julho de 2020",
				"https://drive.google.com/file/d/1tgAqHL86BzRKxnkc_wKl0rn97KmUFhcA/view?usp=sharing", pessoa);
		
		
		pessoaRepository.save(pessoa);
		enderecoRepository.save(end);
		historicoRepository.save(histAcad);
		experienciaRepository.saveAll(Arrays.asList(exp1,exp2,exp3,exp4));
		softRepository.saveAll(Arrays.asList(soft1,soft2,soft3,soft4));
		redesRepository.saveAll(Arrays.asList(redes1,redes2,redes3,redes4));
		hardRepository.saveAll(Arrays.asList(hard1,hard2));
		cursosRepository.saveAll(Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8));
	}

}
