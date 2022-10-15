package lista02;

import javax.swing.JOptionPane;

public class Ex2 {
	
	public static void main(String[] args) {
	
	String nome = JOptionPane.showInputDialog(null, "Nome:");
	String idade = JOptionPane.showInputDialog(null, "Idade:");
	Integer new_idade = Integer.valueOf(idade);
	
	JOptionPane.showInternalMessageDialog(null,"Nome: " + nome + "\nIdade: " + new_idade);
	}

}