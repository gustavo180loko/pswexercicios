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
	
	public void addRecords() {
		Passaros p = new Passaros();
		Scanner sc = new Scanner(System.in);//Para poder usar o teclado
		
		System.out.println("Para terminar, digite <ctrl> d no UNIX/LINUS \n"+"ou <ctrl> z no Windows.\n\n");
		System.out.println("Informe os dados dos Passaros(Especie, Numero Gaiola, Tempo, Valor):");
		
		while(sc.hasNext()) { 
			p.setEspecie(sc.next());
			p.setNumGaiola(sc.nextInt());
			p.setTempo(sc.nextInt());
			p.setValor(sc.nextDouble());
				try {
					file.append( // Adiciona ao arquivo;
							String.format("%s  %d  %d %f\n",
									p.getEspecie(),
									p.getNumGaiola(),
									p.getTempo(),
									p.getValor()));
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
