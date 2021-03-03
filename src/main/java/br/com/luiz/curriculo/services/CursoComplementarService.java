package br.com.luiz.curriculo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.luiz.curriculo.domain.CursoComplementar;
import br.com.luiz.curriculo.repositories.CursoComplementarRepository;

@Service
public class CursoComplementarService {

	@Autowired
	private CursoComplementarRepository cursoRepository;
	
	public List<CursoComplementar> findCursos() {
		return cursoRepository.findAll();
	}
}
