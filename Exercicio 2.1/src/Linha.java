
public class Linha{
	
	private Ponto2D ponto1, ponto2;
	
	public Linha(Ponto2D ponto1,Ponto2D ponto2 ) {
		this.ponto1 = ponto1;
		this.ponto2 = ponto2;
	}
	
	public String toString(){
		
		return this.ponto1 + " / " + this.ponto2;
		
	}
}
