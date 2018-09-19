package edu.udc.psw.aula004;

public class Hora {
	
		private byte hora;
		private byte minuto;
		
		public Hora(byte hora, byte minuto) {
			this.hora = hora;
			this.minuto = minuto;
		}
		
		public byte incrementoHora() {
			hora++;
			return hora;
		}
		
		public byte incrementoMinuto() {
			minuto++;
			return minuto;
		}
		
		public void zerar() {
			hora = 0;
			minuto = 0;
		}
		
		public String mostrarHora() {
			return String.format("%02d:%02d", hora, minuto);
		}
		
		public byte getHora() {
			return hora;
		}

		public void setHora(byte hora) {
			if(hora>=0 && hora<24) {
			this.hora = hora;
			}
		}

		public byte getMinuto() {
			return minuto;
		}

		public void setMinuto(byte minuto) {
			if(minuto>=0 && minuto<24) {
				this.minuto = minuto;
			}
		}

		public void verificaTempo() {
			if(minuto == 60){
				this.incrementoHora();
					if(hora == 24) {
					hora = 0;
					}
				minuto = 0;
			}
				
		}
		
}
