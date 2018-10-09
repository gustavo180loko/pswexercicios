package Lista;

public class No <TIPO> {
	
	private No prox;
	private No ant;
	
	private TIPO info;
	
	public No(No prox, No ant, TIPO info) {
		this.prox = prox;
		this.ant = ant;
		this.info = info;
	}

	public No getProx() {
		return prox;
	}
	public void setProx(No prox) {
		this.prox = prox;
	}

	public No getAnt() {
		return ant;
	}
	public void setAnt(No ant) {
		this.ant = ant;
	}

	
	public TIPO getInfo() {
		return info;
	}
	public void setInfo(TIPO info) {
		this.info = info;
	}

	
	
}
