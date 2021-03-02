package br.com.luiz.curriculo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.luiz.curriculo.domain.Endereco;
import br.com.luiz.curriculo.domain.dto.EnderecoDTO;
import br.com.luiz.curriculo.repositories.EnderecoRepository;
import br.com.luiz.curriculo.services.exception.ObjectNotFoundException;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public EnderecoDTO findEndereco() {
		
		Endereco endereco = enderecoRepository.findById(1)
				.orElseThrow(() -> new ObjectNotFoundException("Endereço não encontrado"));
		
		return new EnderecoDTO(endereco);
	}
}
