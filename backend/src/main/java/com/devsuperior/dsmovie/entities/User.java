package com.devsuperior.dsmovie.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User {

	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;
	// FIM ATRIBUTOS

	// CONSTRUTOR (VAZIO)
	public User() {

	}
	// FIM CONSTRUTOR

	// CONSTRUTOR
	public User(Long id, String email) {
		this.id = id;
		this.email = email;
	}
	// FIM CONSTRUTOR

	// GETTERS E SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	// FIM GETTERS E SETTERS
}