//Faça uma janela (JFrame) com três campos de texto (inputs) - que representam os lados de um
//triângulo - e apenas um botão. Programe o botão para que, quando clicado, verifique que tipo de
//triângulo é representado pelos lados inseridos - triângulo equilátero (três lados iguais), isósceles
//(dois lados iguais) ou escaleno (três lados diferentes).

package dia4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField edLado1;
	private JTextField edLado2;
	private JTextField edLado3;

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
		setBounds(100, 100, 181, 232);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		edLado1 = new JTextField();
		edLado1.setBounds(60, 29, 86, 20);
		contentPane.add(edLado1);
		edLado1.setColumns(10);

		edLado2 = new JTextField();
		edLado2.setColumns(10);
		edLado2.setBounds(60, 60, 86, 20);
		contentPane.add(edLado2);

		edLado3 = new JTextField();
		edLado3.setColumns(10);
		edLado3.setBounds(60, 91, 86, 20);
		contentPane.add(edLado3);

		JLabel lbLado1 = new JLabel("Lado 1:");
		lbLado1.setBounds(10, 32, 46, 14);
		contentPane.add(lbLado1);

		JLabel lbLado2 = new JLabel("Lado 2:");
		lbLado2.setBounds(10, 63, 46, 14);
		contentPane.add(lbLado2);

		JLabel lbLado3 = new JLabel("Lado 3:");
		lbLado3.setBounds(10, 94, 46, 14);
		contentPane.add(lbLado3);

		JButton btVerificar = new JButton("Verificar tipo do Trinagulo");
		btVerificar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Integer wlado1 = Integer.valueOf(edLado1.getText());
				Integer wlado2 = Integer.valueOf(edLado2.getText());
				Integer wlado3 = Integer.valueOf(edLado3.getText());

				if ( wlado1 == wlado2 && wlado1 == wlado3 && wlado2 == wlado3) {
					JOptionPane.showMessageDialog(null, "Triângulo equilátero");
				}
				else if ( wlado1 == wlado2 || wlado1 == wlado3 || wlado2 == wlado3) {
					JOptionPane.showMessageDialog(null, "Triângulo isósceles");
				}
				else {
					JOptionPane.showMessageDialog(null, "Triângulo escaleno ");
				}								
			}			
		});
		btVerificar.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btVerificar.setBounds(10, 134, 136, 23);
		contentPane.add(btVerificar);
	}
}