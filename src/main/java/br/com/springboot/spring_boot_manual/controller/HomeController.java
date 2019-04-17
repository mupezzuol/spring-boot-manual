package br.com.springboot.spring_boot_manual.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//Precisamos importar a 'engine de templates' nesse caso 'thymeleaf' para encontrar nosso padronização do spring boot
	@RequestMapping("/")
    public String index(){
        return "index";//Usando o padrão do spring boot ele já sabe onde buscar a página em 'templates'
    }
	
}
