package br.com.springboot.spring_boot_manual;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@SpringBootApplication
public class SpringBootInicializacao {
	
	//Inicialização do Spring Boot
    public static void main(String[] args){
        SpringApplication.run(SpringBootInicializacao.class, args);
    }
    
    @Bean //Ser reconhecido como um Bean do Spring, para gerencia-lo
    public DataSource dataSource(){
    	DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUsername("root");
        dataSource.setPassword("postgres");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_boot_manual");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return dataSource;
    }
    
}
