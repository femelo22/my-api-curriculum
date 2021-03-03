package br.com.luiz.curriculo.services;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.luiz.curriculo.domain.ExperienciaProfissional;
import br.com.luiz.curriculo.domain.dto.ExperienciaDTO;
import br.com.luiz.curriculo.repositories.ExperienciaRepository;

@Service
public class ExperienciaService {

	@Autowired
	private ExperienciaRepository xpRepository;
	
	public List<ExperienciaDTO> findExperiencias(){
		
		List<ExperienciaProfissional> xps = xpRepository.findAll();
		
		List<ExperienciaDTO> xpsDto = xps.stream().map(obj -> new ExperienciaDTO(obj)).collect(Collectors.toList());
		
		return xpsDto;
	}
}
