package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Instructions {

	private JFrame frame;

	public Instructions() {
		Instructions window = new Instructions();
		window.frame.setVisible(true);
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 439, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 102));
		panel.setBounds(0, 0, 421, 424);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblInstructions = new JLabel("Instructions:");
		lblInstructions.setFont(new Font("Snap ITC", Font.BOLD, 30));
		lblInstructions.setForeground(new Color(255, 204, 51));
		lblInstructions.setBackground(new Color(0, 0, 102));
		lblInstructions.setBounds(12, 13, 255, 73);
		panel.add(lblInstructions);
		
		JLabel lblNewLabel = new JLabel("The Earth is slowly dying and a scientist wants to help build\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBackground(new Color(0, 0, 102));
		lblNewLabel.setForeground(new Color(255, 204, 51));
		lblNewLabel.setBounds(34, 79, 375, 36);
		panel.add(lblNewLabel);
		
		JLabel lblANewLife = new JLabel(" a new life on Mars. However, he only has a spaceship that was");
		lblANewLife.setForeground(new Color(255, 204, 51));
		lblANewLife.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblANewLife.setBackground(new Color(0, 0, 102));
		lblANewLife.setBounds(12, 108, 397, 36);
		panel.add(lblANewLife);
		
		JLabel lblSoTinyIt = new JLabel(" so tiny it could only carry him and two other items. . He wants");
		lblSoTinyIt.setForeground(new Color(255, 204, 51));
		lblSoTinyIt.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSoTinyIt.setBackground(new Color(0, 0, 102));
		lblSoTinyIt.setBounds(12, 138, 397, 36);
		panel.add(lblSoTinyIt);
		
		JLabel lblSToTransport = new JLabel("to transport five things that he thought were essential to start");
		lblSToTransport.setForeground(new Color(255, 204, 51));
		lblSToTransport.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSToTransport.setBackground(new Color(0, 0, 102));
		lblSToTransport.setBounds(12, 167, 397, 36);
		panel.add(lblSToTransport);
		
		JLabel lblANewLife_1 = new JLabel("a new life on Mars: 2 humans, 1 lion, 1 cow and 1 bag of grain.");
		lblANewLife_1.setForeground(new Color(255, 204, 51));
		lblANewLife_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblANewLife_1.setBackground(new Color(0, 0, 102));
		lblANewLife_1.setBounds(12, 199, 397, 36);
		panel.add(lblANewLife_1);
		
		JLabel lblWheneverTheScientist = new JLabel("Whenever the scientist is not around, either human would kill");
		lblWheneverTheScientist.setForeground(new Color(255, 204, 51));
		lblWheneverTheScientist.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWheneverTheScientist.setBackground(new Color(0, 0, 102));
		lblWheneverTheScientist.setBounds(12, 227, 397, 36);
		panel.add(lblWheneverTheScientist);
		
		JLabel lblTheLionOut = new JLabel("the lion out of fear or eat the cow out of hunger, the lion will");
		lblTheLionOut.setForeground(new Color(255, 204, 51));
		lblTheLionOut.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTheLionOut.setBackground(new Color(0, 0, 102));
		lblTheLionOut.setBounds(12, 257, 397, 36);
		panel.add(lblTheLionOut);
		
		JLabel lblEatTheCow = new JLabel("eat the cow, and the cow will eat the grain. Only the scientist");
		lblEatTheCow.setForeground(new Color(255, 204, 51));
		lblEatTheCow.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEatTheCow.setBackground(new Color(0, 0, 102));
		lblEatTheCow.setBounds(12, 287, 397, 36);
		panel.add(lblEatTheCow);
		
		JLabel lblKnowsHowtoFly = new JLabel("knows howto fly the spaceship. How will the scientist transport");
		lblKnowsHowtoFly.setForeground(new Color(255, 204, 51));
		lblKnowsHowtoFly.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblKnowsHowtoFly.setBackground(new Color(0, 0, 102));
		lblKnowsHowtoFly.setBounds(12, 316, 397, 36);
		panel.add(lblKnowsHowtoFly);
		
		JLabel lblAllItems = new JLabel("all 5 items to Mars?");
		lblAllItems.setForeground(new Color(255, 204, 51));
		lblAllItems.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAllItems.setBackground(new Color(0, 0, 102));
		lblAllItems.setBounds(12, 346, 397, 36);
		panel.add(lblAllItems);
		
		JButton btnLetsStart = new JButton("Let's Start!");
		btnLetsStart.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLetsStart.setBounds(150, 395, 117, 25);
		panel.add(btnLetsStart);
	}

}
