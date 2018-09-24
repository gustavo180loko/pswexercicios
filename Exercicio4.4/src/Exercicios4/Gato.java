package Exercicios4;

public class Gato extends Animal{

	protected String cor;
	protected int porte;
	protected float peso;
	
	public Gato(boolean vertebrado, String cor, float peso) {
		super(vertebrado);
		this.cor = cor;
		this.peso = peso;
		if(peso > 0 && peso < 5) {
			porte = 0;
		}
		if(peso > 5 && peso < 20) {
			porte = 1;
		}
		if(peso > 20) {
			porte = 2;
		}
	}
	
	public String toString() {
		return String.format("Data Nascimento: %s\nData Morte: %s\nCor: %s\nPeso: %.2f\nPorte: %d\nVertebrado: %b\nExtinto: %b\n",dataNasc,dataMorte,cor,peso,porte,vertebrado,extinto);
	}

	
}
