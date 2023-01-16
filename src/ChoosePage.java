import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChoosePage extends JFrame implements ActionListener{

	private JPanel contentPane;
	JButton foodButton = new JButton("Order food");
	JButton calculatorButton = new JButton("Calculator");

	public ChoosePage() {
		setTitle("Grab a bite");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBounds(10, 10, 480, 543);
		contentPane.add(panel);
		panel.setLayout(null);
		
		foodButton.setFont(new Font("Arial Black", Font.BOLD, 40));
		foodButton.setBackground(new Color(135, 206, 250));
		foodButton.setBounds(10, 10, 460, 523);
		panel.add(foodButton);
		foodButton.addActionListener(this);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(500, 10, 436, 543);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		calculatorButton.setFont(new Font("Arial Black", Font.BOLD, 40));
		calculatorButton.setBackground(new Color(135, 206, 250));
		calculatorButton.setBounds(10, 10, 416, 523);
		panel_1.add(calculatorButton);
		calculatorButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == calculatorButton) {
			CalculatorPage frame = new CalculatorPage();
			frame.setVisible(true);
			dispose();
		}
		
		if(e.getSource() == foodButton) {
			OrderPage frame = new OrderPage();
			frame.setVisible(true);
			dispose();
		}
		
	}
}
