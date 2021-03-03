package br.com.luiz.curriculo.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.luiz.curriculo.domain.CursoComplementar;
import br.com.luiz.curriculo.domain.dto.CursoDTO;
import br.com.luiz.curriculo.repositories.CursoComplementarRepository;

@Service
public class CursoComplementarService {

	@Autowired
	private CursoComplementarRepository cursoRepository;
	
	public List<CursoDTO> findCursos() {
		
		List<CursoComplementar> cursos = cursoRepository.findAll();
		
		List<CursoDTO> cursosDto = cursos.stream().map(obj -> new CursoDTO(obj)).collect(Collectors.toList());
		
		return cursosDto;
	}
}
