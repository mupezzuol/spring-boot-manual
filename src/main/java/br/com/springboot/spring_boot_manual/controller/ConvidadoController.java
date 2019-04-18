package br.com.springboot.spring_boot_manual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.springboot.spring_boot_manual.model.Convidado;
import br.com.springboot.spring_boot_manual.repository.ConvidadoRepository;

@Controller
public class ConvidadoController {
	
	@Autowired //Injeção Spring
	private ConvidadoRepository convidadoRepository; 
	
	
	@RequestMapping("listaConvidados")
	public String listaConvidados(Model model){
		Iterable<Convidado> convidados = convidadoRepository.findAll();
	    model.addAttribute("convidados", convidados);//Envio para página o atributo
	    return "listaconvidados";
	}
	
	@RequestMapping(value="salvar", method=RequestMethod.POST)
	public String salvar(Convidado convidado) {
		convidadoRepository.save(convidado);
		return "redirect:listaConvidados";
	}
	
}
