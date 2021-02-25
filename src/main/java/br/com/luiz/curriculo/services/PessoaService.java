package br.com.luiz.curriculo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.luiz.curriculo.domain.Pessoa;
import br.com.luiz.curriculo.repositories.PessoaRepository;
import br.com.luiz.curriculo.services.exception.ObjectNotFoundException;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa findById(Integer id) {
		Pessoa pessoa = pessoaRepository.findById(id)
				.orElseThrow(() -> new ObjectNotFoundException("Pessoa não encontrada"));
		
		return pessoa;
	}
	
	public List<Pessoa> findAll(){
		return pessoaRepository.findAll();
	}
	
	
	public Pessoa save(Pessoa pessoa) {
		pessoa.setId(null);
		return pessoaRepository.save(pessoa);
	}
}
