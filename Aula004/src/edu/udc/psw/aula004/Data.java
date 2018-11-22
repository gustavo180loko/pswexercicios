package edu.udc.psw.aula004;

public class Data {
	
	private int dia;
	private int mes;
	private	int ano;
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data() {
		
	}
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if(dia>=0 && dia<32) {
			this.dia = dia;
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if(mes>=0 && mes<13) {
			this.mes = mes;
		}
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String mostrarData() {
		return String.format("%d/%d/%d ",dia,mes,ano);
	}
	
}
