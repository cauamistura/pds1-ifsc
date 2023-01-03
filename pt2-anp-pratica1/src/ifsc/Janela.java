package ifsc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField edNome;
	private JTextField edCPF;
	private String wTexto = "";

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
		setBounds(100, 100, 543, 219);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbCPF = new JLabel("CPF:");
		lbCPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbCPF.setBounds(49, 95, 72, 22);
		contentPane.add(lbCPF);
		
		JLabel lbPronome = new JLabel("Pronome:");
		lbPronome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbPronome.setBounds(22, 31, 72, 22);
		contentPane.add(lbPronome);
		
		JLabel lbNome = new JLabel("Nome:");
		lbNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbNome.setBounds(36, 63, 72, 22);
		contentPane.add(lbNome);
		
		JComboBox<String> cbPronome = new JComboBox();
		cbPronome.addItem("");
		cbPronome.addItem("Sr.");
		cbPronome.addItem("Sra.");
		cbPronome.addItem("Srta.");
		
		cbPronome.setBounds(83, 33, 79, 21);
		contentPane.add(cbPronome);
		
		edNome = new JTextField();
		edNome.setBounds(83, 66, 96, 19);
		contentPane.add(edNome);
		edNome.setColumns(10);
		
		edCPF = new JTextField();
		edCPF.setBounds(83, 98, 96, 19);
		contentPane.add(edCPF);
		edCPF.setColumns(10);
		
		JTextArea taPrint = new JTextArea();
		taPrint.setBounds(197, 31, 322, 123);
		contentPane.add(taPrint);
		
		JButton btAdicionar = new JButton("Adicionar");
		btAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( cbPronome.getSelectedItem().toString() == ""  || edNome.getText() == "" || edCPF.getText() == "" ) {
					JOptionPane.showInternalMessageDialog(null, "Preencha Todos os Campos");
				} else {
				wTexto = wTexto + cbPronome.getSelectedItem().toString() + edNome.getText() + " cujo CPF é " + edCPF.getText() + "\n";
				taPrint.setText(wTexto);
				}
			}
		});
		btAdicionar.setBounds(59, 133, 85, 21);
		contentPane.add(btAdicionar);
	}
}
