package lista01;

import java.util.Scanner;
		
public class Ex2 {
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.print("Nome:");
	String nome = s.nextLine();
	
	System.out.print("Idade:");
	Integer idade = Integer.valueOf(s.nextLine());
	
	System.out.println(nome);	
	System.out.println(idade);	
		
	}

}