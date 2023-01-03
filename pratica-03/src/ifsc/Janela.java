package ifsc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private String wTexto = "";
	private int j = 0;

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
		setBounds(100, 100, 408, 275);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea taAreatxt = new JTextArea();
		taAreatxt.setBounds(36, 64, 315, 135);
		contentPane.add(taAreatxt);
		
		JComboBox<String> cbOpcoes = new JComboBox();
		cbOpcoes.setBounds(87, 31, 125, 22);		
		//ADIONAR ITENS PARA O COMBO BOX
		cbOpcoes.addItem("");	
		cbOpcoes.addItem("Brasil");
		cbOpcoes.addItem("Uruguai");
		cbOpcoes.addItem("Argentina");
		cbOpcoes.addItem("Chile");	
		contentPane.add(cbOpcoes);
		
		JButton btAdd = new JButton("Adicionar");
		btAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(cbOpcoes.getSelectedItem() != "") {
				if(j == 0) {
					wTexto = wTexto +  cbOpcoes.getSelectedItem().toString();
					j++;
				} else {
					wTexto = wTexto + ", " + cbOpcoes.getSelectedItem().toString();
				}
				taAreatxt.setText(wTexto); 	
			} else {
				JOptionPane.showMessageDialog(null, "Selecione um item");
			}
			}
		});
		btAdd.setBounds(222, 31, 129, 23);
		contentPane.add(btAdd);
		
		JLabel lbOp = new JLabel("Opções:");
		lbOp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbOp.setBounds(35, 35, 53, 14);
		contentPane.add(lbOp);
	}
}
