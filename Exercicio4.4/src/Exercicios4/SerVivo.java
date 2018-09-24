package Exercicios4;

public class SerVivo {
	
	protected boolean extinto  = false;
	protected String dataNasc;
	protected String dataMorte;
	
	public SerVivo() {
	}
	
	
	public void extinguir() {
		extinto = true;
	}
	
	public void nascer(String data) {
		this.dataNasc = data;
	}
	
	public void morrer(String data) {
		this.dataMorte = data;
	}
	
	public String toString() {
		return String.format("Data Nascimento: %s\nData Morte: %s\nExtinto: %b",dataNasc,dataMorte,extinto);
	}
	
}
