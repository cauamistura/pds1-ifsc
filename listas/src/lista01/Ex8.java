package lista01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	 
	ArrayList <String> lista = new ArrayList<>();
			
	for (int i = 0; i < 10; i++) {
		System.out.printf("Elemento %d da lista: ", i + 1);
		lista.add(s.nextLine());
		}
		for (String string : lista) {
			System.out.println(string);
		}
		
	System.out.println("tamanho da lista:" + lista.size());
	System.out.println("Ultimo elemento da lista" + lista.get(lista.size() - 1));
	}
}
