package Exercicios5;

public class Main {

	public static void main(String[] args) {
		
		Empregado e = new Empregado("Gustavo","Diretoria",68,250.0);
		FileWrite f = new FileWrite();	
		ReadFile r = new ReadFile();
		r.openFile();
		r.fileRead();
		r.closeFile();
				

	}

}
