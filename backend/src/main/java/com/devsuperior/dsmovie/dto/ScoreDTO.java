package com.devsuperior.dsmovie.dto;

public class ScoreDTO {

	// ATRIBUTOS
	private Long movieId;
	private String email;
	private Double score;
	// FIM ATRIBUTOS

	// CONSTRUTOR (VAZIO)
	public ScoreDTO() {

	}
	// FIM CONSTRUTOR

	// GETTERS E SETTERS
	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}
	// FIM GETTERS E SETTERS
}