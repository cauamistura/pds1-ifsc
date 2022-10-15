package lista02;

import javax.swing.JOptionPane;

public class Ex4 {
	
	public static void main(String[] args) {
	
	for (int i = 0; i < 10; i++) {
		String dado = JOptionPane.showInputDialog(null, "Digite: ");
		Integer new_dado = Integer.valueOf(dado);
		
		JOptionPane.showMessageDialog(null, "Valor: " + new_dado);
	}
	}

}
