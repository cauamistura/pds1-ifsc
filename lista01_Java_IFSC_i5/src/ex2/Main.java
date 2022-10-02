package ex2;

import java.util.Scanner;
		
public class Main {
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	String nom_lida, idade_lida;
	
	System.out.print("Nome:");
	nom_lida = s.nextLine();
	
	System.out.print("Idade:");
	idade_lida = s.nextLine();
	
	Integer idade = Integer.valueOf(idade_lida);
	
	System.out.println(nom_lida);	
	System.out.println(idade);	
		
	}

}