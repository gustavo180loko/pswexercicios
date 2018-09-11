package edu.udc.psw.aula001;

import java.util.Scanner;

public class Aula001 {
	public static void main(String args[]) {
		Aula001 obj = new Aula001();
		String str = new String();
		
		int i = 25;
		boolean b = true;
		double d = 5.00034;
		float v = 5.6F;
		long valor = 455;
		char c = 'a';
		str = "teste";
		
		System.out.println(str);
		System.out.println("SOMA = "+obj.func(v, i));
	}
	
	public int func(float v,int i) {
		return (int) (i+v);
	}
	
}
