package Exercicios3;

public class Diretor extends Funcionario{
	
	private String anoMandato;

	public Diretor(String nome, int numReg, double salario, String dataInicio, String anoMandato) {
		super(nome, numReg, salario, dataInicio);
		this.anoMandato = anoMandato;
	}
	
	public String toString() {
		return String.format("Nome do Diretor: %s\nNumero Registro: %d\nSalario: %.2f\nData Inicio: %s\nAno Mandato: %s\n",nome,numReg,salario,dataInicio,anoMandato);
	}

}
