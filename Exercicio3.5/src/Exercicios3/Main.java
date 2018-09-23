package Exercicios3;

public class Main {

	public static void main(String[] args) {
		
		int notaFinal;
		
		Aluno al1 = new Aluno("Gustavo",18,1234567,23415623,"CC");
		
		notaFinal = al1.testeNotas(55,65,60,55);
		
		System.out.println(al1.resultado(notaFinal));

	}

}
