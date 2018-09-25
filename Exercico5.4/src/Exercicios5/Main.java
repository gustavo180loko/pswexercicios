package Exercicios5;

public class Main {

	public static void main(String[] args) {
		Funcionario f = new Funcionario("Gustavo","Guimaraes","Diretoria","18/02/2017","1234234","4123424",1700);

		System.out.println(f.toString());
		
		f.recebeAumento(1900);
		
		
	}

}
