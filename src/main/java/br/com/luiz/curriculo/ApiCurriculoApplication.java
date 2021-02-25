package br.com.luiz.curriculo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.luiz.curriculo.domain.Pessoa;
import br.com.luiz.curriculo.repositories.PessoaRepository;
import br.com.luiz.curriculo.services.PessoaService;

@SpringBootApplication
public class ApiCurriculoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ApiCurriculoApplication.class, args);
	}
	
	@Autowired
	private PessoaRepository pessoaRepository;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Rodante ✔");
		
		Pessoa pessoa = new Pessoa(null, "Luiz Fernando", "Melo Gonçalves", "luiz123jfmg@gmail.com", "32999956148",
				"Aspirante a desenvolvedor, apaixonado pela programação e motivado por novos desafios!");
		
		pessoaRepository.saveAll(Arrays.asList(pessoa));
		
	}

}
