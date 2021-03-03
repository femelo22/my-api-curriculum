package br.com.luiz.curriculo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.luiz.curriculo.domain.Endereco;
import br.com.luiz.curriculo.domain.dto.EnderecoDTO;
import br.com.luiz.curriculo.repositories.EnderecoRepository;
import br.com.luiz.curriculo.services.exception.DataIntegrityException;
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
	
	
	public Endereco save(Endereco endereco) {
		endereco.setId(null);
		return this.enderecoRepository.save(endereco);
	}
	
	
	public void deleteEnderecoById(Integer id) {
		
		this.findEndereco();
		try {
			this.enderecoRepository.deleteById(id);
		} catch (Exception e) {
			throw new ObjectNotFoundException("Endereço não encontrado");
		}
		
	}
}
