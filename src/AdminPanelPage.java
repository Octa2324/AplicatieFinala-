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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

public class AdminPanelPage extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	JButton showButton = new JButton("");
	JButton deleteButton = new JButton("Delete");
	JButton backButton = new JButton("Back");
	private JTextField textField_1;
	JButton add1Button = new JButton("+1");
	JButton add2Button = new JButton("+2");
	JButton add5Button = new JButton("+5");
	JButton add10Button = new JButton("+10");


	public AdminPanelPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		backButton.setBackground(new Color(176, 224, 230));
		backButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		backButton.setBounds(834, 514, 102, 39);
		contentPane.add(backButton);
		backButton.addActionListener(this);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(176, 224, 230));
		panel.setBounds(46, 10, 300, 543);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Client Management");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel.setBounds(10, 40, 280, 50);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Show clients");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(27, 155, 113, 33);
		panel.add(lblNewLabel_2);
		
		showButton.setBackground(new Color(135, 206, 250));
		showButton.setBounds(150, 155, 113, 33);
		panel.add(showButton);
		showButton.addActionListener(this);
		
		JLabel lblNewLabel_3 = new JLabel("Client username");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 321, 113, 33);
		panel.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textField.setBounds(123, 322, 167, 33);
		panel.add(textField);
		textField.setColumns(10);
		
		deleteButton.setBackground(new Color(135, 206, 250));
		deleteButton.setFont(new Font("Arial Black", Font.PLAIN, 16));
		deleteButton.setBounds(84, 383, 113, 33);
		panel.add(deleteButton);
		
		JLabel lblNewLabel_6 = new JLabel("Delete clients");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6.setBounds(70, 251, 140, 44);
		panel.add(lblNewLabel_6);
		deleteButton.addActionListener(this);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(487, 10, 300, 543);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Food Management");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel_1.setBounds(21, 42, 269, 50);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("Add food");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_4.setBounds(122, 154, 91, 29);
		panel_1.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(118, 193, 150, 29);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Food name");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5.setBounds(21, 193, 80, 27);
		panel_1.add(lblNewLabel_5);
		
		
		add1Button.setBackground(new Color(135, 206, 250));
		add1Button.setFont(new Font("Arial Black", Font.BOLD, 14));
		add1Button.setBounds(31, 290, 85, 31);
		panel_1.add(add1Button);
		
		add2Button.setFont(new Font("Arial Black", Font.BOLD, 14));
		add2Button.setBackground(new Color(135, 206, 250));
		add2Button.setBounds(183, 290, 85, 31);
		panel_1.add(add2Button);
		
		add5Button.setFont(new Font("Arial Black", Font.BOLD, 14));
		add5Button.setBackground(new Color(135, 206, 250));
		add5Button.setBounds(31, 331, 85, 31);
		panel_1.add(add5Button);
		
		add10Button.setFont(new Font("Arial Black", Font.BOLD, 14));
		add10Button.setBackground(new Color(135, 206, 250));
		add10Button.setBounds(183, 331, 85, 31);
		panel_1.add(add10Button);
		
		JLabel lblNewLabel_7 = new JLabel("How much?");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_7.setBounds(21, 248, 85, 32);
		panel_1.add(lblNewLabel_7);
		add1Button.addActionListener(this);
		add2Button.addActionListener(this);
		add5Button.addActionListener(this);
		add10Button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == backButton) {
			LoginPage frame = new LoginPage();
			frame.setVisible(true);
			dispose();
		}
		
		if(e.getSource() == showButton) {
			try {
				int nr=0;
				String mesaj = "\n Clients \n";
				ArrayList<Clienti> l = new ArrayList<Clienti>();
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
	            Statement stmt = con.createStatement();
	            ResultSet rs = stmt.executeQuery("Select * from users");
	            while(rs.next()) {
	            	Clienti a = new Clienti();
	            	a.setUsername(rs.getString("username"));
	            	a.setParola(rs.getString("password"));
	            	a.setNume(rs.getString("nume"));
	            	a.setAdresa(rs.getString("adresa"));
	            	a.setEmail(rs.getString("email"));
	            	a.setNumar(rs.getInt("numar"));

	            	l.add(a);

	            	nr=nr+1;
	
	            }
	            if(nr!=0) {
	            	for(Clienti i : l) {
	    				mesaj += i.toString() + '\n';
	    			}
	    			JOptionPane.showMessageDialog(this, mesaj);
	            }
	            else {
	            	JOptionPane.showMessageDialog(this,"No clients found");}
	            
	        } catch(Exception ea) {
	            System.out.println(ea);
	        }
		}
		
		if(e.getSource() == deleteButton) {
			String username = textField.getText();
            
            try {
            	
           	 String query = "delete from users where username = '"+username+"'";
           	 Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("Select * from users where username='"+username+"'");
                if(rs.next()) {
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(this,"Operation successful");
                textField.setText("");}
                else {
                	JOptionPane.showMessageDialog(this,"Client not found!");
                	textField.setText("");
                }
            }
            catch(Exception ea)
            {
                System.out.println(ea);
            }
		}
		
		if(e.getSource() == add1Button) {
			try {
				String nume = textField_1.getText();
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
	            Statement stmt = con.createStatement();
	            ResultSet rs = stmt.executeQuery("Select * from mancare where nume='"+nume+"'");
                if(rs.next()) {
                JOptionPane.showMessageDialog(this,"Operation successful");
                String sql ="Update mancare set bucati = bucati + 1 where nume ='"+nume+"' ";
	            stmt.executeUpdate(sql);
                textField_1.setText("");}
                else {
                	JOptionPane.showMessageDialog(this,"Food not found!");
                	textField_1.setText("");
                }

	        } catch(Exception ea) {
	            System.out.println(ea);
	        }
		}
		if(e.getSource() == add2Button) {
			try {
				String nume = textField_1.getText();
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
	            Statement stmt = con.createStatement();
	            ResultSet rs = stmt.executeQuery("Select * from mancare where nume='"+nume+"'");
                if(rs.next()) {
                JOptionPane.showMessageDialog(this,"Operation successful");
                String sql ="Update mancare set bucati = bucati + 2 where nume ='"+nume+"' ";
	            stmt.executeUpdate(sql);
                textField_1.setText("");}
                else {
                	JOptionPane.showMessageDialog(this,"Food not found!");
                	textField_1.setText("");
                }

	        } catch(Exception ea) {
	            System.out.println(ea);
	        }
		}
		if(e.getSource() == add5Button) {
			try {
				String nume = textField_1.getText();
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
	            Statement stmt = con.createStatement();
	            ResultSet rs = stmt.executeQuery("Select * from mancare where nume='"+nume+"'");
                if(rs.next()) {
                JOptionPane.showMessageDialog(this,"Operation successful");
                String sql ="Update mancare set bucati = bucati + 5 where nume ='"+nume+"' ";
	            stmt.executeUpdate(sql);
                textField_1.setText("");}
                else {
                	JOptionPane.showMessageDialog(this,"Food not found!");
                	textField_1.setText("");
                }

	        } catch(Exception ea) {
	            System.out.println(ea);
	        }
		}
		if(e.getSource() == add10Button) {
			try {
				String nume = textField_1.getText();
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
	            Statement stmt = con.createStatement();
	            ResultSet rs = stmt.executeQuery("Select * from mancare where nume='"+nume+"'");
                if(rs.next()) {
                JOptionPane.showMessageDialog(this,"Operation successful");
                String sql ="Update mancare set bucati = bucati + 10 where nume ='"+nume+"' ";
	            stmt.executeUpdate(sql);
                textField_1.setText("");}
                else {
                	JOptionPane.showMessageDialog(this,"Food not found!");
                	textField_1.setText("");
                }

	        } catch(Exception ea) {
	            System.out.println(ea);
	        }
		}
		
		
	}
}
