import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class FinalPage extends JFrame implements ActionListener{

	private JPanel contentPane;
	JButton backButton = new JButton("Back to menu");
	JLabel numberLabel = new JLabel("0");

	public FinalPage() {
		setTitle("Grab a bite");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thank you for your order!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 0, 926, 120);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Order number: ");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(187, 119, 195, 42);
		contentPane.add(lblNewLabel_1);
		
		backButton.setBackground(new Color(176, 224, 230));
		backButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		backButton.setBounds(781, 518, 155, 35);
		contentPane.add(backButton);
		
		JLabel lblNewLabel_2 = new JLabel("#");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(381, 119, 61, 42);
		contentPane.add(lblNewLabel_2);
		
		numberLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		numberLabel.setHorizontalAlignment(SwingConstants.CENTER);
		numberLabel.setBounds(392, 119, 165, 42);
		contentPane.add(numberLabel);
		backButton.addActionListener(this);
		
		int key = (int)(Math.random() * 100);
        String x = Integer.toString(key);
		
		numberLabel.setText(x);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\varfil.png"));
		lblNewLabel_3.setBounds(327, 171, 242, 280);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Your order will arive soon!");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_4.setBounds(337, 434, 232, 28);
		contentPane.add(lblNewLabel_4);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == backButton) {
			LoginPage frame = new LoginPage();
			frame.setVisible(true);
			dispose();
		}
		
	}
}
