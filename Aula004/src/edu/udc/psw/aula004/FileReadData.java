package edu.udc.psw.aula004;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadData {
	
	Scanner sc;

	public void openFile() {
		try {
			sc = new Scanner(new File("C:\\Users\\guga_\\Desktop\\Data.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
	}
	
	public void fileRead() {
		Data d = new Data();
		System.out.println("Data");
		while(sc.hasNext()) {
			d.setDia(sc.nextInt());
			d.setMes(sc.nextInt());
			d.setAno(sc.nextInt());
			System.out.println(d);
		}
	}
	
	public void closeFile() {
		if(sc != null) {
			sc.close();
			sc = null;
		}
	}

	
}
