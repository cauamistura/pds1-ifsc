package ex7;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	int [] num = new int[10];
	
	num[0] = 1;
	num[1] = 1;
	num[2] = 1;
	num[3] = 1;
	num[4] = 1;
	num[5] = 1;
	num[6] = 1;
	num[7] = 1;
	num[8] = 1;
	num[9] = 7;
	
	for (int i = 0; i < num.length; i++) {
		System.out.println(num[i]);
	}
	
	System.out.println("tamanho do vetor:" + num.length);
	System.out.println("dado do ultimo vetor" + num[num.length - 1]);

	}
}