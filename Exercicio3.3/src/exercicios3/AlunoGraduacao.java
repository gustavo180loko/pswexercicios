package exercicios3;

public class AlunoGraduacao extends Aluno{
	
	public String curso;
	public int ra;
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}
	
	public AlunoGraduacao(String nome, int idade, int cpf, String curso, int ra) {
		super();
		this.curso = curso;
		this.ra = ra;
	}
	
}
