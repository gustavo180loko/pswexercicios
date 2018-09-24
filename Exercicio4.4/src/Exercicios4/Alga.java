package Exercicios4;

public class Alga extends SerVivo{

	private boolean agua;
	
	public Alga(boolean agua) {
		this.agua = agua;
	}
	
	public String toString() {
		return String.format("Data Nascimento: %s\nData Morte: %s\nAgua: %b\nExtinto: %b",dataNasc,dataMorte,agua,extinto);
	}
	
}
