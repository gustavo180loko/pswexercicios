package Exercicios4;

public class Peixe extends Animal{
	
	private String caracteristica;

	public Peixe(String nome, float comprimento, int numPatas, String cor, String ambiente, float velMedia, String carac) {
		super(nome, comprimento, numPatas, cor, ambiente, velMedia);
		this.caracteristica = carac;
	}
	
	public String dados() {
		return String.format("Nome: %s\nComprimento: %.2f\nNumero Patas: %d\nCor: %s\nambiente: %s\nVelocidade media: %.2f\nCaracteristicas: %s\n",nome,comprimento,numPatas,cor,ambiente,velMedia,caracteristica);
	}
	
	
	
	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	

}
