
public class Main {	
	
	public static void main(String args[]){
		
		FileWrite f = new FileWrite();
		f.openFileWrite();
		f.addRecords();
		f.closeFile();
		
	}
}
