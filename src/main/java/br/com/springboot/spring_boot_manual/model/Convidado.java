package br.com.springboot.spring_boot_manual.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="convidado")
public class Convidado {
    
	@Id @GeneratedValue
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    
    
    //Constructor's
    public Convidado() {
    	
    }
    
    public Convidado(String nome, String email, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
    
	public Convidado(Long id, String nome, String email, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Convidado [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
	}


	//Getter' and Setter's
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
