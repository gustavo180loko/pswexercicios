
public class Main {	
	
	public static void main(String args[]){
		
		FileWrite f = new FileWrite();
		Files r = new Files();
		f.openFileLinha();
		f.addRecordsLinha();
		f.closeFile();
		r.openFileLinha();
		r.fileReadLinha();
		r.closeFile();
	}
}
