package exercicios3;

public class AlunoMestrado extends AlunoGraduado{
	
	public String teseMestrado;

	public AlunoMestrado(String nome, int idade, int cpf, String curso, int ra, String dataGraduacao, String teseMestrado) {
		super(nome, idade, cpf, curso, ra, dataGraduacao);
		this.teseMestrado = teseMestrado;
	}

	public String getTeseMestrado() {
		return teseMestrado;
	}

	public void setTeseMestrado(String teseMestrado) {
		this.teseMestrado = teseMestrado;
	}
	
	
	
}
