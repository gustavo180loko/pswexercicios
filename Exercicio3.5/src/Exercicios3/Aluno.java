package Exercicios3;

public class Aluno {
	
	public String nome;
	public String curso;
	public int idade;
	public int rg;
	public int cpf;
	
	public int nota1;
	public int nota2;
	public int nota3;
	public int nota4;
	
	public int notaFinal;
	
	public Aluno(String nome, int idade, int rg, int cpf, String curso) {
		
		this.nome = nome;
		this.idade = idade;
		this.rg = rg;
		this.cpf = cpf;
		this.curso = curso;
	}
	
	public Aluno() {
	}
	
	public int testeNotas(int nota1, int nota2, int nota3, int nota4) {
			this.nota1 = nota1;
		
			this.nota2 = nota2;
		
			this.nota1 = nota3;
	
			this.nota1 = nota4;
		
		notaFinal = (nota1+nota2+nota3+nota4);
		return notaFinal;
	}
	
	public String resultado(int notaFinal) {
		
		this.notaFinal = notaFinal;
		
		if(notaFinal < 240) {
			return String.format("Reprovado");
		}else {
			return String.format("Aprovado");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	
	
}
