package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start_Menu {

	private JFrame frame;

	public Start_Menu() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 439, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 102));
		panel.setBounds(0, 0, 421, 424);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTheAutomatGame = new JLabel("The Automat Game");
		lblTheAutomatGame.setForeground(new Color(255, 204, 51));
		lblTheAutomatGame.setBackground(new Color(0, 0, 102));
		lblTheAutomatGame.setBounds(32, 81, 351, 40);
		panel.add(lblTheAutomatGame);
		lblTheAutomatGame.setFont(new Font("Snap ITC", Font.BOLD, 30));
		
		JButton btnStartGame = new JButton("Start Game");
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				Instructions ins = new Instructions();
			}
		});
		btnStartGame.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnStartGame.setBounds(84, 173, 239, 55);
		panel.add(btnStartGame);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(84, 245, 239, 55);
		panel.add(btnNewButton);
		
		JLabel lblLimkicoAngelicaElaine = new JLabel("Limkico, Angelica Elaine ----- Sarahan, Ron ----- Sy, Hannah Idette");
		lblLimkicoAngelicaElaine.setForeground(new Color(255, 204, 51));
		lblLimkicoAngelicaElaine.setBackground(new Color(0, 0, 102));
		lblLimkicoAngelicaElaine.setBounds(12, 395, 397, 16);
		panel.add(lblLimkicoAngelicaElaine);
	}
}
