package Exercicios4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCreator {
	
private FileWriter file;
	
	public void openFile() {
		try {
			file = new FileWriter("C:\\Users\\guga_\\Desktop\\loja.txt"); 
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void addRecords(Passaros) {
		
		Scanner sc = new Scanner(System.in);//Para poder usar o teclado
		
		System.out.println("Para terminar, digite <ctrl> d no UNIX/LINUS \n"+"ou <ctrl> z no Windows.\n\n");
		System.out.println("Informe os dados do Politico(NUMERO, NOME E PARTIDO):");
		
		while(sc.hasNext()) { 
			politico.setNumero(sc.nextInt());
			politico.setNome(sc.next());
			politico.setPartido(sc.next());
			
			if(politico.getNumero() > 0) {
				try {
					objWriter.append( // Adiciona ao arquivo;
							String.format("%s  %d  %s\n",
									politico.getPartido(),
									politico.getNumero(),
									politico.getNome()));
				} catch (IOException e) {
					e.printStackTrace();
					System.exit(0);
				}
			}else {
				System.out.println("O numero deve ser maior que 0");
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
