package Exercicios5;

public class Funcionario {
	
	private String nome;
	private String sobrenome;
	private String departamento;
	private String dataInicio;
	private String cpf;
	private String rg;
	private float salario;
	
	public Funcionario(String nome, String sobrenome, String departamento, String dataInicio, String cpf, String rg, float salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.departamento = departamento;
		this.dataInicio = dataInicio;
		this.cpf = cpf;
		this.rg = rg;
		if(salario < 0.0) {
			this.salario = (float) 0.0;
		}else {
			this.salario = salario;
		}
	}
	
	public String toString() {
		
		return String.format("Nome: %s %s\nDepartamento: %s\nData de Entrada: %s\nCPF: %s\nRG: %s\nSalario: %.2f",nome,sobrenome,departamento,dataInicio,cpf,rg,salario);
	
	}
	
	public void recebeAumento(float mais) {
		salario += mais;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	
}
