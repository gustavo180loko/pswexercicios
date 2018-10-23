import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Files {

	Scanner sc;
	
	public void openFile() {
		try {
			sc = new Scanner(new File("C:\\Users\\guga_\\Desktop\\Ponto2D.txt"));
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
	
	public void fileRead() {
		Ponto2D p = new Ponto2D();
		System.out.println("Pontos");
		while(sc.hasNext()) {
			p.setX(sc.nextInt());
			p.setY(sc.nextInt());
			System.out.println(p);
		}
	}
	
}
