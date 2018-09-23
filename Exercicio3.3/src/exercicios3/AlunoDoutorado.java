package exercicios3;

public class AlunoDoutorado extends AlunoMestrado{
	
	public String teseDoutorado;

	public AlunoDoutorado(String nome, int idade, int cpf, String curso, int ra, String dataGraduacao, String teseMestrado, String teseDoutorado) {
		super(nome, idade, cpf, curso, ra, dataGraduacao, teseMestrado);
		this.teseDoutorado = teseDoutorado;
	}
	
}
