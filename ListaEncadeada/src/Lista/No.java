package Lista;

public class No {
	
	private No prox;
	private No ant;
	
	private Object info;
	
	public No(No prox, No ant, Object info) {
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

	
	public Object getInfo() {
		return info;
	}
	public void setInfo(Object info) {
		this.info = info;
	}

	
	
}
