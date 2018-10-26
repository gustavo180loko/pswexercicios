import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
	
	private FileWriter writer;
	
	public void openFileWrite() {
		
		try {
			writer = new FileWriter("C:\\Users\\guga_\\Desktop\\Ponto2D.txt");
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void addRecords() {
		
		Ponto2D p = new Ponto2D();
		Scanner sc = new Scanner(System.in);//Para poder usar o teclado
		
		System.out.println("Para terminar, digite <ctrl> d no UNIX/LINUS \n"+"ou <ctrl> z no Windows.\n\n");
		System.out.println("Informe os dados X e Y:");
		
		while(sc.hasNext()) { 
			p.setX(sc.nextInt());
			p.setY(sc.nextInt());
			
				try {
					writer.append( // Adiciona ao arquivo;
							String.format("%d , %d \n \n",
									p.getX(),
									p.getY()));
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
