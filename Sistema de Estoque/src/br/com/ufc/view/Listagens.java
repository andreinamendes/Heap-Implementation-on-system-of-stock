package br.com.ufc.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.ufc.controller.DistribuidoraController;
import br.com.ufc.model.Funcionario;

public class Listagens extends JFrame {

	private JPanel contentPane;
	private Funcionario funcionario;
	private DistribuidoraController conDistribuidora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listagens frame = new Listagens();
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
	public Listagens() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		conDistribuidora = new DistribuidoraController();
	}

}
