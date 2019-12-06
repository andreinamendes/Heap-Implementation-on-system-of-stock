package br.com.ufc.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.ufc.controller.DistribuidoraController;
import br.com.ufc.model.Estoque;
import br.com.ufc.model.Funcionario;
import br.com.ufc.model.Produto;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuDespachante extends JFrame {

	private JPanel contentPane;
	private Funcionario funcionario;
	private DistribuidoraController conDistribuidora;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuDespachante frame = new MenuDespachante();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void pegarFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	/**
	 * Create the frame.
	 */
	public MenuDespachante() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		//conDistribuidora = new DistribuidoraController();
		setContentPane(contentPane);
		
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblEscolhaAOpo = new JLabel("Escolha a opção.");
		
		JButton btnDespacharProduto = new JButton("Despachar produto");
		btnDespacharProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textField.getText();
				int qtd = Integer.parseInt(textField_1.getText());
				Estoque estoque;
				if(conDistribuidora.buscarProduto(nome) != null) {
					estoque = conDistribuidora.buscarProduto(nome);
					int nova_qtd = estoque.getProdutos(nome).getQuantidade() - qtd;
					if(nova_qtd < 0)
						JOptionPane.showMessageDialog(null, "O produto não tem essa quantidade em estoque para despachar.", "Erro.", JOptionPane.INFORMATION_MESSAGE);
					else if(nova_qtd == 0) {
						estoque.removeProduto(estoque.getProdutos(nome).getCodigo(), funcionario);
						JOptionPane.showMessageDialog(null, "Despachado. Produto removido pois está sem unidades no estoque.", "", JOptionPane.INFORMATION_MESSAGE);
					}else
						JOptionPane.showMessageDialog(null, "Produto despachado com sucesso.", "", JOptionPane.INFORMATION_MESSAGE);
				}else
					JOptionPane.showMessageDialog(null, "Produto não existente nos estoques.", "Erro.", JOptionPane.INFORMATION_MESSAGE);
				textField.setText("");
				textField_1.setText("");
			}
		});
		
		JLabel lblCodigoProduto = new JLabel("Codigo produto:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblQuantidadeDespachada = new JLabel("Quantidade despachada:");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(139, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblQuantidadeDespachada)
										.addComponent(lblCodigoProduto))
									.addGap(32)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(112)
									.addComponent(lblEscolhaAOpo)))
							.addGap(124))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addComponent(btnDespacharProduto)
							.addGap(203))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(63)
					.addComponent(lblEscolhaAOpo)
					.addGap(43)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCodigoProduto))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQuantidadeDespachada)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
					.addComponent(btnDespacharProduto)
					.addGap(74))
		);
		panel.setLayout(gl_panel);
	}
}
