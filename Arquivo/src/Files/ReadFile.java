package Files;

public class ReadFile {
	
	public static void main(String args[]) {
		FileRead f = new FileRead();
		f.openFile();
		f.fileRead();
		f.closeFile();
	}
}
