package br.com.luiz.curriculo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luiz.curriculo.domain.RedesSociais;
import br.com.luiz.curriculo.domain.dto.RedeSocialDTO;
import br.com.luiz.curriculo.services.RedeSocialService;

@RestController
@RequestMapping(value = "/luiz")
public class RedeSocialResource {
	
	@Autowired
	private RedeSocialService redeService;

	@GetMapping(value = "/redes-sociais")
	public ResponseEntity<List<RedeSocialDTO>> findRedes(){
		
		List<RedesSociais> redes = redeService.findAll();
		
		List<RedeSocialDTO> redeDto = redes.stream().map(obj -> new RedeSocialDTO(obj)).collect(Collectors.toList());
		
		return ResponseEntity.ok().body(redeDto);
	}
}
