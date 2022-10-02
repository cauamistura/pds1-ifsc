package ex4;

import java.util.Iterator;
import java.util.Scanner;
		
public class Main {
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	String x;
	
	for (int i = 0; i < 10; i++) {
		
		System.out.print("Dado: ");
		x = s.nextLine();
		
		Integer dado = Integer.valueOf(x);
		
		System.out.printf("%d dado lido: %d\n",i+1, dado);
		
	}
	
	}

}