package com.devsuperior.dsmovie.entities;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ScorePK implements Serializable {

	private static final long serialVersionUID = 1L;

	// ATRIBUTOS (REFERÊNCIAS PARA MOVIE E USER)
	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	// FIM ATRIBUTOS

	// CONSTRUTOR (VAZIO)
	public ScorePK() {

	}
	// FIM CONSTRUTOR

	// GETTERS E SETTERS
	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	// FIM GETTERS E SETTERS
}