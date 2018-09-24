package Exercicios4;

public class Main {

	public static void main(String[] args) {
		Mamifero camelo = new Mamifero("Camelo",150,4,"Amarelo","Terra",2,"Naosei");
		Peixe tubarao = new Peixe("Tubarao",300,0,"Cinzento","Mar",15,"Barbatanas e cauda");
		Mamifero ursocanada = new Mamifero("Urso Canadense",300,0,"Vermelho","Terra",05,"Mel");
		
		System.out.println(camelo.dados());
		System.out.println(tubarao.dados());
		System.out.println(ursocanada.dados());
		
	}

}
