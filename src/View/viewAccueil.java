package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Font;

public class viewAccueil {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewAccueil window = new viewAccueil();
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
	public viewAccueil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 642, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton boutonPlayerCpu = new JButton("player vs cpu");
		boutonPlayerCpu.setBackground(Color.LIGHT_GRAY);
		boutonPlayerCpu.setBounds(213, 132, 118, 23);
		frame.getContentPane().add(boutonPlayerCpu);
		
		JButton boutonCpuCpu = new JButton("CPU vs CPU");
		boutonCpuCpu.setBackground(Color.LIGHT_GRAY);
		boutonCpuCpu.setBounds(213, 186, 118, 23);
		frame.getContentPane().add(boutonCpuCpu);
		
		JLabel labelAccueil = new JLabel("");
		labelAccueil.setIcon(new ImageIcon("C:\\Users\\fredd\\Documents\\KarmakaFullProject\\src\\img\\accueil.jpg"));
		labelAccueil.setBounds(0, 0, 626, 363);
		frame.getContentPane().add(labelAccueil);
		
		JLabel labelTitreAccueil = new JLabel("TRANSCENDENCE");
		labelTitreAccueil.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelTitreAccueil.setBounds(112, 60, 362, 40);
		frame.getContentPane().add(labelTitreAccueil);
	}
}
