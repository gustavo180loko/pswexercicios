package Lista;

public class Main {

	public static void main(String[] args) {
			
		Lista<Games> Games;
		Games = new Lista();
		
		Games.inserir(new Games("God of War"), 1);
		Games.inserirFim(new Games("Spider man"));
		mostrarListaIterator(Games);
		
		
		
	}
	
	public static void mostrarListaIterator(Lista<Games> l) {
		Iterator<Games> i = l.getInicio();
		Object o;
		for(int j = 1; (o = i.proximo()) != null; System.out.println(j++ + " "+ o));
	}
	
	
}
