package Exercicios4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteMamiferos {
	
private FileWriter file;
	
	public void openFile() {
		try {
			file = new FileWriter("C:\\Users\\guga_\\Desktop\\Mamiferos.txt"); 
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void addRecords() {
		Mamifero m = new Mamifero();
		Scanner sc = new Scanner(System.in);//Para poder usar o teclado
		
		System.out.println("Para terminar, digite <ctrl> d no UNIX/LINUS \n"+"ou <ctrl> z no Windows.\n\n");
		System.out.println("Informe os dados do Mamifero(Nome, Comprimento, Numero de Patas, Cor, Ambiemte, Velocidade Media, Alimento)");		while(sc.hasNext()) { 
			m.setNome(sc.next());
			m.setComprimento(sc.nextFloat());
			m.setNumPatas(sc.nextInt());
			m.setCor(sc.next());
			m.setAmbiente(sc.next());
			m.setVelMedia(sc.nextFloat());
			m.setAlimento(sc.next());
				try {
					file.append( // Adiciona ao arquivo;
							String.format("%s %.2f %d %s %s %.2f %s \n",
									m.getNome(),
									m.getComprimento(),
									m.getNumPatas(), 
									m.getCor(), 
									m.getAmbiente(), 
									m.getVelMedia(), 
									m.getAlimento()));
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
