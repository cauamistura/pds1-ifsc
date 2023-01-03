//14. Faça um método que receba um vetor de Float como parâmetro. O método deve verificar qual o
//maior número armazenado no vetor e retorná-lo.

package dia3;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);

	System.out.print("Qauntidade de números há serem lidos: ");
	Integer wNumVet = Integer.valueOf(s.nextLine());

	Float[] wVet = new Float[wNumVet];

	for (int i = 0; i < wVet.length; i++) {
		System.out.print("Número " + (i+1) + ": ");
		wVet[i] = Float.valueOf(s.nextLine()); 		
	}
	Float wMaior = calcMaior(wVet);

	System.out.println("O Maior número lido é: " + wMaior);
	}

	private static Float calcMaior(Float[] wVet) {
		Float wMaior = Float.MIN_VALUE;

		for (int i = 0; i < wVet.length; i++) {
			if(wVet[i] > wMaior ){
				wMaior = wVet[i];
			}
		}
		return wMaior;
	}
}

