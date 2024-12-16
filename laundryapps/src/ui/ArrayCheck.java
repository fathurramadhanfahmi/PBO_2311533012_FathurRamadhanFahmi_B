package ui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class ArrayCheck extends JFrame {

	private JPanel contentPane;
	private JTextField txtDataArray;
	private JTextField txtCheck;
	private JLabel lblData;
	private JTextArea textAreaHasil;
	private String[] dataArray;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArrayCheck frame = new ArrayCheck();
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
	public ArrayCheck() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Masukkan Data");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(36, 11, 118, 31);
		contentPane.add(lblNewLabel);
		
		txtDataArray = new JTextField();
		txtDataArray.setBounds(36, 48, 260, 23);
		contentPane.add(txtDataArray);
		txtDataArray.setColumns(10);
		
		JButton btnSimpanInput = new JButton("Simpan");
		btnSimpanInput.setBounds(306, 48, 89, 23);
		contentPane.add(btnSimpanInput);
		
		JButton btnSimpanCheck = new JButton("Check");
		btnSimpanCheck.setBounds(306, 143, 89, 23);
		contentPane.add(btnSimpanCheck);
		
		lblData = new JLabel("Data :");
		lblData.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblData.setBounds(36, 81, 359, 23);
		contentPane.add(lblData);
		
		JLabel lblCheckArrayKe = new JLabel("Check Array ke-");
		lblCheckArrayKe.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCheckArrayKe.setBounds(36, 142, 110, 23);
		contentPane.add(lblCheckArrayKe);
		
		txtCheck = new JTextField();
		txtCheck.setColumns(10);
		txtCheck.setBounds(135, 143, 162, 23);
		contentPane.add(txtCheck);
		
		textAreaHasil = new JTextArea();
		textAreaHasil.setBounds(36, 176, 207, 22);
		contentPane.add(textAreaHasil);
		
		
		btnSimpanInput.addActionListener(e -> {
			String inputData = txtDataArray.getText();
			dataArray = inputData.split(",");
			lblData.setText("Data: " + String.join(", ", dataArray));
		});
		
		
		btnSimpanCheck.addActionListener(e -> {
		    try {	
		        int index = Integer.parseInt(txtCheck.getText());	     
		        if (index >= 0 && index < dataArray.length) {
		            textAreaHasil.setText(dataArray[index]);
		        } else {
		            textAreaHasil.setText("Indeks tidak valid");
		        }
		    } catch (NumberFormatException ex) {
		        textAreaHasil.setText("Input tidak valid");
		    }
		});

	}
}
