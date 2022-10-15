package lista01;

import java.util.Iterator;
import java.util.Scanner;
		
public class Ex4 {
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	for (int i = 0; i < 10; i++) {
		
		System.out.print("Dado: ");
		Double dado = Double.valueOf(s.nextLine());
		
		System.out.println("Valor " + (i+1) + " lido: " + dado);
		
	}
	
	}

}