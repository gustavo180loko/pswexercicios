import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Files {

	Scanner sc;
	
	public void openFilePonto2D() {
		try {
			sc = new Scanner(new File("C:\\Users\\guga_\\Desktop\\Ponto2D.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
	}
	
	public void openFileLinha() {
		try {
			sc = new Scanner(new File("C:\\Users\\guga_\\Desktop\\Linha.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
	}
	
	public void closeFile() {
		if(sc != null) {
			sc.close();
			sc = null;
		}
	}
	
	public void fileReadPonto2D() {
		Ponto2D p = new Ponto2D();
		System.out.println("Pontos");
		while(sc.hasNext()) {
			p.setX(sc.nextInt());
			p.setY(sc.nextInt());
			System.out.println(p);
		}
	}
	
	public void fileReadLinha() {
		Ponto2D p1 = new Ponto2D();
		Ponto2D p2 = new Ponto2D();
		Linha l = new Linha();
		System.out.println("Linhas");
		while(sc.hasNext()) {
			p1.setX(sc.nextInt());
			p1.setY(sc.nextInt());
			p2.setX(sc.nextInt());
			p2.setY(sc.nextInt());
			l.setPonto1(p1);
			l.setPonto2(p2);
			System.out.println(l);
		}
	}
	
}
