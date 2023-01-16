import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.border.MatteBorder;

public class AdminLoginPage extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JPasswordField passwordField;
	JButton loginButton = new JButton("Login");
	JButton backButton = new JButton("Back");

	
	public AdminLoginPage() {
		setTitle("Grab a bite");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(176, 224, 230));
		panel.setBounds(312, 126, 301, 278);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin login");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel.setBounds(47, 24, 210, 46);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Code");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(47, 106, 71, 24);
		panel.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(47, 140, 173, 24);
		panel.add(passwordField);
		
		loginButton.setBackground(new Color(135, 206, 250));
		loginButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		loginButton.setBounds(112, 202, 108, 34);
		panel.add(loginButton);
		loginButton.addActionListener(this);
		
		backButton.setBackground(new Color(173, 216, 230));
		backButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		backButton.setBounds(830, 514, 106, 39);
		contentPane.add(backButton);
		backButton.addActionListener(this);
		
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == backButton) {
			LoginPage frame = new LoginPage();
			frame.setVisible(true);
			dispose();
		}
		
		if(e.getSource() == loginButton) {
			try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
	            Statement stmt = con.createStatement();
	            String code = passwordField.getText();
	            
	            ResultSet rs = stmt.executeQuery("Select * from admin where cod='"+code+"'");
	            if(rs.next()) {
	                JOptionPane.showMessageDialog(null, "Login Successful");
	                passwordField.setText("");
	                AdminPanelPage frame = new AdminPanelPage();
					frame.setVisible(true);
					dispose();
	            } else {
	                JOptionPane.showMessageDialog(null, "Incorrect code");
	                passwordField.setText("");
	            }
	        } catch(Exception ea) {
	            System.out.println(ea);
	        }
		}
		
	}
}
