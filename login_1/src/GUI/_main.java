package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Toolkit;

public class _main {

	private JFrame frame;
	private JTextField txtmsg;

	double first;
	double second;
	double result;
	String value;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_main window = new _main();
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
	public _main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\project\\Java\\images\\5.jpg"));
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 303, 445);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtmsg = new JTextField();
		txtmsg.setForeground(Color.WHITE);
		txtmsg.setBounds(10, 46, 267, 39);
		txtmsg.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtmsg.setBackground(Color.BLACK);
		txtmsg.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(txtmsg);
		txtmsg.setColumns(10);
		
		JButton btn10 = new JButton("\uF0e7");
		btn10.setBounds(10, 96, 50, 50);
		btn10.setForeground(UIManager.getColor("Button.foreground"));
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace =null;
				if(txtmsg.getText().length()>0)
				{
                  StringBuilder str =new StringBuilder(txtmsg.getText());
                  str.deleteCharAt(txtmsg.getText().length()-1);
                  backSpace = str.toString();
                  txtmsg.setText(backSpace);
			}
			}
		});
		btn10.setFont(new Font("Wingdings", Font.BOLD, 15));
		btn10.setBackground(Color.RED);
		frame.getContentPane().add(btn10);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(10, 157, 50, 50);
		btn7.setForeground(Color.WHITE);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = txtmsg.getText()+ 7;
				txtmsg.setText(value);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn7.setBackground(Color.BLACK);
		frame.getContentPane().add(btn7);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(10, 340, 50, 50);
		btn0.setForeground(Color.WHITE);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = txtmsg.getText()+ 0;
				txtmsg.setText(value);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn0.setBackground(Color.BLACK);
		frame.getContentPane().add(btn0);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(10, 218, 50, 50);
		btn4.setForeground(Color.WHITE);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = txtmsg.getText()+ 4;
				txtmsg.setText(value);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn4.setBackground(Color.BLACK);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(10, 279, 50, 50);
		btn1.setForeground(Color.WHITE);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = txtmsg.getText()+ 1;
				txtmsg.setText(value);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn1.setBackground(Color.BLACK);
		frame.getContentPane().add(btn1);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(81, 96, 50, 50);
		btnC.setForeground(Color.BLACK);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtmsg.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnC.setBackground(Color.RED);
		frame.getContentPane().add(btnC);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(81, 157, 50, 50);
		btn8.setForeground(Color.WHITE);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = txtmsg.getText()+ 8;
				txtmsg.setText(value);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn8.setBackground(Color.BLACK);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(81, 218, 50, 50);
		btn5.setForeground(Color.WHITE);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = txtmsg.getText()+ 5;
				txtmsg.setText(value);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn5.setBackground(Color.BLACK);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(81, 279, 50, 50);
		btn2.setForeground(Color.WHITE);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = txtmsg.getText()+ 2;
				txtmsg.setText(value);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2.setBackground(Color.BLACK);
		frame.getContentPane().add(btn2);
		
		JButton btndot = new JButton(".");
		btndot.setBounds(81, 340, 50, 50);
		btndot.setForeground(Color.WHITE);
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = txtmsg.getText()+ ".";
				txtmsg.setText(value);
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndot.setBackground(Color.BLACK);
		frame.getContentPane().add(btndot);
		
		JButton btn00 = new JButton("00");
		btn00.setBounds(152, 96, 50, 50);
		btn00.setForeground(Color.WHITE);
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = txtmsg.getText()+ "00";
				txtmsg.setText(value);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn00.setBackground(Color.BLACK);
		frame.getContentPane().add(btn00);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(152, 157, 50, 50);
		btn9.setForeground(Color.WHITE);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = txtmsg.getText()+ 9;
				txtmsg.setText(value);
			}
			
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn9.setBackground(Color.BLACK);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(152, 218, 50, 50);
		btn6.setForeground(Color.WHITE);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = txtmsg.getText()+ 6;
				txtmsg.setText(value);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn6.setBackground(Color.BLACK);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(152, 279, 50, 50);
		btn3.setForeground(Color.WHITE);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = txtmsg.getText()+ 3;
				txtmsg.setText(value);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn3.setBackground(Color.BLACK);
		frame.getContentPane().add(btn3);
		
		JButton btnplismin = new JButton("+/-");
		btnplismin.setBounds(152, 341, 50, 50);
		btnplismin.setForeground(Color.WHITE);
		btnplismin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					first =  Double.parseDouble(txtmsg.getText());
					double pn =Double.parseDouble(String.valueOf(txtmsg.getText()));
					  pn = pn * (-1);
					  txtmsg.setText(String.valueOf(pn));
	
					}
					catch(Exception ex) {
						
						
					}
				  
			}
		});
		btnplismin.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnplismin.setBackground(Color.BLACK);
		frame.getContentPane().add(btnplismin);
		
		JButton btndiv = new JButton("/");
		btndiv.setBounds(227, 96, 50, 50);
		btndiv.setForeground(UIManager.getColor("Button.foreground"));
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					first =  Double.parseDouble(txtmsg.getText());
					value = txtmsg.getText()+ " / ";
					txtmsg.setText(value);
					}
					catch(Exception ex) {
						txtmsg.setText("Enter valid input");
					}
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 16));
		btndiv.setBackground(Color.RED);
		frame.getContentPane().add(btndiv);
		
		JButton btnmul = new JButton("*");
		btnmul.setBounds(227, 157, 50, 50);
		btnmul.setForeground(UIManager.getColor("Button.foreground"));
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					first =  Double.parseDouble(txtmsg.getText());
					value = txtmsg.getText()+ " * ";
					txtmsg.setText(value);
					}
					catch(Exception ex) {
						txtmsg.setText("Enter valid input");
					}
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnmul.setBackground(Color.RED);
		frame.getContentPane().add(btnmul);
		
		JButton btnsub = new JButton("-");
		btnsub.setBounds(227, 218, 50, 50);
		btnsub.setForeground(UIManager.getColor("Button.foreground"));
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					first =  Double.parseDouble(txtmsg.getText());
					value = txtmsg.getText()+ " - ";
					txtmsg.setText(value);
					}
					catch(Exception ex) {
						txtmsg.setText("Enter valid input");
					}
			}
		});
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnsub.setBackground(Color.RED);
		frame.getContentPane().add(btnsub);
		
		JButton btnadd = new JButton("+");
		btnadd.setBounds(227, 279, 50, 50);
		btnadd.setForeground(UIManager.getColor("Button.foreground"));
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
				first =  Double.parseDouble(txtmsg.getText());
				value = txtmsg.getText()+ " + ";
				txtmsg.setText(value);
				}
				catch(Exception ex) {
					txtmsg.setText("Enter valid input");
					
				}
				
				
			}
		});
		btnadd.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnadd.setBackground(Color.RED);
		frame.getContentPane().add(btnadd);
		
		JButton btneql = new JButton("=");
		btneql.setBounds(227, 340, 50, 50);
		btneql.setForeground(UIManager.getColor("Button.foreground"));
		btneql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					
					try {
				
				
				 int x=txtmsg.getText().length();
				 first = Double.parseDouble(value.substring(0,value.indexOf(" ")));
				 second = Double.parseDouble(value.substring(value.indexOf(" ")+2, x));
				 String operator = value.substring(value.indexOf(" ")+1,value.indexOf(" ")+2);
			
					
				
				 if( operator.equals("+"))
				 {
					 result= first + second;
				 }
				 
				 if( operator.equals("-"))
				 {
					 result= first - second;
				 }
				 
				 if( operator.equals("*"))
				 {
					 result= first * second;
				 }
				 
				 if( operator.equals("/"))
				 {
					 result= first / second;
					 
					
				 }
						
						
				 txtmsg.setText(String.valueOf(result));
				
			}
			
			catch(Exception e2) {
			}
			}
			
			
		});
		btneql.setFont(new Font("Tahoma", Font.BOLD, 16));
		btneql.setBackground(Color.RED);
		frame.getContentPane().add(btneql);
		
		JLabel lblNewLabel = new JLabel("CALCULATOR");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(85, 11, 117, 24);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn2_1 = new JButton("2");
		btn2_1.setForeground(Color.WHITE);
		btn2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2_1.setBackground(Color.BLACK);
		btn2_1.setBounds(10, 279, 50, 50);
		frame.getContentPane().add(btn2_1);
		
		JButton btn2_2 = new JButton("2");
		btn2_2.setForeground(Color.WHITE);
		btn2_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2_2.setBackground(Color.BLACK);
		btn2_2.setBounds(10, 218, 50, 50);
		frame.getContentPane().add(btn2_2);
	}
}
