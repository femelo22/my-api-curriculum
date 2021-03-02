package br.com.luiz.curriculo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luiz.curriculo.domain.dto.EnderecoDTO;
import br.com.luiz.curriculo.services.EnderecoService;

@RestController
@RequestMapping(value = "/luiz/endereco")
public class EnderecoResource {

	@Autowired
	private EnderecoService enderecoService;
	
	@GetMapping
	public ResponseEntity<EnderecoDTO> findEndereco(){
		
		EnderecoDTO endereco = enderecoService.findEndereco();
		
		return ResponseEntity.ok().body(endereco);
	}
	
	
}
