package Exercicios4;

public class Mamifero extends Animal{
	
	private String alimento;
	
	public Mamifero(String nome, float comprimento, int numPatas, String cor, String ambiente, float velMedia, String alimento) {
		super(nome, comprimento, numPatas, cor, ambiente, velMedia);
		this.alimento = alimento;
	}

	public String dados() {
		return String.format("Nome: %s\nComprimento: %.2f cm\nNumero Patas: %d\nCor: %s\nambiente: %s\nVelocidade media: %.2f m/s\nAlimento: %s",nome,comprimento,numPatas,cor,ambiente,velMedia,alimento);
	}
	
	
	
	
	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	

}
