package br.com.luiz.curriculo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luiz.curriculo.domain.HardSkills;
import br.com.luiz.curriculo.domain.HistoricoAcademico;
import br.com.luiz.curriculo.domain.Pessoa;
import br.com.luiz.curriculo.domain.SoftSkills;
import br.com.luiz.curriculo.domain.dto.CursoDTO;
import br.com.luiz.curriculo.domain.dto.EnderecoDTO;
import br.com.luiz.curriculo.domain.dto.ExperienciaDTO;
import br.com.luiz.curriculo.domain.dto.RedeSocialDTO;
import br.com.luiz.curriculo.repositories.HardSkillsRepository;
import br.com.luiz.curriculo.repositories.SoftSkillsRepository;
import br.com.luiz.curriculo.services.CursoComplementarService;
import br.com.luiz.curriculo.services.EnderecoService;
import br.com.luiz.curriculo.services.ExperienciaService;
import br.com.luiz.curriculo.services.HistoricoAcademicoService;
import br.com.luiz.curriculo.services.PessoaService;
import br.com.luiz.curriculo.services.RedeSocialService;

@RestController
@RequestMapping(value = "/luiz")
public class PessoaResource {

	@Autowired
	private PessoaService pessoaService;
	
	@Autowired
	private EnderecoService enderecoService;
	
	@Autowired
	private CursoComplementarService cursoService;
	
	@Autowired
	private HistoricoAcademicoService historioService;
	
	@Autowired
	private RedeSocialService redeService;
	
	@Autowired
	private ExperienciaService xpService;

	@Autowired
	private HardSkillsRepository hardRepository;
	
	@Autowired
	private SoftSkillsRepository softRepository;
	
	@GetMapping()
	public ResponseEntity<List<Pessoa>> findAll(){
		
		List<Pessoa> eu = pessoaService.findAll();
		
		return ResponseEntity.ok().body(eu);
	}
	
	
	
	@GetMapping("/endereco")
	public ResponseEntity<EnderecoDTO> findEndereco(){
		
		EnderecoDTO endereco = enderecoService.findEndereco();
		
		return ResponseEntity.ok().body(endereco);
	}
	

	@GetMapping("/cursos-complementares")
	public ResponseEntity<List<CursoDTO>> findCursos(){
		
		List<CursoDTO> cursos = this.cursoService.findCursos();
		
		return ResponseEntity.ok().body(cursos);
	}
	
	@GetMapping("/historico-academico")
	public ResponseEntity<HistoricoAcademico> findHistorico(){
		
		HistoricoAcademico historico = historioService.findHistoricoLuiz();
		
		return ResponseEntity.ok().body(historico);
	}
	
	@GetMapping("/redes-sociais")
	public ResponseEntity<List<RedeSocialDTO>> findRedes(){
		
		List<RedeSocialDTO> redes = redeService.findRedes();
		
		return ResponseEntity.ok().body(redes);
	}
	
	@GetMapping("/experiencias-profissionais")
	public ResponseEntity<List<ExperienciaDTO>> findExperiencia(){
	
		List<ExperienciaDTO> xps = this.xpService.findExperiencias();
		
		return ResponseEntity.ok().body(xps);
	}
	
	@GetMapping("/hard-skills")
	public ResponseEntity<List<HardSkills>> findHards(){
		
		List<HardSkills> hards = this.hardRepository.findAll();
		
		return ResponseEntity.ok().body(hards);
	}
	
	@GetMapping("/soft-skills")
	public ResponseEntity<List<SoftSkills>> findSofts(){
		
		List<SoftSkills> softs = this.softRepository.findAll();
		
		return ResponseEntity.ok().body(softs);
	}

}
