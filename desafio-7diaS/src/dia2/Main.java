//5.Ler 5 números (digitados pelo usuário) e armazenar em um vetor. Você deve verificar quantos
//números armazenados no vetor são pares.

package dia2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner s = new Scanner (System.in);

	Integer[] vet = new Integer[5];

	for (int i = 0; i < vet.length; i++) {
		System.out.print("Número " + (i+1) + ": ");
		vet[i] = Integer.valueOf(s.nextLine());
	}

	Integer par = contPar(vet);
	System.out.println("Foram digitados " + par + " números pares");
	}

	private static Integer contPar(Integer[] vet) {
		Integer cont = 0;
		for (int i = 0; i < vet.length; i++) {
			if(vet[i] % 2 != 0) {
				cont++;
			}
		}
		return cont;
	}
}