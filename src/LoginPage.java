import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class LoginPage extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtType;
	private JPasswordField passwordField;
	JCheckBox chckbxNewCheckBox = new JCheckBox("Show password");
	JButton loginButton = new JButton("Login");
	JButton signupButton = new JButton("Sign up");
	JButton adminButton = new JButton("Admin");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setResizable(false);
		setTitle("Grab a bite");
		setForeground(new Color(204, 255, 255));
		setBackground(new Color(204, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 600);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setForeground(new Color(204, 255, 255));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(135, 206, 235));
		panel.setBounds(320, 10, 282, 543);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel.setBounds(90, 24, 95, 36);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(25, 148, 105, 24);
		panel.add(lblNewLabel_1);
		
		txtType = new JTextField();
		txtType.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtType.setHorizontalAlignment(SwingConstants.LEFT);
		txtType.setForeground(new Color(0, 0, 0));
		txtType.setToolTipText("Type your username..");
		txtType.setBackground(new Color(135, 206, 250));
		txtType.setBounds(25, 182, 210, 24);
		panel.add(txtType);
		txtType.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(25, 234, 105, 24);
		panel.add(lblNewLabel_2);
		
		chckbxNewCheckBox.setBackground(new Color(135, 206, 250));
		chckbxNewCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
		chckbxNewCheckBox.setBounds(142, 298, 134, 21);
		panel.add(chckbxNewCheckBox);
		chckbxNewCheckBox.addActionListener(this);
		
		loginButton.setForeground(new Color(0, 0, 0));
		loginButton.setBackground(new Color(135, 206, 250));
		loginButton.setFont(new Font("Arial Black", Font.BOLD, 16));
		loginButton.setBounds(90, 348, 95, 36);
		panel.add(loginButton);
		loginButton.addActionListener(this);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(135, 206, 250));
		passwordField.setBounds(25, 268, 210, 24);
		panel.add(passwordField);
		
		signupButton.setBackground(new Color(135, 206, 250));
		signupButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		signupButton.setBounds(90, 490, 95, 36);
		panel.add(signupButton);
		signupButton.addActionListener(this);
		
		adminButton.setBackground(new Color(176, 224, 230));
		adminButton.setFont(new Font("Arial Black", Font.BOLD, 16));
		adminButton.setBounds(820, 516, 116, 37);
		contentPane.add(adminButton);
		adminButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 if (e.getSource() == chckbxNewCheckBox) {
	          if (chckbxNewCheckBox.isSelected()) {
	              passwordField.setEchoChar((char) 0);
	          } else {
	              passwordField.setEchoChar('*');
	          }
	      }
		 
		 if(e.getSource() == loginButton) {
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            String username = txtType.getText();
		            String password = passwordField.getText();
		            ResultSet rs = stmt.executeQuery("Select * from users where username='"+username+"' and password='"+password+"'");
		            if(rs.next()) {
		                JOptionPane.showMessageDialog(null, "Login Successful");
		                ChoosePage frame = new ChoosePage();
						frame.setVisible(true);
		                txtType.setText("");
		                passwordField.setText("");
		                dispose();
		            } else {
		                JOptionPane.showMessageDialog(null, "Incorrect username or password");
		                txtType.setText("");
		                passwordField.setText("");
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		 }
		 
		 if(e.getSource() == signupButton) {
			 RegisterPage frame = new RegisterPage();
			 frame.setVisible(true);
			 dispose();
			 
		 }
		 
		 if(e.getSource() == adminButton) {
			 AdminLoginPage frame = new AdminLoginPage();
			 frame.setVisible(true);
			 dispose();
		 }
	}
}
