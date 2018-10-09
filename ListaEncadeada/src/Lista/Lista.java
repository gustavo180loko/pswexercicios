package Lista;

public class Lista <TIPO>{
	
	private class No {
		
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
	
	
	private class IteratorConcreto implements Iterator<TIPO> {
		private No noAtual;
		
		IteratorConcreto(No inicio){
			this.noAtual = inicio;
		}
		@Override
		public TIPO getDados() {
			if(noAtual == null) {
				return null;
			}
			return noAtual.getInfo();
		}

		@Override
		public TIPO proximo() {
			if(noAtual == null) {
				return null;
			}
			TIPO obj = noAtual.getInfo();
			noAtual = noAtual.getProx();
			return obj;
		}

		@Override
		public TIPO anterior() {
			if(noAtual == null) {
				return null;
			}
			TIPO obj = noAtual.getInfo();
			noAtual = noAtual.getAnt();
			return obj;
		}

	}


	private No inicio;
	private No fim;
	
	public Lista() {
		
		inicio = null;
		fim = null;
		
	}
	
	
	public void inserirNoFim() {
		No produto = new No(null,inicio,fim);
		if(inicio == null) {
			inicio = fim = produto;
		}
		else {
			fim.setProx(produto);
			fim = produto;
		}
	}
	
	public Iterator<TIPO> getInicio() {
		Iterator<TIPO> i = new IteratorConcreto(inicio);
		return i;
	}
	
	public Iterator<TIPO> getFinal() {
		Iterator<TIPO> i = new IteratorConcreto(fim);
		return i;
	}
	
	public void inserirNoInicio(TIPO info) {
		No produto = new No(inicio,null,info);
		if(inicio == null) {
			inicio = fim = produto;
		}
		else {
			inicio.setAnt(produto);
			inicio = produto;
		}
	}
	
	public TIPO remover(TIPO o) {
		No aux;
		aux = inicio;
		while(aux!=null && aux.getInfo()!=o) {
			aux = aux.getProx();
		}
		if(aux==null) {
			return null;
		}
		if(aux.getAnt()==null) {
			inicio = aux.getProx();
		}else {
			aux=aux.getAnt();
			aux.setProx(aux.getProx());
		}
		if(aux.getProx()!=null) {
			aux=aux.getProx();
			aux.setAnt(aux.getAnt());
		}
		if(aux.getProx()==null) {
			aux=aux.getAnt();
			aux.setProx(null);
		}
		return aux;
	}
	
	public TIPO removerInicio() {
		No aux;
		aux = inicio;
		if(aux == null) {
			return null;
		}
		inicio = aux.getProx();
		return  aux;
	}
	
	public TIPO removerFinal() {
		No aux;
		aux = fim;
		if(aux == null) {
			return null;
		}
		fim = aux.getAnt();
		return aux;
	}
	
	
	public TIPO pesquisar(TIPO o) {
		No aux;
		aux =  inicio;
		while(aux != null && aux.getInfo() != o) {
			aux = aux.getProx();
		}
		if(aux == null) {
			return null;
		}else {
			return aux.getInfo();
		}
	}
	
	
	public void imprimir() {
		No aux;
		aux =  inicio;
		System.out.println("LISTA");
		int i = 1;
		while(aux!=null) {
			System.out.println(i + " - " +aux.getInfo());
			aux=aux.getProx();
			i++;
		}
	}
}
	
