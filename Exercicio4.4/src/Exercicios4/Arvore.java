package Exercicios4;

public class Arvore extends Vegetal{

	private float altura;
	
	public Arvore(boolean unicelular, float altura) {
		super(unicelular);
		this.altura = altura;
	}
	
	public String toString() {
		return String.format("Data Nascimento: %s\nData Morte: %s\nAltura:%.2f\nUnicelular: %b\nExtinto: %b",dataNasc,dataMorte,altura,unicelular,extinto);
	}

}
