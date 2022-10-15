package lista01;

import java.util.Scanner;

public class ZEx10 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	Integer nota1, nota2, nota3;
	
	System.out.print("Nota 1: ");
	nota1 = Integer.valueOf(s.nextLine());
	
	System.out.print("Nota 2: ");
	nota2 = Integer.valueOf(s.nextLine());
	
	System.out.print("Nota 3: ");
	nota3 = Integer.valueOf(s.nextLine());
	
	float media = calcMedia(nota1, nota2, nota3);
	
	System.out.println("Media: " + media);
	
	if(media >= 6) {
		System.out.println("Aprovado");
	}
	if(media >= 4 && media < 6 ) {
		System.out.println("Recuperacao");
	} 
	if(media < 4 ){
		System.out.println("Reprovado(a)");
	}
	
	
	}

	public static int calcMedia(int nota1, int nota2, int nota3) {

		float media = (nota1 + nota2 + nota3) / 3;

		return (int) media;
	}
}
