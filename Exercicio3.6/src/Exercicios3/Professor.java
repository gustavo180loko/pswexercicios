package Exercicios3;

public class Professor extends Funcionario{
	
	private String materia;

	public Professor(String nome, int numReg, double salario, String dataInicio, String materia) {
		super(nome, numReg, salario, dataInicio);
		this.materia = materia;
	}
	
	public String toString() {
		return String.format("Nome do Professor: %s\nNumero Registro: %d\nSalario: %.2f\nData Inicio: %s\nMateria: %s\n",nome,numReg,salario,dataInicio,materia);
	}

}
