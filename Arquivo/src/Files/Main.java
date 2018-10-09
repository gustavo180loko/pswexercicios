package Files;

public class Main {

	public static void main(String[] args) {
		TextCreator t = new TextCreator();
		t.openFile();
		t.addRecords();
		t.closeFile();

	}

}
