package edu.udc.psw.aula005;

public class Pessoa {
	
	protected String nome;
	protected int cpf;
	protected String dataNascimento;
	
	
	public Pessoa(String nome, String dataNascimento, int cpf) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
