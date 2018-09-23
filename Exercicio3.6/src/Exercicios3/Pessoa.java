package Exercicios3;

public class Pessoa {
	
	protected String nome;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return String.format("Nome : %s\n",nome);
	}
}
