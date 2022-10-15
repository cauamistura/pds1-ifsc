package lista01;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Integer[] num = new Integer[10];
		Integer maior = Integer.MIN_VALUE;
		Integer menor = Integer.MAX_VALUE;

		for (int i = 0; i < 10; i++) {

			System.out.print("Numero:");
			num[i] = Integer.valueOf(s.nextLine());

			if (num[i] > maior) {
				maior = num[i];
			}
			if (num[i] < menor) {
				menor = num[i];
			}
			
		}

		System.out.println("Maior numero digitado: " + maior);
		System.out.print("Menor numero digitado: " + menor);

	}
}