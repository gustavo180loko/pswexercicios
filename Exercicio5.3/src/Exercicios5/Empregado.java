package Exercicios5;

public class Empregado {
	
	private	String nome;
	private String departamento;
	private int horasTrabalhadas;
	private double salarioHora;
	
	public Empregado(String nome, String departamento, int horasTrabalhadas, double salarioHora) {
		this.nome = nome;
		this.departamento = departamento;
		this.horasTrabalhadas = horasTrabalhadas;
		this.salarioHora = salarioHora;
	}
	
	
	public String dados() {
		return String.format("Nome do empregado: %s\nDepartamento: %s\nHoras Trabalhadas: %d\nSalario por Hora: %.2f\n",nome,departamento,horasTrabalhadas,salarioHora);
	}
	
	public double calculoSalario() {
		double x;
		
		x = (horasTrabalhadas*salarioHora);
		return x;
	}
	
	
	
}
