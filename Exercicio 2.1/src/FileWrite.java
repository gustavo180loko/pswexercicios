import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
	
	private FileWriter writer;
	
	public void openFilePonto2D() {
		
		try {
			writer = new FileWriter("C:\\Users\\guga_\\Desktop\\Ponto2D.txt");
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void openFileLinha() {
		
		try {
			writer = new FileWriter("C:\\Users\\guga_\\Desktop\\Linha.txt");
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	
	public void addRecordsPonto2D() {
		
		Ponto2D p = new Ponto2D();
		Scanner sc = new Scanner(System.in);//Para poder usar o teclado
		
		System.out.println("Para terminar, digite <ctrl> d no UNIX/LINUS \n"+"ou <ctrl> z no Windows.\n\n");
		System.out.println("Informe os dados X e Y:");
		
		while(sc.hasNext()) { 
			p.setX(sc.nextInt());
			p.setY(sc.nextInt());
			
				try {
					writer.append( // Adiciona ao arquivo;
							String.format("%d  %d \n \n",
									p.getX(),
									p.getY()));
				} catch (IOException e) {
					e.printStackTrace();
					System.exit(0);
			}
		}
	}
	
	public void addRecordsLinha() {
		Ponto2D p1 = new Ponto2D();
		Ponto2D p2 = new Ponto2D();
		Linha l = new Linha();
		Scanner sc = new Scanner(System.in);//Para poder usar o teclado
		
		System.out.println("Para terminar, digite <ctrl> d no UNIX/LINUS \n"+"ou <ctrl> z no Windows.\n\n");
		System.out.println("Informe os dados X e Y:");
		
		while(sc.hasNext()) { 
			p1.setX(sc.nextInt());
			p1.setY(sc.nextInt());
			l.setPonto1(p1);
			p2.setX(sc.nextInt());
			p2.setY(sc.nextInt());
			l.setPonto2(p2);
			
				try {
					writer.append( // Adiciona ao arquivo;
							String.format( l.getPonto1()+" "+ l.getPonto2()));
				} catch (IOException e) {
					e.printStackTrace();
					System.exit(0);
			}
		}
	}
	
	public void closeFile(){
		
		if(writer != null) {
			try {
				writer.close();
				writer = null;
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(0);
			}
		}
		
	}
	
	
}
