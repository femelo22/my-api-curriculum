package br.com.luiz.curriculo.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.luiz.curriculo.domain.RedesSociais;
import br.com.luiz.curriculo.domain.dto.RedeSocialDTO;
import br.com.luiz.curriculo.repositories.RedeSocialRepository;

@Service
public class RedeSocialService {

	@Autowired
	private RedeSocialRepository redeRepository;
	
	public List<RedesSociais> findAll(){
		return redeRepository.findAll();	
	}
	
	public List<RedeSocialDTO> findRedes(){
		
		List<RedesSociais> redes = redeRepository.findAll();
		
		List<RedeSocialDTO> redesDto = redes.stream().map(obj -> new RedeSocialDTO(obj)).collect(Collectors.toList());
		
		return redesDto;
	}

}
