package com.example.jast.exMy.Ex3;

public class Persona {
	String nome;
	int eta;

	public Persona() {

	}

	public Persona(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
	}

	public int getEta() {
		return eta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEta(int eta) {
		this.eta = eta;

	}

	@Override
	public String toString() {
		return this.nome;
	}

}