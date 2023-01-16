import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;

public class PayPage extends JFrame implements ActionListener{

	private JPanel contentPane;
	JCheckBox cashCheckBox = new JCheckBox("");
	JCheckBox cardCheckBox = new JCheckBox("");
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel textLabel = new JLabel("0");
	JButton placeButton = new JButton("Place order");
	

	public PayPage() {
		setTitle("Grab a bite");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(176, 224, 230));
		panel.setBounds(338, 29, 298, 395);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select payment method");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 278, 37);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cash");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 70, 66, 37);
		panel.add(lblNewLabel_1);
		
		cashCheckBox.setBackground(new Color(135, 206, 250));
		cashCheckBox.setBounds(82, 70, 21, 37);
		cashCheckBox.addActionListener(this);
		panel.add(cashCheckBox);
		
		JLabel lblNewLabel_2 = new JLabel("Card");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 117, 66, 37);
		panel.add(lblNewLabel_2);
		
		cardCheckBox.setBackground(new Color(135, 206, 250));
		cardCheckBox.setBounds(82, 117, 21, 37);
		cardCheckBox.addActionListener(this);
		panel.add(cardCheckBox);
		
		JLabel lblNewLabel_3 = new JLabel("Card number:");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 164, 110, 29);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Expire date:");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 203, 110, 29);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("/");
		lblNewLabel_5.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(197, 202, 29, 29);
		panel.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(226, 205, 62, 29);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("CVV:");
		lblNewLabel_6.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_6.setBounds(10, 242, 93, 29);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Name on card: ");
		lblNewLabel_7.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_7.setBounds(10, 281, 110, 29);
		panel.add(lblNewLabel_7);
		
		textField_3 = new JTextField();
		textField_3.setBounds(130, 282, 158, 29);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(130, 244, 66, 29);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(130, 166, 158, 29);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(130, 205, 66, 29);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Total price to pay: ");
		lblNewLabel_9.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_9.setBounds(10, 337, 173, 37);
		panel.add(lblNewLabel_9);
		textLabel.setBounds(181, 340, 66, 31);
		panel.add(textLabel);
		textLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		textLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		
		placeButton.setBackground(new Color(176, 224, 230));
		placeButton.setFont(new Font("Arial Black", Font.BOLD, 16));
		placeButton.setBounds(424, 434, 146, 44);
		placeButton.addActionListener(this);
		contentPane.add(placeButton);

	}
	public void my_update(String str) {
		
			textLabel.setText(str);
		}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == cashCheckBox) {
			if(cashCheckBox.isSelected()) {
				cardCheckBox.setEnabled(false);
				textField.setEnabled(false);
				textField_1.setEnabled(false);
				textField_2.setEnabled(false);
				textField_3.setEnabled(false);
				textField_4.setEnabled(false);
			}
			else {
				cardCheckBox.setEnabled(true);
				textField.setEnabled(true);
				textField_1.setEnabled(true);
				textField_2.setEnabled(true);
				textField_3.setEnabled(true);
				textField_4.setEnabled(true);
			}
		}
		
		if(e.getSource() == cardCheckBox) {
			if (cardCheckBox.isSelected()) {
	           cashCheckBox.setEnabled(false);
		}
			else {
				cashCheckBox.setEnabled(true);
			}
		
	}

		
		if(e.getSource() == placeButton) {
			FinalPage pisi = new FinalPage();
			pisi.setVisible(true);
			dispose();
		}
	}
}
