package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

	Scanner sc;
	
	public void openFile() {
		try {
			sc = new Scanner(new File("C:\\Users\\guga_\\Desktop\\politicos.txt"));
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
		Partido p = new Partido();
		System.out.println("Registro de Politicos");
		while(sc.hasNext()) {
			p.setPartido(sc.next());
			p.setNumero(sc.nextInt());
			p.setNome(sc.next());
			System.out.println(p);
		}
	}
	
}
