
public class Linha{
	
	private Ponto2D ponto1, ponto2;
	
	public Linha(Ponto2D ponto1,Ponto2D ponto2 ) {
		this.ponto1 = ponto1;
		this.ponto2 = ponto2;
	}
	
	public Linha() {

	}
	
	public String toString(){
		
		return this.ponto1 + " / " + this.ponto2;
		
	}

	public Ponto2D getPonto1() {
		return ponto1;
	}

	public void setPonto1(Ponto2D ponto1) {
		this.ponto1 = ponto1;
	}

	public Ponto2D getPonto2() {
		return ponto2;
	}

	public void setPonto2(Ponto2D ponto2) {
		this.ponto2 = ponto2;
	}
	
	
}
