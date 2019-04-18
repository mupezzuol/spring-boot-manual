package br.com.springboot.spring_boot_manual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.spring_boot_manual.model.Convidado;
import br.com.springboot.spring_boot_manual.service.ConvidadoService;

@RestController
public class ConvidadoRestController {
	
	@Autowired //Injeção Spring
	private ConvidadoService convidadoService;//Camada de Serviço que criamos
	
	@RequestMapping("listaConvidadosRest")
	public Iterable<Convidado> listaConvidados(Model model){
	    return convidadoService.obterTodos();
	}
	
}
