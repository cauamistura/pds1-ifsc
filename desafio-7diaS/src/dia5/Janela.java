//Faça uma janela (JFrame) como se pede: 4.1. Crie dois campos de texto (JTextField): 
//um campo para cadastrar um número e outro para mostrar o resultado do que for pedido 4.1.1. 
//O campo para mostrar o resultado deve ser impossível de editar- você deve procurar a propriedade 
//para desativar no menu de propriedades do WindowBuilder 4.2. 4.3. 4.4. 4.5. Dois labels (JLabel) para identificar cada campo de texto; 
//Um botão (JButton) com texto “CADASTRAR” e outro botão (JButton) com texto “EXIBIR” 
//Ao clicar no botão “CADASTRAR” você deve inserir o número em uma lista (ArrayList) de Double. Ao clicar no botão “EXIBIR” 
//você deve exibir no campo de resultado a quantidade de números pares que foram armazenados na lista

package dia5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField edNumero;
	private JTextField edResultado;
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
		setBounds(100, 100, 457, 126);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNumero = new JLabel("Número:");
		lbNumero.setBounds(112, 22, 53, 14);
		contentPane.add(lbNumero);
		
		JLabel lbQtdPares = new JLabel("Qtd de Pares Cadastrados:");
		lbQtdPares.setBounds(10, 47, 155, 14);
		contentPane.add(lbQtdPares);
		
		edNumero = new JTextField();
		edNumero.setBounds(175, 19, 86, 20);
		contentPane.add(edNumero);
		edNumero.setColumns(10);
		
		edResultado = new JTextField();
		edResultado.setEditable(false);
		edResultado.setColumns(10);
		edResultado.setBounds(175, 44, 86, 20);
		contentPane.add(edResultado);
		
		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				slNumeros.add(Double.valueOf(edNumero.getText()));
			}
		});
		btCadastrar.setBounds(271, 18, 100, 23);
		contentPane.add(btCadastrar);
		
		JButton btResultado = new JButton("Resultado");
		btResultado.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Integer wPar = countPar(slNumeros);
				//JOptionPane.showMessageDialog(null, wPar);
				edResultado.setText(String.valueOf(wPar));;
			}

			private Integer countPar(ArrayList<Double> slNumeros) {
				Integer Result = 0;
				for (int i = 0; i < slNumeros.size(); i++) {
					if(slNumeros.get(i) % 2 == 0) {
						Result++;
					}
				}
				return Result;
			}
			
		});
		btResultado.setBounds(271, 43, 100, 23);
		contentPane.add(btResultado);
	}
	
}
