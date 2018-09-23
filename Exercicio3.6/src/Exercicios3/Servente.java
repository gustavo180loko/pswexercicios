package Exercicios3;

public class Servente extends Funcionario{

	private String setor;
	
	public Servente(String nome, int numReg, double salario, String dataInicio, String setor) {
		super(nome, numReg, salario, dataInicio);
		this.setor = setor;
	}
	
	public String toString() {
		return String.format("Nome: %s\nNumero Registro: %d\nSalario: %.2f\nData Inicio: %s\nSetor: %s\n",nome,numReg,salario,dataInicio,setor);
	}



}
