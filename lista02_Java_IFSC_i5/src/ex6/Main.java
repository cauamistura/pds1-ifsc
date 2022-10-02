package ex6;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<>();

		for (int i = 0; i < 5; i++) {

			lista.add(JOptionPane.showInputDialog("Escreva um Elemento: "));
		}

		for (String string : lista) {
			JOptionPane.showMessageDialog(null, lista);
		}

	}
}