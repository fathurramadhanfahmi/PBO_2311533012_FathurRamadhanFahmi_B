package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LaundryIn Aja!");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel.setBounds(42, 23, 181, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mager Nyuci? Biar Kami yang Cuci!");
		lblNewLabel_1.setFont(new Font("SimSun", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(70, 52, 331, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username :");
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(39, 106, 117, 13);
		contentPane.add(lblNewLabel_2);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		txtUsername.setBounds(103, 129, 316, 38);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Password :");
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(42, 192, 103, 13);
		contentPane.add(lblNewLabel_3);
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		txtPassword.setBounds(103, 215, 316, 38);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(User.login(txtUsername.getText(), txtPassword.getText())) {
					new MainFrame().setVisible(true);
					dispose();
				}else {
					JOptionPane.showMessageDialog(null, "Login Gagal");
				}
			}
		});
		btnLogin.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		btnLogin.setBounds(164, 304, 199, 48);
		contentPane.add(btnLogin);
	}
}
