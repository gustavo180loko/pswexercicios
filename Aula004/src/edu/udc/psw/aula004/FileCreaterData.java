package edu.udc.psw.aula004;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCreaterData {
	
private FileWriter file;
	
	public void openFile() {
		try {
			file = new FileWriter("C:\\Users\\guga_\\Desktop\\Data.txt"); 
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void addRecords() {
		Data d = new Data();
		Scanner sc = new Scanner(System.in);//Para poder usar o teclado
		
		System.out.println("Para terminar, digite <ctrl> d no UNIX/LINUS \n"+"ou <ctrl> z no Windows.\n\n");
		System.out.println("Informe a data(Dia, Mes e Ano):");
		
		while(sc.hasNext()) { 
			d.setDia(sc.nextInt());
			d.setMes(sc.nextInt());
			d.setAno(sc.nextInt());
				try {
					file.append( 
							String.format("%d  %d  %d\n",
									d.getDia(),
									d.getMes(),
									d.getAno()));
				} catch (IOException e) {
					e.printStackTrace();
					System.exit(0);
				}
			
		}
		
	}
	
	
	public void closeFile() {
		if(file != null) {
			try {
				file.close();
				file = null;
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(0);
			}
		}
		
	}
	
	
}
