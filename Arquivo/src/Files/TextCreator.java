package Files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextCreator {
	
	private FileWriter objWriter;
	
	public void openFile() {
		try {// Try e catch, usado para uma tentativa pois pode haver erro
			objWriter = new FileWriter("C:\\Users\\guga_\\Desktop\\politicos.txt"); // Abrir o arquivo em algum diretorio
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
	}
	
	public void addRecords() {
		
		File politico = new File();
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
							String.format("%5s - %5d - %s\n",
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
	
	public void closeFile(){
		
		if(objWriter != null) {
			try {
				objWriter.close();
				objWriter = null;
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(0);
			}
		}
		
	}

}
