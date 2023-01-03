package dia6;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField edMaior;
	private JTextField edNumero;
	private JTextField edMenor;
	ArrayList<Double> slNumeros = new ArrayList();

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
		setBounds(100, 100, 328, 172);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbNumero = new JLabel("Número: ");
		lbNumero.setBounds(27, 29, 56, 14);
		contentPane.add(lbNumero);

		JLabel lbMaior = new JLabel("Maior: ");
		lbMaior.setBounds(37, 54, 46, 14);
		contentPane.add(lbMaior);

		JLabel lbMenor = new JLabel("Menor");
		lbMenor.setBounds(37, 79, 46, 14);
		contentPane.add(lbMenor);

		edMaior = new JTextField();
		edMaior.setEditable(false);
		edMaior.setBounds(85, 51, 86, 20);
		contentPane.add(edMaior);
		edMaior.setColumns(10);

		edNumero = new JTextField();
		edNumero.setColumns(10);
		edNumero.setBounds(85, 26, 86, 20);
		contentPane.add(edNumero);

		edMenor = new JTextField();
		edMenor.setEditable(false);
		edMenor.setColumns(10);
		edMenor.setBounds(85, 76, 86, 20);
		contentPane.add(edMenor);

		JButton btAdicionar = new JButton("ADD");
		btAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				slNumeros.add(Double.valueOf(edNumero.getText()));
			}
		});
		btAdicionar.setBounds(180, 25, 89, 23);
		contentPane.add(btAdicionar);

		JButton bdResultado = new JButton("Result");
		bdResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Double wMaior = calcMaior(slNumeros);
				Double wMenor = calcMenor(slNumeros);

				edMaior.setText(String.valueOf(wMaior));
				edMenor.setText(String.valueOf(wMenor));
			}

			private Double calcMenor(ArrayList<Double> slNumeros) {
				Double Result = Double.MAX_VALUE;
				for (int i = 0; i < slNumeros.size(); i++) {
					if(slNumeros.get(i) < Result) {
						Result = slNumeros.get(i);
					}
				}
				return Result;
			}

			private Double calcMaior(ArrayList<Double> slNumeros) {
				Double Result = Double.MIN_VALUE;
				for (int i = 0; i < slNumeros.size(); i++) {
					if(slNumeros.get(i) > Result) {
						Result = slNumeros.get(i);
					}
				}
				return Result;
			}
		});
		bdResultado.setBounds(180, 75, 89, 23);
		contentPane.add(bdResultado);
	}
}