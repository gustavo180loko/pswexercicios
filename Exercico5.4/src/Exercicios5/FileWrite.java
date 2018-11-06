package Exercicios5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileWrite {
	
	private FileWriter file;
	
	public void openFile() {
		try {
			file = new FileWriter("C:\\Users\\guga_\\Desktop\\Funcionarios.txt"); 
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void addRecords() {
		Funcionario f = new Funcionario();
		Scanner sc = new Scanner(System.in);//Para poder usar o teclado
		
		System.out.println("Para terminar, digite <ctrl> d no UNIX/LINUS \n"+"ou <ctrl> z no Windows.\n\n");
		System.out.println("Informe os dados dos Funcionarios(Nome, Sobrenome, Departamento, Data de inicio, CPF, RG, Salario):");
		
		while(sc.hasNext()) { 
			f.setNome(sc.next());
			f.setSobrenome(sc.next());
			f.setDepartamento(sc.next());
			f.setDataInicio(sc.next());
			f.setCpf(sc.next());
			f.setRg(sc.next());
			f.setSalario(sc.nextFloat());
				try {
					file.append( // Adiciona ao arquivo;
							String.format("%s  %s  %s %s %s %s %.2f\n",
									f.getNome(),
									f.getSobrenome(),
									f.getDepartamento(),
									f.getDataInicio(),
									f.getCpf(),
									f.getRg(),
									f.getSalario()));
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
