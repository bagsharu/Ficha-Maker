package Ordem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;

public class Tela1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 window = new Tela1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(98, 67, 112));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Combatente");
		btnNewButton.setBounds(10, 165, 125, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnEspecialista = new JButton("Especialista");
		btnEspecialista.setBounds(145, 165, 144, 50);
		frame.getContentPane().add(btnEspecialista);
		
		JButton btnOcultista = new JButton("Ocultista");
		btnOcultista.setBounds(299, 165, 125, 50);
		frame.getContentPane().add(btnOcultista);
		
		JLabel lblNewLabel = new JLabel("\t\t\t\t\t\t\tSelecione a classe do Agente:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("DialogInput", Font.BOLD, 19));
		lblNewLabel.setBounds(55, 68, 327, 56);
		frame.getContentPane().add(lblNewLabel);
	}
}
