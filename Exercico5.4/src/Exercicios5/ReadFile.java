package Exercicios5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	
	Scanner sc;

	public void openFile() {
		try {
			sc = new Scanner(new File("C:\\Users\\guga_\\Desktop\\Funcionarios.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
	}
	
	public void fileRead() {
		Funcionario f = new Funcionario();
		System.out.println("Funcionarios");
		while(sc.hasNext()) {
			f.setNome(sc.next());
			f.setSobrenome(sc.next());
			f.setDepartamento(sc.next());
			f.setDataInicio(sc.next());
			f.setCpf(sc.next());
			f.setRg(sc.next());
			f.setSalario(sc.nextFloat());
			System.out.println(f);
		}
	}
	
	public void closeFile() {
		if(sc != null) {
			sc.close();
			sc = null;
		}
	}
}
