package Exercicios5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	
	Scanner sc;

	public void openFile() {
		try {
			sc = new Scanner(new File("C:\\Users\\guga_\\Desktop\\Empregado.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
	}
	
	public void fileRead() {
		Empregado e = new Empregado();
		System.out.println("Empregados");
		while(sc.hasNext()) {
			e.setNome(sc.next());
			e.setDepartamento(sc.next());
			e.setHorasTrabalhadas(sc.nextInt());
			e.setSalarioHora(sc.nextDouble());
			System.out.println(e);
		}
	}
	
	public void closeFile() {
		if(sc != null) {
			sc.close();
			sc = null;
		}
	}

}
