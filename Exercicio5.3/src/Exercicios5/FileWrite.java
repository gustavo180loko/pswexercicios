package Exercicios5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileWrite {
	
	private FileWriter file;
	
	public void openFile() {
		try {
			file = new FileWriter("C:\\Users\\guga_\\Desktop\\Empregado.txt"); 
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void addRecords() {
		Empregado e = new Empregado();
		Scanner sc = new Scanner(System.in);//Para poder usar o teclado
		
		System.out.println("Para terminar, digite <ctrl> d no UNIX/LINUS \n"+"ou <ctrl> z no Windows.\n\n");
		System.out.println("Informe os dados dos Empregados(Nome, Departamento, Horas trabalhadas e Salario por hora):");
		
		while(sc.hasNext()) { 
			e.setNome(sc.next());
			e.setDepartamento(sc.next());
			e.setHorasTrabalhadas(sc.nextInt());
			e.setSalarioHora(sc.nextDouble());
				try {
					file.append( // Adiciona ao arquivo;
							String.format("%s  %s  %d %.2f\n",
									e.getNome(),
									e.getDepartamento(),
									e.getHorasTrabalhadas(),
									e.getSalarioHora()));
				} catch (IOException w) {
					w.printStackTrace();
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
