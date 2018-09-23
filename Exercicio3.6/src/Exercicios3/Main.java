package Exercicios3;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Gustavo");
		Aluno a = new Aluno("Gustavo","CC","2 periodo");
		Funcionario f = new Funcionario("Gustavo",1234512,980.0,"22/02/2018");
		Servente s = new Servente("Gustavo",1234512,980.0,"22/02/2018","SetorQ");
		Professor pf = new Professor("Gustavo",1234512,980.0,"22/02/2018","Matematica");
		Diretor d = new Diretor("Gustavo",1234512,980.0,"22/02/2018","2018");
		
		System.out.println(p.toString());
		System.out.println(a.toString());
		System.out.println(f.toString());
		System.out.println(s.toString());
		System.out.println(pf.toString());
		System.out.println(d.toString());
		
		
		
	}

}
