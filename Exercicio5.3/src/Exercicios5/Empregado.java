package Exercicios5;

public class Empregado {
	
	private	String nome;
	private String departamento;
	private int horasTrabalhadas;
	private double salarioHora;
	
	private int horasExtras;
	private double salarioExtra;
	
	public Empregado(String nome, String departamento, int horasTrabalhadas, double salarioHora) {
		this.nome = nome;
		this.departamento = departamento;
		this.horasTrabalhadas = horasTrabalhadas;
		this.salarioHora = salarioHora;
	}
	
	public Empregado() {
		
	}
	
	
	public String toString() {
		return String.format("Nome do empregado: %s\nDepartamento: %s\nHoras Trabalhadas: %d\nSalario por Hora: %.2f\n",nome,departamento,horasTrabalhadas,salarioHora);
	}
	
	public double calculoSalario(String departamento) {
		double x;
		this.departamento = departamento;
		if(departamento == "Diretoria") {
			x = (horasTrabalhadas*salarioHora)*1.10;
		}else {
			x = (horasTrabalhadas*salarioHora);
		}
		return x;
	}
	
	public double trabalhoExtra(int horasExtras, double salarioExtra) {
		this.horasExtras = horasExtras;
		this.salarioExtra = salarioExtra;
		
		double x;
		x = (horasExtras*salarioExtra);
		return x;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}


	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}


	public double getSalarioHora() {
		return salarioHora;
	}


	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}
	
	
	
	
	
}
