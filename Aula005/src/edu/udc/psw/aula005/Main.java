package edu.udc.psw.aula005;

public class Main {

	public static void main(String args[]) {
		
		Funcionario f = new Funcionario("Jose","18/02/2000",1829412321,"20/05/20170","Faxineiro",1280);
		
		Empresa empresa = new Empresa("Google");
		empresa.adicionarFuncionario(f);
		System.out.println();
		
	}
	
}
