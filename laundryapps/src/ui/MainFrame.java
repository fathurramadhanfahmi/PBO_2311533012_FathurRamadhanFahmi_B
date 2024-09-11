package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Laundry Apps");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 21));
		lblNewLabel.setBounds(31, 20, 166, 37);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Pesanan");
		btnNewButton.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		btnNewButton.setBounds(40, 91, 123, 57);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Layanan");
		btnNewButton_1.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		btnNewButton_1.setBounds(216, 94, 135, 57);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Pelanggan");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		btnNewButton_2.setBounds(389, 91, 123, 57);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Pengguna");
		btnNewButton_3.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		btnNewButton_3.setBounds(40, 189, 123, 53);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Laporan");
		btnNewButton_4.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		btnNewButton_4.setBounds(216, 185, 135, 57);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Profile");
		btnNewButton_5.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		btnNewButton_5.setBounds(389, 187, 123, 57);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Keluar");
		btnNewButton_6.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		btnNewButton_6.setBounds(40, 276, 470, 37);
		contentPane.add(btnNewButton_6);
	}

}
