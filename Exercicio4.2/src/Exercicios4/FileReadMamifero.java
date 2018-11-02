package Exercicios4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadMamifero {
	
	Scanner sc;
	
	public void openFile() {
		try {
			sc = new Scanner(new File("C:\\Users\\guga_\\Desktop\\Mamiferos.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void closeFile() {
		if(sc != null) {
			sc.close();
			sc = null;
		}
	}
	
	public void fileRead() {
		Mamifero m = new Mamifero();
		System.out.println("Registro de Mamiferos");
		while(sc.hasNext()) {
			m.setNome(sc.next());
			m.setComprimento(sc.nextFloat());
			m.setNumPatas(sc.nextInt());
			m.setCor(sc.next());
			m.setAmbiente(sc.next());
			m.setVelMedia(sc.nextFloat());
			m.setAlimento(sc.next());
			System.out.println(m);
		}
	}
	
}
