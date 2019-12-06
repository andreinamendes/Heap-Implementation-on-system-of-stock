package br.com.ufc.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.ufc.model.Estoque;
import br.com.ufc.model.Produto;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JFormattedTextField;

public class CadastroProdutos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private Estoque estoque;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProdutos frame = new CadastroProdutos();
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
	public CadastroProdutos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.estoque = new Estoque();
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cadastros cad = new Cadastros();
				cad.setVisible(true);
				dispose();
			}
		});
		
		JLabel lblDigiteOsDados = new JLabel("Digite os dados do prorduto.");
		
		JLabel lblNome = new JLabel("Nome:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().isEmpty() || textField_3.getText().isEmpty() || textField_1.getText().isEmpty() || textField_2.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Dados inválidos. Digite-os novamente", "Erro.", JOptionPane.INFORMATION_MESSAGE);
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
				}else {
					Produto produto = new Produto();
					produto.setCodigo(Integer.parseInt(textField.getText()));
					produto.setNome(textField_1.getText());
					produto.setQuantidade(Integer.parseInt(textField_2.getText()));
					produto.setData_fab(textField_3.getText());
	//				if(estoque.setProduto(produto))
	//					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso.", "", JOptionPane.INFORMATION_MESSAGE);
	//				else 
	//					JOptionPane.showMessageDialog(null, "Erro ao cadastrar tente novamente mais tarde.", "", JOptionPane.INFORMATION_MESSAGE);
					Cadastros cad = new Cadastros();
					cad.setVisible(true);
					dispose();
				}
			}
		});
		
		JLabel lblCdigo = new JLabel("Código:");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Data de fabricação:");
		
		JLabel lblNewLabel_1 = new JLabel("Data de validade:");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(70, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(120)
									.addComponent(btnCadastrar)
									.addGap(18)
									.addComponent(btnLimpar))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(70)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNome)
										.addComponent(lblQuantidade)
										.addComponent(lblNewLabel)
										.addComponent(lblCdigo)
										.addComponent(lblNewLabel_1))
									.addGap(51)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(textField_2)
										.addComponent(textField_1)
										.addComponent(textField_4)
										.addComponent(textField, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
										.addComponent(textField_3)))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(119)
									.addComponent(lblDigiteOsDados)))
							.addGap(65))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(btnVoltar)
							.addGap(178))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDigiteOsDados)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCdigo)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQuantidade)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(28)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnLimpar)
						.addComponent(btnCadastrar))
					.addGap(12)
					.addComponent(btnVoltar)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
	}
}
