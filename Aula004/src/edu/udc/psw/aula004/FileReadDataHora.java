package edu.udc.psw.aula004;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadDataHora {
	
	Scanner sc;

	public void openFile() {
		try {
			sc = new Scanner(new File("C:\\Users\\guga_\\Desktop\\DataHora.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
	}
	
	public void fileRead() {
		Data d = new Data();
		Hora h = new Hora();
		DataHora dh = new DataHora();
		System.out.println("Data e Hora");
		while(sc.hasNext()) {
			d.setDia(sc.nextInt());
			d.setMes(sc.nextInt());
			d.setAno(sc.nextInt());
			dh.setData(d);
			h.setHora(sc.nextByte());
			h.setMinuto(sc.nextByte());
			dh.setHora(h);
			System.out.println(dh);
		}
	}
	
	public void closeFile() {
		if(sc != null) {
			sc.close();
			sc = null;
		}
	}

	
}
