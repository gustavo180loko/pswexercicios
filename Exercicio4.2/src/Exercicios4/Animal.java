package Exercicios4;

public class Animal {
	
	protected String nome;
	protected float comprimento;
	protected int numPatas;
	protected String cor;
	protected String ambiente;
	protected float velMedia;
	
	public Animal(String nome, float comprimento, int numPatas, String cor, String ambiente, float velMedia) {
		
		this.nome = nome;
		this.comprimento = comprimento;
		this.numPatas = numPatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velMedia = velMedia;
		
	}
	
	public Animal() {
	
	}
	
	public String dados() {
		return String.format("Nome: %s\nComprimento: %.2f\nNumero Patas: %d\nCor: %s\nambiente: %s\nVelocidade media: %.2f",nome,comprimento,numPatas,cor,ambiente,velMedia);
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	
	
	public int getNumPatas() {
		return numPatas;
	}
	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
	
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	
	
	public float getVelMedia() {
		return velMedia;
	}
	public void setVelMedia(float velMedia) {
		this.velMedia = velMedia;
	}
	
	
	
	
	
}
