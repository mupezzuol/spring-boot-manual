package br.com.springboot.spring_boot_manual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.springboot.spring_boot_manual.model.Convidado;
import br.com.springboot.spring_boot_manual.service.ConvidadoService;

@Controller
public class ConvidadoController {
	
	@Autowired //Injeção Spring
	private ConvidadoService convidadoService; //Classe de serviço, para separamos nosso Repository da nossa Controller
	
	@RequestMapping("listaConvidados")
	public String listaConvidados(Model model){
		Iterable<Convidado> convidados = convidadoService.obterTodos();
	    model.addAttribute("convidados", convidados);//Envio para página o atributo
	    return "listaconvidados";
	}
	
	@RequestMapping(value="salvar", method=RequestMethod.POST)
	public String salvar(Convidado convidado) {
		convidadoService.salvar(convidado);
		return "redirect:listaConvidados";
	}
	
}
