package lista02;

import javax.swing.JOptionPane;

public class Ex5 {
	
	public static void main(String[] args) {
	
	Integer [] vet = new Integer[10];
	Integer menor = Integer.MAX_VALUE;
	Integer maior = Integer.MIN_VALUE;
	
	for (int i = 0; i < vet.length; i++) {
		String num = JOptionPane.showInputDialog(null, "Digite um Número: ");
		Integer new_num = Integer.valueOf(num);
		vet[i] = new_num;
		 
		if(vet[i] > maior) {
			maior = vet[i];
		}
		if(vet[i] < menor) {
			menor = vet[i];
		}
		
	}
	JOptionPane.showInternalMessageDialog(null, "Maior Numero Lido: " + maior + "\nMenor Número Lido: " + menor);

	}

}