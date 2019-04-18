package br.com.springboot.spring_boot_manual.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.springboot.spring_boot_manual.model.Convidado;

//CrudRepository precisamos de retono o Objeto, que seria Convidado, e o outro param é o tipo do serializados, sempre Long
@Repository
public interface ConvidadoRepository extends CrudRepository<Convidado, Long>{
	
	
}
