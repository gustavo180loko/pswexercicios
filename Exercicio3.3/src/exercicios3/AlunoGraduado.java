package exercicios3;

public class AlunoGraduado extends AlunoGraduacao{
	
	private String dataGraduacao;
	
	public AlunoGraduado(String nome, int idade, int cpf, String curso, int ra, String dataGraduacao) {
		super(nome, idade, cpf, curso, ra);
		this.dataGraduacao = dataGraduacao;
	}

	public String getDataGraduacao() {
		return dataGraduacao;
	}

	public void setDataGraduacao(String dataGraduacao) {
		this.dataGraduacao = dataGraduacao;
	}
	
}
