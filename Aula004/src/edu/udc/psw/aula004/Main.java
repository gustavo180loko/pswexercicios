package edu.udc.psw.aula004;

public class Main {
		
		public static void main(String[] args) {
			
		 Hora hora = new Hora((byte)23, (byte)30);
		 Data data = new Data((int)12,(int)12,(int)2000);
		 DataHora dataHora = new DataHora(hora,data);
		 
		 System.out.println(dataHora.mostrarDataHora());
		 int auxHora;
		 int auxMinuto;
		 
		 auxHora = hora.getHora();
		 auxMinuto = hora.getMinuto();
		 
		 for(int j = auxHora; j<24; j++) {
			 for(int i = auxMinuto; i<60; i++) {
			 
				 hora.verificaTempo();
				 hora.incrementoMinuto();
			 
		 	}
		 }
	}
}
