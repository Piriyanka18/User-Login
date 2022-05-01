package login_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;

import GUI._main;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Toolkit;

public class login {

	private JFrame frame;
	private JTextField text1;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\project\\Java\\images\\219983.png"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbe1 = new JLabel("User Name");
		lbe1.setBounds(10, 61, 119, 28);
		lbe1.setForeground(Color.PINK);
		lbe1.setHorizontalAlignment(SwingConstants.CENTER);
		lbe1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.getContentPane().add(lbe1);
		
		text1 = new JTextField();
		text1.setBounds(153, 63, 241, 25);
		text1.setHorizontalAlignment(SwingConstants.LEFT);
		text1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.getContentPane().add(text1);
		text1.setColumns(10);
		
		JLabel lbe2 = new JLabel("Password");
		lbe2.setBounds(10, 110, 119, 28);
		lbe2.setForeground(Color.PINK);
		lbe2.setHorizontalAlignment(SwingConstants.CENTER);
		lbe2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.getContentPane().add(lbe2);
		
		JButton btn1 = new JButton("Login");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=text1.getText();
				String password=pass.getText();
				
				if(password.contains("123") && username.contains("123")) {
					text1.setText(null);
					pass.setText(null);
					_main.main(null);
				}
				else {
					JOptionPane.showMessageDialog(null, "    INVALID LOGIN   ","ERROR",JOptionPane.ERROR_MESSAGE);
					text1.setText(null);
					pass.setText(null);
				}
				
			}
		});
		btn1.setBounds(30, 190, 98, 34);
		btn1.setBackground(Color.GRAY);
		btn1.setForeground(Color.PINK);
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.getContentPane().add(btn1);
		
		JLabel lblNewLabel = new JLabel("USER LOGIN");
		lblNewLabel.setBounds(153, 11, 167, 28);
		lblNewLabel.setForeground(Color.PINK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn2 = new JButton("Reset");
		btn2.setBounds(165, 190, 98, 34);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text1.setText(null);
				pass.setText(null);
				}
		});
		btn2.setBackground(Color.GRAY);
		btn2.setForeground(Color.PINK);
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("Exit");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btn3.setBounds(296, 190, 98, 34);
		btn3.setBackground(Color.GRAY);
		btn3.setForeground(Color.PINK);
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.getContentPane().add(btn3);
		
		pass = new JPasswordField();
		pass.setBounds(153, 115, 241, 25);
		pass.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.getContentPane().add(pass);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\project\\Java\\images\\4.jpeg"));
		frame.getContentPane().add(lblNewLabel_1);
	}
}
