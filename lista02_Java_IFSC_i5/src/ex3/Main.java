package ex3;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
	
	String precoLitro = JOptionPane.showInputDialog(null, "Preço do Litro: :");
	String quantidadeLitros  = JOptionPane.showInputDialog(null, "Quantidade de Litros:");
	
	Double new_preco = Double.valueOf(precoLitro);
	Integer new_litros = Integer.valueOf(quantidadeLitros);
	
	float totalPagamento = (float) (new_preco * new_litros);
	
	JOptionPane.showInternalMessageDialog(null,"Valor a pagar: R$" + totalPagamento);
	}

}