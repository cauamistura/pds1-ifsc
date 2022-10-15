package lista01;

import java.util.Scanner;
		
public class Ex3 {
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);

	System.out.print("Numero: ");
	Double numero = Double.valueOf(s.nextLine());
	
	if( numero % 2 == 0 ) {
		System.out.println("Numero � Par");
	} else {
		System.out.println("Numero Impar");
	}
	
	}

}