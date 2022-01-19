package br.com.scale.users.Dados;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DadosController {

	@Autowired
	private DadosService dadosService;
	
	@GetMapping("{page}")
	public Dados dados(@PathVariable long page){
		return dadosService.dados(page);
	}
}
