package br.com.springboot.spring_boot_manual.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//Precisamos importar a 'engine de templates' nesse caso 'thymeleaf' pois ele pega o template e faz a configuração necessária
	//para que possamos ver nossas páginas no navegador.. 
	//Colocamos o 'spring-boot-starter-thymeleaf' para configurar para nós, é o papel do 'engine templates' fazer isso
	@RequestMapping("/")
    public String index(){
        return "index";
    }
	
}
