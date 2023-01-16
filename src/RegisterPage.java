import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.MatteBorder;

public class RegisterPage extends JFrame implements ActionListener{

	private JPanel contentPane;
	JButton backButton = new JButton("Back");
	JFrame frame = new JFrame();
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField UtextField;
	private JLabel lblNewLabel_2;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_3;
	private JTextField NtextField;
	private JLabel lblNewLabel_4;
	private JTextField AtextField;
	private JLabel lblNewLabel_5;
	private JTextField EtextField;
	private JLabel lblNewLabel_6;
	private JTextField PtextField;
	private JButton signupButton;

	
	public RegisterPage() {
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
		panel.setBackground(new Color(173, 216, 230));
		panel.setBounds(270, 10, 399, 543);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("Sign Up");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel.setBounds(125, 30, 149, 44);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(28, 96, 107, 24);
		panel.add(lblNewLabel_1);
		
		UtextField = new JTextField();
		UtextField.setBounds(28, 130, 246, 24);
		panel.add(UtextField);
		UtextField.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(28, 164, 107, 24);
		panel.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(28, 198, 246, 24);
		panel.add(passwordField);
		
		lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_3.setBounds(28, 232, 111, 24);
		panel.add(lblNewLabel_3);
		
		NtextField = new JTextField();
		NtextField.setBounds(28, 266, 246, 24);
		panel.add(NtextField);
		NtextField.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Address");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_4.setBounds(28, 300, 107, 24);
		panel.add(lblNewLabel_4);
		
		AtextField = new JTextField();
		AtextField.setBounds(28, 334, 246, 24);
		panel.add(AtextField);
		AtextField.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Email");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_5.setBounds(28, 368, 107, 24);
		panel.add(lblNewLabel_5);
		
		EtextField = new JTextField();
		EtextField.setBounds(28, 402, 246, 24);
		panel.add(EtextField);
		EtextField.setColumns(10);
		
		lblNewLabel_6 = new JLabel("Phone");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6.setBounds(28, 436, 107, 24);
		panel.add(lblNewLabel_6);
		
		PtextField = new JTextField();
		PtextField.setBounds(28, 470, 246, 24);
		panel.add(PtextField);
		PtextField.setColumns(10);
		
		signupButton = new JButton("Sign Up");
		signupButton.setBackground(new Color(135, 206, 250));
		signupButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		signupButton.setBounds(288, 500, 101, 33);
		panel.add(signupButton);
		signupButton.addActionListener(this);
		
		backButton.setBackground(new Color(176, 224, 230));
		backButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		backButton.setBounds(831, 516, 105, 37);
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
		
		if(e.getSource() == signupButton) {
			 String username = UtextField.getText();
             String password = passwordField.getText();
             String name = NtextField.getText();
             String address = AtextField.getText();
             String email = EtextField.getText();
             String number = PtextField.getText();
             
             try {
            	 String query = "INSERT INTO users (`username`, `password`,`nume`, `adresa`, `email`, `numar`) VALUES ('"+username+"', '"+password+"', '"+name+"','"+address+"','"+email+"','"+number+"')";
            	 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
                 Statement stmt = con.createStatement();
                 stmt.executeUpdate(query);
                 JOptionPane.showMessageDialog(this,"Registration successful");
                 UtextField.setText("");
                 passwordField.setText("");
                 NtextField.setText("");
                 AtextField.setText("");
                 EtextField.setText("");
                 PtextField.setText("");
             }
             catch(Exception ea)
             {
                 System.out.println(ea);
             }
             
             LoginPage mat = new LoginPage();
             mat.setVisible(true);
             dispose();
		}
		
	}

}
