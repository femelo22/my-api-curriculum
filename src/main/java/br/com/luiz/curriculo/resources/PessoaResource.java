package br.com.luiz.curriculo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luiz.curriculo.domain.Pessoa;
import br.com.luiz.curriculo.services.PessoaService;

@RestController
@RequestMapping(value = "/luiz")
public class PessoaResource {

	@Autowired
	private PessoaService pessoaService;
	
	@GetMapping
	public ResponseEntity<List<Pessoa>> findAll(){
		List<Pessoa> eu = pessoaService.findAll();
		return ResponseEntity.ok().body(eu);
		
	}
}
