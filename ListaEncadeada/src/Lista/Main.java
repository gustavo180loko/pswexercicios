package Lista;

public class Main {

	public static void main(String[] args) {
		Lista<Integer> l = new Lista<Integer>();
		l.inserirNoFim(new Integer(9));
		l.inserirNoInicio(new Integer(1));
		l.removerInicio();
		l.inserirNoFim(new String("Gustavo"));
		
		Object ax = l.pesquisar(1);
		if(ax != null) {
			System.out.println("Objeto encontrado:" +ax);
		}else {
			System.out.println("Objeto nao Encontrado");
		}
		
		l.imprimir();
		
	}
	
	
}
