//Descrição da prática: faça dois campos de texto e um botão. 
//Você deve somar os números inseridos nos dois campos de texto ao clicar no botão e,
//em seguida, mostrar a soma em um showMessageDialog (JOptionPane).

package ifsc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		setBounds(100, 100, 177, 141);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbN1 = new JLabel("Numero 1:");
		lbN1.setBounds(12, 12, 88, 15);
		contentPane.add(lbN1);
		
		JLabel lbN2 = new JLabel("Numero 2:");
		lbN2.setBounds(12, 39, 88, 15);
		contentPane.add(lbN2);
		
		edN1 = new JTextField();
		edN1.setBounds(92, 10, 39, 19);
		contentPane.add(edN1);
		edN1.setColumns(10);
		
		edN2 = new JTextField();
		edN2.setColumns(10);
		edN2.setBounds(92, 37, 39, 19);
		contentPane.add(edN2);
		
		JButton btSoma = new JButton("Soma");
		btSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(edN1.getText().isEmpty() || edN2.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Insira Números nos Campos");
				} else {
					Double wn1 = Double.valueOf(edN1.getText());
					Double wn2 = Double.valueOf(edN2.getText());
					
					JOptionPane.showMessageDialog(null, (wn1 + wn2));
				}
				
			}
		});
		btSoma.setBounds(33, 65, 88, 25);
		contentPane.add(btSoma);
	}
}
