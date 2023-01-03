//Faça uma janela (JFrame) com dois campos de texto (inputs). 
//Você deve criar quatro botões com os operadores de soma, subtração, divisão e multiplicação. 
//Programe cada botão para realizar uma operação de acordo com o que foi clicado, 
//e exiba o resultado em uma caixa de diálogo com o showMessageDialog (JOptionPane).

package dia7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField edN1;
	private JTextField edN2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 212, 132);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		edN1 = new JTextField();
		edN1.setBounds(10, 11, 75, 20);
		contentPane.add(edN1);
		edN1.setColumns(10);

		edN2 = new JTextField();
		edN2.setColumns(10);
		edN2.setBounds(111, 11, 75, 20);
		contentPane.add(edN2);

		JButton btAdicao = new JButton("+");
		btAdicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Double wN1 = Double.valueOf(edN1.getText());
				Double wN2 = Double.valueOf(edN2.getText());

				Double Result = wN1 + wN2;
				JOptionPane.showMessageDialog(null, Result);

			}
		});
		btAdicao.setBounds(10, 42, 48, 23);
		contentPane.add(btAdicao);

		JButton btSubtracao = new JButton("-");
		btSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Double wN1 = Double.valueOf(edN1.getText());
				Double wN2 = Double.valueOf(edN2.getText());

				Double Result = wN1 - wN2;
				JOptionPane.showMessageDialog(null, Result);

			}
		});
		btSubtracao.setBounds(59, 42, 38, 23);
		contentPane.add(btSubtracao);

		JButton btDivisao = new JButton("/");
		btDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Double wN1 = Double.valueOf(edN1.getText());
				Double wN2 = Double.valueOf(edN2.getText());

				Double Result = wN1 / wN2;
				JOptionPane.showMessageDialog(null, Result);

			}
		});
		btDivisao.setBounds(97, 42, 38, 23);
		contentPane.add(btDivisao);

		JButton btMultiplicacao = new JButton("x");
		btMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Double wN1 = Double.valueOf(edN1.getText());
				Double wN2 = Double.valueOf(edN2.getText());

				Double Result = wN1 * wN2;
				JOptionPane.showMessageDialog(null, Result);

			}
		});
		btMultiplicacao.setBounds(135, 42, 51, 23);
		contentPane.add(btMultiplicacao);
	}

}