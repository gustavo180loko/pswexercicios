package Exercicios4;

public class Vegetal extends SerVivo{
	
	protected boolean unicelular;
	
	public Vegetal(boolean unicelular) {
		this.unicelular = unicelular;
	}
	
	public String toString() {
		return String.format("Data Nascimento: %s\nData Morte: %s\nUnicelular: %b\nExtinto: %b",dataNasc,dataMorte,unicelular,extinto);
	}

}
