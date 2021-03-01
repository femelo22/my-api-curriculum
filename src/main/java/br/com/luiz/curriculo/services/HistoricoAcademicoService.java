package br.com.luiz.curriculo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.luiz.curriculo.domain.HistoricoAcademico;
import br.com.luiz.curriculo.repositories.HistoricoAcademicoRepository;
import br.com.luiz.curriculo.services.exception.ObjectNotFoundException;

@Service
public class HistoricoAcademicoService {

	@Autowired
	private HistoricoAcademicoRepository historioRepository;
	
	public HistoricoAcademico findHistoricoLuiz() {
		return historioRepository.findById(1)
				.orElseThrow(() -> new ObjectNotFoundException("Historico não encontrado"));
	}
}
