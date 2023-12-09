package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ViewNomPlayer {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewNomPlayer window = new ViewNomPlayer();
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
	public ViewNomPlayer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 626, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(178, 108, 206, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel labelName = new JLabel("Player Name");
		labelName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelName.setBounds(78, 107, 100, 27);
		frame.getContentPane().add(labelName);
		
		JButton boutonPlay = new JButton("Play");
		boutonPlay.setBounds(225, 167, 89, 23);
		frame.getContentPane().add(boutonPlay);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\fredd\\Documents\\KarmakaFullProject\\src\\img\\accueil.jpg"));
		lblNewLabel.setBounds(0, 0, 626, 363);
		frame.getContentPane().add(lblNewLabel);
	}
}
