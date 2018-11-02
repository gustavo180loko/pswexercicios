package Exercicios4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadPeixes {

	Scanner sc;
	
	public void openFile() {
		try {
			sc = new Scanner(new File("C:\\Users\\guga_\\Desktop\\Peixes.txt"));
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
		Peixe m = new Peixe();
		System.out.println("Registro de Peixes");
		while(sc.hasNext()) {
			m.setNome(sc.next());
			m.setComprimento(sc.nextFloat());
			m.setNumPatas(sc.nextInt());
			m.setCor(sc.next());
			m.setAmbiente(sc.next());
			m.setVelMedia(sc.nextFloat());
			m.setCaracteristica(sc.next());
			System.out.println(m);
		}
	}
	
}
