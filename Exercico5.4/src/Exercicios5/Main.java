package Exercicios5;

public class Main {

	public static void main(String[] args) {
		Funcionario f = new Funcionario("Gustavo","Guimaraes","Diretoria","18/02/2017","1234234","4123424",1700);
		FileWrite w = new FileWrite();
		ReadFile r = new ReadFile();
		
		w.openFile();
		w.addRecords();
		w.closeFile();
		
		r.openFile();
		r.fileRead();
		r.closeFile();
		
		
	}

}
