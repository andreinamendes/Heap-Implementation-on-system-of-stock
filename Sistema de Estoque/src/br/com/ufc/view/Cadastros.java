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
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import br.com.ufc.model.*;

public class Cadastros extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private Funcionario funcionario;
	private DistribuidoraController conDistribuidora;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastros frame = new Cadastros();
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

	public Cadastros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		conDistribuidora = new DistribuidoraController();
		
		JLayeredPane Panels = new JLayeredPane();
		JPanel opcoes = new JPanel();
		JPanel Inicio = new JPanel();
		JPanel CadProdutos = new JPanel();
		JPanel CadEstoque = new JPanel();
		JPanel CadFuncionarios = new JPanel();
		
		Inicio.setBounds(0, 0, 566, 243);
		Panels.add(Inicio);
		Panels.repaint();
		Panels.revalidate();
		
		JLabel label_6 = new JLabel("Digite as indormações do funcionário.");
		JPanel panel_1 = new JPanel();
		JLabel label_7 = new JLabel("Salário:");
		JLabel label_8 = new JLabel("Cargo:");
		JLabel label_9 = new JLabel("CPF:");
		JLabel label_10 = new JLabel("Nome:");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cargo", "Gerente", "Despachante"}));
		comboBox.setSelectedIndex(0);
		comboBox.setToolTipText("");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JButton button_2 = new JButton("Limpar");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				comboBox.setSelectedIndex(0);
			}
		});
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 255, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(label_7)
								.addComponent(label_8)
								.addComponent(label_9))
							.addGap(44))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(label_10)
							.addGap(52)))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(textField_5)
						.addComponent(textField_6)
						.addComponent(textField_7))
					.addGap(30))
		);
		
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 140, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_10)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_9)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_8)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_7)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		
		JButton button_4 = new JButton("Cadastrar");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().isEmpty() || textField_3.getText().isEmpty() || textField_1.getText().isEmpty() || (comboBox.getSelectedItem() + "").equals("Cargo")) {
					JOptionPane.showMessageDialog(null, "Todos os dados precisam ser informados.", "Erro", JOptionPane.INFORMATION_MESSAGE);
				}else {
					Funcionario fun = new Funcionario();
					fun.setNome(textField.getText());
					fun.setCpf(textField_1.getText());
					fun.setCargo(comboBox.getSelectedItem() + "");
					fun.setSalario(Integer.parseInt(textField_3.getText()));
					if(conDistribuidora.setFuncionarios(fun, funcionario))
						JOptionPane.showMessageDialog(null, "Cadastrado com sucesso.", "", JOptionPane.INFORMATION_MESSAGE);
					else
						JOptionPane.showMessageDialog(null, "Não foi possível realizar o cadastro. Tente novamente mais tarde.", "Erro.", JOptionPane.INFORMATION_MESSAGE);
					Panels.removeAll();
					Panels.add(Inicio);
					Panels.repaint();
					Panels.revalidate();
				}
			}
		});
		
		CadFuncionarios.setBounds(0, 0, 566, 243);
		Panels.add(CadFuncionarios);
		GroupLayout gl_CadFuncionarios = new GroupLayout(CadFuncionarios);
		gl_CadFuncionarios.setHorizontalGroup(
			gl_CadFuncionarios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_CadFuncionarios.createSequentialGroup()
					.addGroup(gl_CadFuncionarios.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_CadFuncionarios.createSequentialGroup()
							.addGap(173)
							.addComponent(button_4)
							.addGap(31)
							.addComponent(button_2))
						.addGroup(gl_CadFuncionarios.createSequentialGroup()
							.addGap(155)
							.addGroup(gl_CadFuncionarios.createParallelGroup(Alignment.TRAILING)
								.addComponent(label_6)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(153, Short.MAX_VALUE))
		);
		gl_CadFuncionarios.setVerticalGroup(
			gl_CadFuncionarios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_CadFuncionarios.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_6)
					.addGap(12)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addGroup(gl_CadFuncionarios.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_4)
						.addComponent(button_2))
					.addGap(38))
		);
		
		CadFuncionarios.setLayout(gl_CadFuncionarios);
		
		CadEstoque.setBounds(0, 0, 566, 243);
		Panels.add(CadEstoque);
		
		JLabel lblNewLabel = new JLabel("Digite os dados do estoque.");
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		JLabel lblCategoria = new JLabel("Categoria:");
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField_8.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Dados inválidos. Digite-os novamente", "Erro.", JOptionPane.INFORMATION_MESSAGE);
					textField_8.setText("");
				}else {
					Estoque estoque = new Estoque();
					estoque.setCategoria(textField_8.getText());
					if(conDistribuidora.setEstoque(estoque, funcionario))
						JOptionPane.showMessageDialog(null, "Cadastrado com sucesso.", "", JOptionPane.INFORMATION_MESSAGE);
					else
						JOptionPane.showMessageDialog(null, "Não foi possível realizar o cadastro. Tente novamente mais tarde.", "Erro.", JOptionPane.INFORMATION_MESSAGE);
				}
				Panels.removeAll();
				Panels.add(Inicio);
				Panels.repaint();
				Panels.revalidate();
			}
		});
		
		GroupLayout gl_CadEstoque = new GroupLayout(CadEstoque);
		gl_CadEstoque.setHorizontalGroup(
			gl_CadEstoque.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_CadEstoque.createSequentialGroup()
					.addGap(231)
					.addComponent(btnCadastrar)
					.addContainerGap(234, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_CadEstoque.createSequentialGroup()
					.addContainerGap(174, Short.MAX_VALUE)
					.addGroup(gl_CadEstoque.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_CadEstoque.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addGap(30))
						.addGroup(Alignment.TRAILING, gl_CadEstoque.createSequentialGroup()
							.addComponent(lblCategoria)
							.addGap(54)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(143))
		);
		
		gl_CadEstoque.setVerticalGroup(
			gl_CadEstoque.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_CadEstoque.createSequentialGroup()
					.addContainerGap(60, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(29)
					.addGroup(gl_CadEstoque.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCategoria))
					.addGap(29)
					.addComponent(btnCadastrar)
					.addGap(66))
		);
		
		CadEstoque.setLayout(gl_CadEstoque);
		
		CadProdutos.setBounds(0, 0, 566, 243);
		Panels.add(CadProdutos);
		
		JButton button = new JButton("Cadastrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().isEmpty() || textField_3.getText().isEmpty() || textField_1.getText().isEmpty() || textField_2.getText().isEmpty() || textField_4.getText().isEmpty() || textField_9.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Dados inválidos. Digite-os novamente", "Erro.", JOptionPane.INFORMATION_MESSAGE);
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_9.setText("");
				}else {
					Produto produto = new Produto();
					produto.setCodigo(Integer.parseInt(textField.getText()));
					produto.setQuantidade(Integer.parseInt(textField_1.getText()));
					produto.setData_val(textField_2.getText());
					produto.setNome(textField_3.getText());
					produto.setData_fab(textField_4.getText());
					String categoria = textField_9.getText();
					Estoque estoque = conDistribuidora.getEstoque(categoria);
					if(estoque != null)	
						if(conDistribuidora.setProdutos(estoque, produto, funcionario))
							JOptionPane.showMessageDialog(null, "Cadastrado com sucesso.", "", JOptionPane.INFORMATION_MESSAGE);
						else 
							JOptionPane.showMessageDialog(null, "Erro ao cadastrar tente novamente mais tarde.", "Erro", JOptionPane.INFORMATION_MESSAGE);
					else
						JOptionPane.showMessageDialog(null, "Este estoque não existe.", "Erro", JOptionPane.INFORMATION_MESSAGE);
					Panels.removeAll();
					Panels.add(Inicio);
					Panels.repaint();
					Panels.revalidate();
				}
			}
		});
		
		JButton button_1 = new JButton("Limpar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
			}
		});
		
		JLabel label = new JLabel("Nome:");
		
		JLabel label_1 = new JLabel("Quantidade:");
		
		JLabel label_2 = new JLabel("Data de fabricação:");
		
		JLabel label_3 = new JLabel("Código:");
		
		JLabel label_4 = new JLabel("Data de validade:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel label_5 = new JLabel("Digite os dados do prorduto.");
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		JLabel lblCategoriaDoEstoque = new JLabel("Categoria do estoque:");
		GroupLayout gl_CadProdutos = new GroupLayout(CadProdutos);
		gl_CadProdutos.setHorizontalGroup(
			gl_CadProdutos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_CadProdutos.createSequentialGroup()
					.addGroup(gl_CadProdutos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_CadProdutos.createSequentialGroup()
							.addGap(133)
							.addGroup(gl_CadProdutos.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_CadProdutos.createSequentialGroup()
									.addGap(49)
									.addComponent(label_5))
								.addGroup(gl_CadProdutos.createSequentialGroup()
									.addGroup(gl_CadProdutos.createParallelGroup(Alignment.LEADING)
										.addComponent(label)
										.addComponent(label_1)
										.addComponent(label_2)
										.addComponent(label_3)
										.addComponent(label_4)
										.addComponent(lblCategoriaDoEstoque))
									.addGap(32)
									.addGroup(gl_CadProdutos.createParallelGroup(Alignment.LEADING, false)
										.addComponent(textField)
										.addComponent(textField_1)
										.addComponent(textField_2)
										.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
										.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_CadProdutos.createSequentialGroup()
							.addGap(171)
							.addComponent(button)
							.addGap(39)
							.addComponent(button_1)))
					.addContainerGap(126, Short.MAX_VALUE))
		);
		gl_CadProdutos.setVerticalGroup(
			gl_CadProdutos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_CadProdutos.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_5)
					.addGap(18)
					.addGroup(gl_CadProdutos.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_CadProdutos.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_CadProdutos.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_CadProdutos.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_CadProdutos.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_4))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_CadProdutos.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCategoriaDoEstoque))
					.addPreferredGap(ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
					.addGroup(gl_CadProdutos.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_1)
						.addComponent(button))
					.addContainerGap())
		);
		
		CadProdutos.setLayout(gl_CadProdutos);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(opcoes, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(opcoes, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
		);
		
		JLabel lblEscolhaOTipo = new JLabel("Escolha o tipo de cadastro.");
		
		
		JButton btnProdutos = new JButton("Produtos");
		btnProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.removeAll();
				Panels.add(CadProdutos);
				Panels.repaint();
				Panels.revalidate();
			}
		});
		
		btnProdutos.addMouseListener(new MouseAdapter() {
			
		});
		
		JButton btnFuncionrios = new JButton("Funcionários");
		btnFuncionrios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.removeAll();
				Panels.add(CadFuncionarios);
				Panels.repaint();
				Panels.revalidate();
			}
		});
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MenuGerente ap = new MenuGerente();
				ap.setVisible(true);
				dispose();
			}
		});
		
		JButton btnEstoques = new JButton("Estoques");
		btnEstoques.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.removeAll();
				Panels.add(CadEstoque);
				Panels.repaint();
				Panels.revalidate();
			}
		});
		
		GroupLayout gl_opcoes = new GroupLayout(opcoes);
		gl_opcoes.setHorizontalGroup(
			gl_opcoes.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_opcoes.createSequentialGroup()
					.addGap(196)
					.addComponent(lblEscolhaOTipo)
					.addContainerGap(211, Short.MAX_VALUE))
				.addGroup(gl_opcoes.createSequentialGroup()
					.addGap(99)
					.addComponent(btnProdutos)
					.addGap(33)
					.addComponent(btnFuncionrios)
					.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
					.addComponent(btnEstoques)
					.addGap(112))
				.addGroup(gl_opcoes.createSequentialGroup()
					.addGap(244)
					.addComponent(btnVoltar, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(248, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_opcoes.createSequentialGroup()
					.addContainerGap()
					.addComponent(Panels, GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_opcoes.setVerticalGroup(
			gl_opcoes.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_opcoes.createSequentialGroup()
					.addGap(6)
					.addComponent(lblEscolhaOTipo)
					.addGap(18)
					.addGroup(gl_opcoes.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnEstoques)
						.addComponent(btnProdutos)
						.addComponent(btnFuncionrios))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(Panels, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(btnVoltar)
					.addContainerGap())
		);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Selecione o que deseja cadastrar acima.");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 14));
		GroupLayout gl_Inicio = new GroupLayout(Inicio);
		gl_Inicio.setHorizontalGroup(
			gl_Inicio.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_Inicio.createSequentialGroup()
					.addContainerGap(129, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1)
					.addGap(117))
		);
		gl_Inicio.setVerticalGroup(
			gl_Inicio.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Inicio.createSequentialGroup()
					.addGap(94)
					.addComponent(lblNewLabel_1)
					.addContainerGap(132, Short.MAX_VALUE))
		);
		Inicio.setLayout(gl_Inicio);
		opcoes.setLayout(gl_opcoes);
		contentPane.setLayout(gl_contentPane);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
