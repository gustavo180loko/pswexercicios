package Exercicios4;


public class Passaros {
	
	private String especie;
	private double valor;
	private int tempo;
	private int numGaiola;
	
	public String toString(){
		
		return String.format("Especie : %s\nValor: %.2f\nTempo no Estoque: %d dias\nNumero Gaiola: %d\n",especie,valor,tempo,numGaiola);
				
	}

	public Passaros(String especie, double valor, int numGaiola,int tempo) {
		this.especie = especie;
		this.valor = valor;
		this.tempo = tempo;
		this.numGaiola = numGaiola;
	}
	
	public Passaros() {
	}
	
	
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getNumGaiola() {
		return numGaiola;
	}

	public void setNumGaiola(int numGaiola) {
		this.numGaiola = numGaiola;
	}
	
	
	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
}
