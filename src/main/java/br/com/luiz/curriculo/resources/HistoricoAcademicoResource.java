
package br.com.luiz.curriculo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luiz.curriculo.domain.HistoricoAcademico;
import br.com.luiz.curriculo.services.HistoricoAcademicoService;

@RestController
@RequestMapping(value = "/luiz/historico-academico")
public class HistoricoAcademicoResource {

	@Autowired
	private HistoricoAcademicoService historioService;
	
	@GetMapping
	public ResponseEntity<HistoricoAcademico> findHistorico(){
		
		HistoricoAcademico historico = historioService.findHistoricoLuiz();
		
		return ResponseEntity.ok().body(historico);
	}
}
