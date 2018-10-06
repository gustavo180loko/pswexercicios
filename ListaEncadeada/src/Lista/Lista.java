package Lista;

public class Lista {
	
	private No inicio;
	private No fim;
	
	public Lista() {
		
		inicio = null;
		fim = null;
		
	}
	
	
	public void inserirNoFim(Object info) {
		No produto = new No(null,inicio,info);
		if(inicio == null) {
			inicio = fim = produto;
		}
		else {
			fim.setProx(produto);
			fim = produto;
		}
	}
	
	
	public void inserirNoInicio(Object info) {
		No produto = new No(inicio,null,info);
		if(inicio == null) {
			inicio = fim = produto;
		}
		else {
			inicio.setAnt(produto);
			inicio = produto;
		}
	}
	
	public Object remover(Object o) {
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
		aux=null;
		return 1;
	}
	
	
	public Object pesquisar(Object o) {
		No aux;
		aux = inicio;
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
		aux = inicio;
		System.out.println("LISTA");
		while(aux!=null) {
			System.out.println(aux.getInfo());
			aux=aux.getProx();
		}
	}
}
	
