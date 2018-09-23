package Exercicios3;

public class Funcionario extends Pessoa{

	protected int numReg;
	protected double salario;
	protected String dataInicio;
	
	public Funcionario(String nome, int numReg, double salario, String dataInicio) {
		super(nome);
		this.numReg = numReg;
		this.salario = salario;
		this.dataInicio = dataInicio;
	}
	
	public String toString() {
		return String.format("Nome: %s\nNumero Registro: %d\nSalario: %.2f\nData Inicio: %s\n",nome,numReg,salario,dataInicio);
	}

}
