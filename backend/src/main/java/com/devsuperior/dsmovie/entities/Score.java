package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {

	// ATRIBUTOS
	@EmbeddedId
	private ScorePK id = new ScorePK();
	private Double value;
	// FIM ATRIBUTOS

	// CONSTRUTOR (VAZIO)
	public Score() {

	}
	// FIM CONSTRUTOR

	// GETTERS E SETTERS

	// ESSE MÉTODO VAI SERVIR PARA INFORMAR UM FILME E ASSOCIAR O FILME COM O SCORE.
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}

	// ESSE MÉTODO VAI SERVIR PARA INFORMAR UM USUÁRIO E ASSOCIAR O USUÁRIO COM O
	// SCORE.
	public void setUser(User user) {
		id.setUser(user);
	}

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	// FIM GETTERS E SETTERS
}