package Exercicios4;

public class Main {
	
	public static void main(String args[]) {
		
		Passaros teste = new Passaros();
		FileCreator f = new FileCreator();
		FileRead r = new FileRead();
		
		Passaros p1 = new Passaros("ESPECIA1",250.0,1,2);
		Passaros p2 = new Passaros("ESPECIA2",250.0,2,5);
		Passaros p3 = new Passaros("ESPECIA3",250.0,3,7);
		Passaros p4 = new Passaros("ESPECIA4",250.0,4,1);
		
		Loja loja = new Loja("Passaros e cia");
		loja.addPassaro(p1);
		loja.addPassaro(p2);
		loja.addPassaro(p3);
		loja.addPassaro(p4);
		
		System.out.println(loja.getTotalPassaros());
		System.out.println(loja.valorTotal());
		System.out.println(loja.maisAntigo(teste));
		
		f.openFile();
		f.addRecords();
		f.closeFile();
		
		r.openFile();
		r.fileRead();
		r.closeFile();
	}
	
}
