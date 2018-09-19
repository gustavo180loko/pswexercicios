package edu.udc.psw.aula005;

public class Funcionario extends Pessoa{

		private String dataAdmissao;
		private String cargo;
		private double salario;
	
		public Funcionario(String nome, String dataNascimento, int cpf, String dataAdmissao, String cargo, double salario) {
			super(nome, dataNascimento, cpf);
			this.dataAdmissao = dataAdmissao;
			this.cargo = cargo;
			this.salario = salario;
		}	
}
