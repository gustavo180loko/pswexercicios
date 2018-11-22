package edu.udc.psw.aula004;

public class DataHora {
		
	private Hora hora;
	private Data data;
	
	public DataHora(Hora hora, Data data) {
		this.hora = new Hora(hora.getHora(),hora.getMinuto());
		this.data = new Data(data.getDia(),data.getMes(),data.getAno());
	}
	
	public DataHora() {
		
	}
	
	public Hora getHora() {
		return hora;
	}

	public void setHora(Hora hora) {
		this.hora = new Hora(hora.getHora(),hora.getMinuto());;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = new Data(data.getDia(),data.getMes(),data.getAno());;
	}

	
	
	public String mostrarDataHora() {
		return String.format("%d/%d/%d - %d:%d",data.getDia(), data.getMes(), data.getAno(), hora.getHora(), hora.getMinuto());
	}
}