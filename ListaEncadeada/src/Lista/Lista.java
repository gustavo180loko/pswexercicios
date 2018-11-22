package Lista;

public class Lista<TIPO> {
	
	public class IteradorConcreto implements Iterator<TIPO> {
		private No noAtual;
		
		IteradorConcreto(No noAtual) {
			this.noAtual = noAtual;
		}
		
		public TIPO getDados() {
			if(noAtual == null)
				return null;
			return noAtual.info;
		}

		public TIPO proximo() {
			if(noAtual == null)
				return null;
			TIPO obj = noAtual.info;
			noAtual = noAtual.prox;
			return obj;
		}

		public TIPO anterior() {
			if(noAtual == null)
				return null;
			TIPO obj = noAtual.info;
			noAtual = noAtual.ant;
			return obj;
		}

	}

	private class No {
		public No prox;
		public No ant;
		
		public TIPO info;
	}
	
	
	private No inicio;
	private No fim;

	private int tamanho = 0;
	
	public Iterator<TIPO> getInicio() {
		Iterator<TIPO> i = new IteradorConcreto(inicio);
		return i;
	}
	
	public Iterator<TIPO> getFim() {
		return new IteradorConcreto(fim);
	}

	
	public Lista() {
		super();
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public boolean isVazia() {
		if(tamanho == 0) {
			return true;
		}
		return false;
	}

	public void inserirInicio(TIPO obj) {
		No novo = new No();
		novo.info = obj;
		novo.prox = inicio;
		novo.ant = null;
		
		if(inicio == null) {
			inicio = novo;
			fim = novo;
		} else {
			inicio.ant = novo;
			inicio = novo;
		}

		tamanho++;
	}

	public void inserirFim(TIPO obj) {
		No novo = new No();
		novo.info = obj;
		novo.prox = null;
		novo.ant = fim;

		if (fim != null)
			fim.prox = novo;

		fim = novo;
		if (inicio == null)
			inicio = novo;

		tamanho++;
	}

	public void inserir(TIPO obj, int pos) {		
		if(pos < 1 || pos > tamanho + 1)
			return;
		
		if(pos == 1) { 
			inserirInicio(obj);
			return;
		}
		
		if(pos == tamanho + 1) { 
			inserirFim(obj);
			return;
		}
		
		No novo = new No();
		novo.info = obj;
		novo.prox = null;
		novo.ant = null;


		No aux = inicio;
		int cont = 1;
		
		while(cont < pos ) {
			aux = aux.prox;
			cont++;
		}
		
		novo.ant = aux.ant;
		novo.prox = aux;
		aux.ant.prox = novo;
		aux.ant = novo;
		
		tamanho++;
	}

	public TIPO removerInicio() {
		if (inicio == null)
			return null;

		TIPO dado = inicio.info;

		if (inicio == fim) { 
			inicio = null;
			fim = null;
		} else {
			inicio.prox.ant = null;
			inicio = inicio.prox;
		}

		tamanho--;

		return dado;
	}

	public TIPO removerFim() {
		if (fim == null) 
			return null;

		TIPO dado = fim.info;

		if (inicio == fim) {
			inicio = null;
			fim = null;
		} else {
			fim.ant.prox = null;
			fim = fim.ant;
		}
		tamanho--;

		return dado;
	}

	public TIPO remover(int pos) {
		if(pos < 1 || pos > tamanho)
			return null;
		
		if(pos == 1) { 
			return removerInicio();
		}
		
		if(pos == tamanho) { 
			return removerFim();
		}
		
		No aux = inicio;
		int cont = 1;
		
		
		while(cont < pos ) {
			aux = aux.prox;
			cont++;
		}
		
		TIPO dado = aux.info;
		
		aux.ant.prox = aux.prox;
		aux.prox.ant = aux.ant;
		
		tamanho--;
		return dado;
	}

	public TIPO pesquisar(int pos) {
		No aux = inicio;
		int cont = 1;

		if (tamanho == 0)
			return null;

		if (pos > tamanho)
			return null;

		while (cont < pos) {
			aux = aux.prox;
			cont++;
		}

		return aux.info;
	}
}