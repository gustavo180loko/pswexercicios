package Exercicios4;

public class Main {

	public static void main(String[] args) {
		FileWriteMamiferos m = new FileWriteMamiferos();
		FileReadMamifero r = new FileReadMamifero();
		Mamifero camelo = new Mamifero("Camelo",150,4,"Amarelo","Terra",2,"Naosei");
		Peixe tubarao = new Peixe("Tubarao",300,0,"Cinzento","Mar",15,"Barbatanas e cauda");
		Mamifero ursocanada = new Mamifero("Urso Canadense",300,4,"Vermelho","Terra",05,"Mel");
		m.openFile();
		m.addRecords();
		m.closeFile();
		r.openFile();
		r.fileRead();
		r.closeFile();
		
	}

}
