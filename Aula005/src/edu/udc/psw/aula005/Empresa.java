package edu.udc.psw.aula005;

import java.util.List;
import java.util.ArrayList;

public class Empresa{

	private String empresa;
	private List<Funcionario> func;
	
	public Empresa(String empresa) {
		super();
		this.empresa = empresa;
		func = new ArrayList<Funcionario>();
	}

	public void adicionarFuncionario(Funcionario funcionario) {
		func.add(funcionario);
	}

	public String toString() {
		return "Empresa [empresa=" + empresa + ", func=" + func + "]";
	}
	
	
}
