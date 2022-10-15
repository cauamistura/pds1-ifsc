package ifsc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField edNome;
	private JTextField edNota1;
	private JTextField edNota2;
	private JTextField edNota3;

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
		setBounds(100, 100, 287, 293);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNome = new JLabel("Nome:");
		lbNome.setBounds(33, 10, 45, 13);
		contentPane.add(lbNome);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setBounds(33, 57, 45, 13);
		contentPane.add(lblNota1);
		
		JLabel lbNota2 = new JLabel("Nota 2:");
		lbNota2.setBounds(33, 92, 45, 13);
		contentPane.add(lbNota2);
		
		JLabel lbNota3 = new JLabel("Nota 3:");
		lbNota3.setBounds(33, 123, 45, 13);
		contentPane.add(lbNota3);
		
		edNome = new JTextField();
		edNome.setBounds(70, 7, 96, 19);
		contentPane.add(edNome);
		edNome.setColumns(10);
		
		edNota1 = new JTextField();
		edNota1.setColumns(10);
		edNota1.setBounds(70, 54, 96, 19);
		contentPane.add(edNota1);
		
		edNota2 = new JTextField();
		edNota2.setColumns(10);
		edNota2.setBounds(70, 89, 96, 19);
		contentPane.add(edNota2);
		
		edNota3 = new JTextField();
		edNota3.setColumns(10);
		edNota3.setBounds(70, 120, 96, 19);
		contentPane.add(edNota3);
		
		JButton btCalcularMedia = new JButton("Calcular Media");
		btCalcularMedia.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String wNomePessoa = edNome.getText();
				
				Double wnota1 = Double.valueOf(edNota1.getText());
				Double wnota2 = Double.valueOf(edNota2.getText());
				Double wnota3 = Double.valueOf(edNota3.getText());
				
				Double media = (wnota1 + wnota2 + wnota3)/3;
				
				JOptionPane.showMessageDialog(null,"A nota do " + wNomePessoa + " é : " + media);
			}
		});
		btCalcularMedia.setBounds(33, 163, 133, 21);
		contentPane.add(btCalcularMedia);
	}
}