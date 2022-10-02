package ex3;

import java.util.Scanner;
		
public class Main {
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	String x;
	
	System.out.print("Numero: ");
	x = s.nextLine();
	
	Integer numero = Integer.valueOf(x);
	
	if( numero % 2 == 0 ) {
		System.out.println("Numero é Par");
	} else {
		System.out.println("Numero Impar");
	}
	
	}

}