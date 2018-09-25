package Exercicios5;

public class Main {

	public static void main(String[] args) {
		
		Empregado e = new Empregado("Gustavo","Diretoria",68,250.0);
		
		System.out.println(e.dados());
		System.out.println("Salario recebido pelas horas: ");
		System.out.println(e.calculoSalario(e.getDepartamento()));
		System.out.println();
		System.out.println("Salario extra: ");
		System.out.println(e.trabalhoExtra(4, 24.0));
		
		

	}

}
