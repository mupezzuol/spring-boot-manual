package br.com.springboot.spring_boot_manual.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springboot.spring_boot_manual.model.Convidado;
import br.com.springboot.spring_boot_manual.repository.ConvidadoRepository;

//Classe de serviço, aqui fazemos comunicação com o banco etc...
@Service
public class ConvidadoService {
	
	//Spring injeta para nós
	@Autowired
	private ConvidadoRepository convidadoRepository;
	
	//Método de serviço para buscar todos os registros de Convidados
	public Iterable<Convidado> obterTodos(){
		return convidadoRepository.findAll();
	}
	
	//Método de serviço para salvar o Convidado
	public void salvar(Convidado convidado) {
		convidadoRepository.save(convidado);
	}
	
}
