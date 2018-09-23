package Exercicios3;

public class Aluno extends Pessoa{

	private String curso;	
	private String serie;
	
	public Aluno(String nome, String curso, String serie) {
		super(nome);
		this.curso = curso;
		this.serie = serie;
	}
	
	public String toString() {
		return String.format("Nome: %s\nCuso: %s\nSerie: %s\n",nome,curso,serie);
	}


}
