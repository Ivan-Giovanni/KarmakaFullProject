package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPanel;

public class ViewTour {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTour window = new ViewTour();
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
	public ViewTour() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 893, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(632, 118, 185, 227);
		frame.getContentPane().add(panel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(68, -3, 128, 149);
		frame.getContentPane().add(panel_1_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(206, 0, 128, 146);
		frame.getContentPane().add(panel_2_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBounds(344, 0, 128, 146);
		frame.getContentPane().add(panel_2_2);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBounds(482, 0, 128, 146);
		frame.getContentPane().add(panel_2_3);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setBounds(163, 170, 128, 146);
		frame.getContentPane().add(panel_2_4);
		
		JPanel panel_2_5 = new JPanel();
		panel_2_5.setBounds(390, 170, 128, 146);
		frame.getContentPane().add(panel_2_5);
		
		JPanel panel_2_6 = new JPanel();
		panel_2_6.setBounds(482, 398, 99, 113);
		frame.getContentPane().add(panel_2_6);
		
		JPanel panel_2_7 = new JPanel();
		panel_2_7.setBounds(591, 365, 128, 146);
		frame.getContentPane().add(panel_2_7);
		
		JPanel panel_2_6_1 = new JPanel();
		panel_2_6_1.setBounds(0, 398, 99, 113);
		frame.getContentPane().add(panel_2_6_1);
		
		JPanel panel_2_6_2 = new JPanel();
		panel_2_6_2.setBounds(97, 398, 99, 113);
		frame.getContentPane().add(panel_2_6_2);
		
		JPanel panel_2_6_3 = new JPanel();
		panel_2_6_3.setBounds(192, 398, 99, 113);
		frame.getContentPane().add(panel_2_6_3);
		
		JPanel panel_2_6_4 = new JPanel();
		panel_2_6_4.setBounds(291, 398, 99, 113);
		frame.getContentPane().add(panel_2_6_4);
		
		JPanel panel_2_6_5 = new JPanel();
		panel_2_6_5.setBounds(390, 398, 99, 113);
		frame.getContentPane().add(panel_2_6_5);
		
		JPanel panel_2_7_1 = new JPanel();
		panel_2_7_1.setBounds(739, 365, 128, 146);
		frame.getContentPane().add(panel_2_7_1);
	}
}
