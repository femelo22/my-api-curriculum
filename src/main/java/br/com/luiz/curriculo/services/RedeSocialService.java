package br.com.luiz.curriculo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.luiz.curriculo.domain.RedesSociais;
import br.com.luiz.curriculo.repositories.RedeSocialRepository;

@Service
public class RedeSocialService {

	@Autowired
	private RedeSocialRepository redeRepository;
	
	public List<RedesSociais> findAll(){
		return redeRepository.findAll();	
	}
}
