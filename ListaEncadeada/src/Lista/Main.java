package Lista;

public class Main {

	public static void main(String[] args) {
		Lista l = new Lista();
		l.inserirNoFim(9);
		l.inserirNoInicio(1);
		
		Object ax = l.pesquisar(1);
		if(ax != null) {
			System.out.println("Objeto encontrado:" +ax);
		}else {
			System.out.println("Objeto nao Encontrado");
		}
		
		l.imprimir();
		
	}
}
