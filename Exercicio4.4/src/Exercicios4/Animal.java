package Exercicios4;

public class Animal extends SerVivo{
	
	protected boolean vertebrado;
	
	public Animal(boolean vertebrado){
		this.vertebrado = vertebrado;
	}
	
	public String toString() {
		return String.format("Data Nascimento: %s\nData Morte: %s\nVertebrado: %b\nExtinto: %b\n",dataNasc,dataMorte,vertebrado,extinto);
	}

}
