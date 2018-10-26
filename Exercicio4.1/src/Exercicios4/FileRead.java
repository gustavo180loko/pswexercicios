package Exercicios4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
	
	Scanner sc;

	public void openFile() {
		try {
			sc = new Scanner(new File("C:\\Users\\guga_\\Desktop\\loja.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
	}
	
	public void fileRead() {
		Passaros p = new Passaros();
		System.out.println("Passaros");
		while(sc.hasNext()) {
			p.setEspecie(sc.next());
			p.setNumGaiola(sc.nextInt());
			p.setTempo(sc.nextInt());
			p.setValor(sc.nextDouble());
			System.out.println(p);
		}
	}
	
	public void closeFile() {
		if(sc != null) {
			sc.close();
			sc = null;
		}
	}

}
