package Exercicios4;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	
	private List<Passaros> pass;
	private int totalPassaros;
	private double totalValor;
	private String nome;
	
	public Loja(String nome) {
		this.nome = nome;
		pass = new ArrayList<Passaros>();
	}
	
	public void addPassaro(Passaros passaro) {
		pass.add(passaro);
		totalPassaros++;
	}
	
	public double valorTotal() {
		
		for(Passaros i : pass) {
			totalValor = totalValor + i.getValor();
		}
		return totalValor;
		
	}
	
	public Passaros maisAntigo(Passaros w) {
		int maior = 0;
		for(Passaros i : pass) {
			if(i.getTempo()>maior) {
				w=i;
				maior = i.getTempo();
			}
		}
		return w;
	}
	
	

	public List<Passaros> getPass() {
		return pass;
	}

	public void setPass(List<Passaros> pass) {
		this.pass = pass;
	}

	public int getTotalPassaros() {
		return totalPassaros;
	}

	public void setTotalPassaros(int totalPassaros) {
		this.totalPassaros = totalPassaros;
	}

	public double getTotalValor() {
		return totalValor;
	}

	public void setTotalValor(double totalValor) {
		this.totalValor = totalValor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
