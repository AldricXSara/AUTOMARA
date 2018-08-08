package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class Game {

	private JFrame frame;

	public Game() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 643, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 102));
		panel.setBounds(0, 0, 625, 487);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("The Automat Game");
		label.setForeground(new Color(255, 204, 51));
		label.setFont(new Font("Snap ITC", Font.BOLD, 30));
		label.setBackground(new Color(0, 0, 102));
		label.setBounds(138, 34, 351, 40);
		panel.add(label);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(33, 98, 242, 221);
		panel.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(356, 98, 236, 221);
		panel.add(textArea_1);
		
		JLabel lblToTransfer = new JLabel("To Transfer:");
		lblToTransfer.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblToTransfer.setForeground(new Color(255, 204, 51));
		lblToTransfer.setBackground(new Color(0, 0, 102));
		lblToTransfer.setBounds(33, 339, 90, 27);
		panel.add(lblToTransfer);
		
		JCheckBox chckbxHuman = new JCheckBox("Human 1");
		chckbxHuman.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxHuman.setForeground(new Color(255, 204, 51));
		chckbxHuman.setBackground(new Color(0, 0, 102));
		chckbxHuman.setBounds(52, 375, 113, 25);
		panel.add(chckbxHuman);
		
		JCheckBox chckbxHuman_1 = new JCheckBox("Human 2");
		chckbxHuman_1.setForeground(new Color(255, 204, 51));
		chckbxHuman_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxHuman_1.setBackground(new Color(0, 0, 102));
		chckbxHuman_1.setBounds(52, 411, 113, 25);
		panel.add(chckbxHuman_1);
		
		JCheckBox chckbxLion = new JCheckBox("Lion");
		chckbxLion.setForeground(new Color(255, 204, 51));
		chckbxLion.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxLion.setBackground(new Color(0, 0, 102));
		chckbxLion.setBounds(169, 375, 69, 25);
		panel.add(chckbxLion);
		
		JCheckBox chckbxCow = new JCheckBox("Cow");
		chckbxCow.setForeground(new Color(255, 204, 51));
		chckbxCow.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxCow.setBackground(new Color(0, 0, 102));
		chckbxCow.setBounds(169, 412, 69, 25);
		panel.add(chckbxCow);
		
		JCheckBox chckbxGrain = new JCheckBox("Grain");
		chckbxGrain.setForeground(new Color(255, 204, 51));
		chckbxGrain.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxGrain.setBackground(new Color(0, 0, 102));
		chckbxGrain.setBounds(242, 375, 113, 25);
		panel.add(chckbxGrain);
		
		JLabel lblNoOfMoves = new JLabel("No. Of Moves:");
		lblNoOfMoves.setBackground(new Color(0, 0, 102));
		lblNoOfMoves.setForeground(new Color(255, 204, 51));
		lblNoOfMoves.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNoOfMoves.setBounds(356, 358, 113, 16);
		panel.add(lblNoOfMoves);
		
		JButton btnNewButton = new JButton("Transfer");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(372, 391, 97, 66);
		panel.add(btnNewButton);
		
		JButton btnGiveUp = new JButton("Give Up");
		btnGiveUp.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnGiveUp.setBounds(495, 391, 97, 66);
		panel.add(btnGiveUp);
	}
}
