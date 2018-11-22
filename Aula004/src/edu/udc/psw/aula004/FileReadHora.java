package edu.udc.psw.aula004;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadHora {
	
	Scanner sc;

	public void openFile() {
		try {
			sc = new Scanner(new File("C:\\Users\\guga_\\Desktop\\Hora.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
	}
	
	public void fileRead() {
		Hora h = new Hora();
		System.out.println("Hora");
		while(sc.hasNext()) {
			h.setHora(sc.nextByte());
			h.setMinuto(sc.nextByte());
			System.out.println(h);
		}
	}
	
	public void closeFile() {
		if(sc != null) {
			sc.close();
			sc = null;
		}
	}

	
}
