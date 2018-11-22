package edu.udc.psw.aula004;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCreaterHora {
	
private FileWriter file;
	
	public void openFile() {
		try {
			file = new FileWriter("C:\\Users\\guga_\\Desktop\\Hora.txt"); 
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void addRecords() {
		Hora h = new Hora();
		Scanner sc = new Scanner(System.in);//Para poder usar o teclado
		
		System.out.println("Para terminar, digite <ctrl> d no UNIX/LINUS \n"+"ou <ctrl> z no Windows.\n\n");
		System.out.println("Informe o Horario(Hora e Minutos):");
		
		while(sc.hasNext()) { 
			h.setHora(sc.nextByte());
			h.setMinuto(sc.nextByte());
				try {
					file.append( 
							String.format("%d  %d \n",
									h.getHora(),
									h.getMinuto()));
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
