package Exercicios2;

public class Retangulo {
	
	double largura;
	double comprimento;
	
	public Retangulo() {
		
		largura = 1;
		comprimento = 1;
		
	}
	
	public Retangulo(double largura, double comprimento) {
		if(largura < 20.0 && largura > 0.0) {
			this.largura = largura;
		}
		if(comprimento < 20.0 && largura > 0.0) {
			this.comprimento = comprimento;
		}
		
	}
	
	public String toString() {
		return largura+","+comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		if(largura < 20.0 && largura > 0.0) {
			this.largura = largura;
		}
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		if(comprimento < 20.0 && largura > 0.0) {
			this.comprimento = comprimento;
		}
	}
	
	public double calculaArea(){
		return (comprimento * largura);
	}
	
	public double calcularPerimetro(){
		return 2*(comprimento+largura);
	}
	
}
