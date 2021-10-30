package com.example.apiGAMA.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotEmpty
	@Length(min = 3, max = 100, message = "Valor entre 3 e 100 caracteres")
	private String nome;
	
	@NotEmpty
	@Length(min = 3, max = 100)
	private String senha;

	

	public Usuario(@NotEmpty @Length(min = 3, max = 100, message = "Valor entre 3 e 100 caracteres") String nome,
			@NotEmpty @Length(min = 3, max = 100) String senha) {
		super();
		this.nome = nome;
		this.senha = senha;
	}
	
	public Usuario() {
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome) && Objects.equals(senha, other.senha);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
