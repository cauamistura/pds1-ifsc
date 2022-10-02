package ex7;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String nota1 = JOptionPane.showInputDialog("Digite a primeira nota do aluno: ");
		Double newnota1 = Double.valueOf(nota1);
		
		String nota2 = JOptionPane.showInputDialog("Digite as notas do aluno: ");
		Double newnota2 = Double.valueOf(nota2);
		
		String nota3 = JOptionPane.showInputDialog("Digite as notas do aluno: ");
		Double newnota3 = Double.valueOf(nota3);
		
		double media = (newnota1 + newnota2 + newnota3) / 3;
		if (media >= 6) {
			JOptionPane.showMessageDialog(null, "Media: " + Math.round(media) + "\nSituação: APROVADO(A)");
		}
		if (media >= 4 && media < 6) {
			JOptionPane.showMessageDialog(null, "Media: " + Math.round(media) + "\nSituação: RECUPERAÇÃO");
		}
		if (media < 4) {
			JOptionPane.showMessageDialog(null, "Media: " + Math.round(media) + "\nSituação: REPROVADO(A)");
		}


}}