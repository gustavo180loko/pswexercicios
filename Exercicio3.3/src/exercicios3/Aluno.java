package exercicios3;

public class Aluno {
	
	public String nome;
	public int idade;
	public int cpf;
	
	public Aluno(String nome, int idade, int cpf) { 
		
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	public Aluno() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	
	
	
	
}
