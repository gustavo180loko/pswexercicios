package Exercicios4;

public class Cao extends Gato{

	public Cao(boolean vertebrado, String cor, float peso) {
		super(vertebrado, cor, peso);
	}
	
	public String toString() {
		return String.format("Data Nascimento: %s\nData Morte: %s\nCor: %s\nPeso: %.2f\nPorte: %d\nVertebrado: %b\nExtinto: %b\n",dataNasc,dataMorte,cor,peso,porte,vertebrado,extinto);
	}

}
