import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
import java.util.List;

import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.print.DocFlavor.STRING;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

public class CalculatorPage extends JFrame implements ActionListener{

	private JPanel contentPane;
	JButton backButton = new JButton("Back");
	private JTextField textField;
	JButton Button1 = new JButton("1");
	JButton Button2 = new JButton("2");
	JButton Button3 = new JButton("3");
	JButton Button4 = new JButton("4");
	JButton Button5 = new JButton("5");
	JButton Button6 = new JButton("6");
	JButton Button7 = new JButton("7");
	JButton Button8 = new JButton("8");
	JButton Button9 = new JButton("9");
	JButton Button0 = new JButton("0");
	JButton egalButton = new JButton("=");
	JButton clearButton = new JButton("Clear");
	private final JCheckBox chickenCheckBox = new JCheckBox("Chicken");
	private final JLabel lblNewLabel = new JLabel("New label");
	private final JCheckBox steakCheckBox = new JCheckBox("Steak");
	private final JLabel lblNewLabel_4 = new JLabel("New label");
	private final JCheckBox falafelCheckBox = new JCheckBox("Falafel");
	private final JLabel lblNewLabel_5 = new JLabel("New label");
	private final JCheckBox porkCheckBox = new JCheckBox("Pork");
	private final JLabel lblNewLabel_6 = new JLabel("New label");
	private final JCheckBox lambCheckBox = new JCheckBox("Lamb");
	private final JLabel lblNewLabel_7 = new JLabel("New label");
	private final JCheckBox stewCheckBox = new JCheckBox("Stew");
	private final JLabel lblNewLabel_8 = new JLabel("New label");
	private final JCheckBox potatoesCheckBox = new JCheckBox("Potatoes");
	private final JLabel lblNewLabel_9 = new JLabel("New label");
	private final JCheckBox vegetablesCheckBox = new JCheckBox("Vegetables");
	private final JLabel lblNewLabel_10 = new JLabel("New label");
	private final JCheckBox friesCheckBox = new JCheckBox("Fries");
	private final JLabel lblNewLabel_11 = new JLabel("New label");
	private final JCheckBox soupCheckBox = new JCheckBox("Soup");
	private final JLabel lblNewLabel_12 = new JLabel("New label");
	private final JCheckBox kebabCheckBox = new JCheckBox("Kebab");
	private final JLabel lblNewLabel_13 = new JLabel("New label");
	private final JCheckBox shawarmaCheckBox = new JCheckBox("Shawarma");
	private final JLabel lblNewLabel_14 = new JLabel("New label");
	private final JCheckBox wingsCheckBox = new JCheckBox("Wings");
	private final JLabel lblNewLabel_15 = new JLabel("New label");
	private final JCheckBox hummusCheckBox = new JCheckBox("Hummus");
	private final JLabel lblNewLabel_16 = new JLabel("New label");
	private final JCheckBox waterCheckBox = new JCheckBox("Water");
	private final JLabel lblNewLabel_17 = new JLabel("New label");
	private final JCheckBox sodaCheckBox = new JCheckBox("Soda");
	private final JLabel lblNewLabel_18 = new JLabel("New label");
	private final JCheckBox jucieCheckBox = new JCheckBox("Juice");
	private final JLabel lblNewLabel_19 = new JLabel("New label");
	private final JCheckBox beerCheckBox = new JCheckBox("Beer");
	private final JLabel lblNewLabel_20 = new JLabel("New label");
	private final JCheckBox wineCheckBox = new JCheckBox("Wine");
	private final JLabel lblNewLabel_21 = new JLabel("New label");
	private final JCheckBox cocktailCheckBox = new JCheckBox("Cocktail");
	private final JLabel lblNewLabel_22 = new JLabel("New label");
	private final JCheckBox smoothieCheckBox = new JCheckBox("Smoothie");
	private final JLabel lblNewLabel_23 = new JLabel("New label");
	private final JCheckBox cookieCheckBox = new JCheckBox("Cookie");
	private final JLabel lblNewLabel_24 = new JLabel("New label");
	private final JCheckBox cakeCheckBox = new JCheckBox("Cake");
	private final JLabel lblNewLabel_25 = new JLabel("New label");
	private final JCheckBox icecreamCheckBox = new JCheckBox("Ice Cream");
	private final JLabel lblNewLabel_26 = new JLabel("New label");
	private final JCheckBox sorbetCheckBox = new JCheckBox("Sorbet");
	private final JLabel lblNewLabel_27 = new JLabel("New label");
	private final JCheckBox brownieCheckBox = new JCheckBox("Brownie");
	private final JLabel lblNewLabel_28 = new JLabel("New label");
	private final JCheckBox cupcakeCheckBox = new JCheckBox("Cupcake");
	JCheckBox saladCheckBox = new JCheckBox("Salad");
	JCheckBox salmonCheckBox = new JCheckBox("Salmon");
	JScrollPane scrollPane_1 = new JScrollPane();
	DefaultListModel<String> modelDreapta = new DefaultListModel<>();
    JList<String> listDreapta = new JList<>();
    JLabel caloriiLabel = new JLabel("0");
    int sumaCalorii = 0;
    int sumaProteine = 0;
    int sumaCarbo = 0;
    int sumaGrasimi = 0;
    JButton golireButton = new JButton("Clear");
    
	
	
	List<JCheckBox> l = new ArrayList();
	private final JScrollPane scrollPane = new JScrollPane();
	private final JLabel lblNewLabel_29 = new JLabel("Calories");
	private final JLabel lblNewLabel_30 = new JLabel("Protein");
	private final JLabel lblNewLabel_31 = new JLabel("Carbs");
	private final JLabel lblNewLabel_32 = new JLabel("Fat");
	private final JLabel proteineLabel = new JLabel("0");
	private final JLabel carbsLabel = new JLabel("0");
	private final JLabel fatLabel = new JLabel("0");

	
	public CalculatorPage() {
		
		l.add(chickenCheckBox);
		l.add(steakCheckBox);
		l.add(falafelCheckBox);
		l.add(porkCheckBox);
		l.add(lambCheckBox);
		l.add(salmonCheckBox);
		l.add(saladCheckBox);
		l.add(stewCheckBox);
		l.add(potatoesCheckBox);
		l.add(vegetablesCheckBox);
		l.add(friesCheckBox);
		l.add(soupCheckBox);
		l.add(kebabCheckBox);
		l.add(shawarmaCheckBox);
		l.add(wingsCheckBox);
		l.add(hummusCheckBox);
		l.add(waterCheckBox);
		l.add(sodaCheckBox);
		l.add(jucieCheckBox);
		l.add(beerCheckBox);
		l.add(wineCheckBox);
		l.add(cocktailCheckBox);
		l.add(smoothieCheckBox);
		l.add(cookieCheckBox);
		l.add(cakeCheckBox);
		l.add(icecreamCheckBox);
		l.add(sorbetCheckBox);
		l.add(brownieCheckBox);
		l.add(cupcakeCheckBox);
		
		setTitle("Grab a bite");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane_1.setBounds(427, 274, 376, 130);
		contentPane.add(scrollPane_1);
		backButton.setBounds(830, 515, 106, 38);
		
		backButton.setBackground(new Color(176, 224, 230));
		backButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		contentPane.add(backButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(38, 274, 363, 279);
		panel.setForeground(new Color(0, 0, 0));
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(176, 224, 230));
		contentPane.add(panel);
		panel.setLayout(null);
		
		Button1.setBackground(new Color(135, 206, 250));
		Button1.setFont(new Font("Arial Black", Font.BOLD, 14));
		Button1.setBounds(10, 234, 50, 35);
		panel.add(Button1);
		Button1.addActionListener(this);
		
		Button2.setBackground(new Color(135, 206, 250));
		Button2.setFont(new Font("Arial Black", Font.BOLD, 14));
		Button2.setBounds(163, 234, 50, 35);
		panel.add(Button2);
		Button2.addActionListener(this);
		
		Button3.setBackground(new Color(135, 206, 250));
		Button3.setFont(new Font("Arial Black", Font.BOLD, 14));
		Button3.setBounds(303, 234, 50, 35);
		panel.add(Button3);
		Button3.addActionListener(this);
		
		Button4.setBackground(new Color(135, 206, 250));
		Button4.setFont(new Font("Arial Black", Font.BOLD, 14));
		Button4.setBounds(10, 187, 50, 35);
		panel.add(Button4);
		Button4.addActionListener(this);
		
		Button5.setBackground(new Color(135, 206, 250));
		Button5.setFont(new Font("Arial Black", Font.BOLD, 14));
		Button5.setBounds(163, 189, 50, 35);
		panel.add(Button5);
		Button5.addActionListener(this);
		
		Button6.setBackground(new Color(135, 206, 250));
		Button6.setFont(new Font("Arial Black", Font.BOLD, 14));
		Button6.setBounds(303, 189, 50, 35);
		panel.add(Button6);
		Button6.addActionListener(this);
		
		Button7.setBackground(new Color(135, 206, 250));
		Button7.setFont(new Font("Arial Black", Font.BOLD, 14));
		Button7.setBounds(10, 142, 50, 35);
		panel.add(Button7);
		Button7.addActionListener(this);
		
		Button8.setBackground(new Color(135, 206, 250));
		Button8.setFont(new Font("Arial Black", Font.BOLD, 14));
		Button8.setBounds(163, 142, 50, 35);
		panel.add(Button8);
		Button8.addActionListener(this);
		
		Button9.setBackground(new Color(135, 206, 250));
		Button9.setFont(new Font("Arial Black", Font.BOLD, 14));
		Button9.setBounds(303, 140, 50, 35);
		panel.add(Button9);
		Button9.addActionListener(this);
		
		egalButton.setBackground(new Color(135, 206, 250));
		egalButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		egalButton.setBounds(129, 97, 113, 35);
		panel.add(egalButton);
		egalButton.addActionListener(this);
	
		Button0.setBackground(new Color(135, 206, 250));
		Button0.setFont(new Font("Arial Black", Font.BOLD, 14));
		Button0.setBounds(10, 97, 50, 35);
		panel.add(Button0);
		Button0.addActionListener(this);
		
		textField = new JTextField();
		textField.setBounds(99, 56, 179, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		clearButton.setBackground(new Color(135, 206, 250));
		clearButton.setFont(new Font("Arial Black", Font.BOLD, 10));
		clearButton.setBounds(279, 96, 74, 37);
		panel.add(clearButton);
		clearButton.addActionListener(this);
		backButton.addActionListener(this);
		
	    JPanel p1=new JPanel();  
	    p1.setBackground(new Color(176, 224, 230));
	    JPanel p2=new JPanel();  
	    p2.setBackground(new Color(176, 224, 230));
	    JPanel p3=new JPanel();  
	    p3.setBackground(new Color(176, 224, 230));
	    JTabbedPane tp=new JTabbedPane();  
	    tp.setBounds(55, 10, 851, 254);
	    tp.setFont(new Font("Arial Black", Font.BOLD, 14));
	    tp.add("Food",p1);  
	    //tp.add(new JScrollPane(p1));
	    p1.setLayout(null);
	    chickenCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    chickenCheckBox.setBackground(new Color(135, 206, 250));
	    chickenCheckBox.setBounds(6, 88, 85, 21);
	    chickenCheckBox.addActionListener(this);
	    
	    p1.add(chickenCheckBox);
	    lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\pui.jpg"));
	    lblNewLabel.setBounds(6, 10, 85, 72);
	    
	    p1.add(lblNewLabel);
	    
	    JLabel lblNewLabel_1 = new JLabel("New label");
	    lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\salata.jpg"));
	    lblNewLabel_1.setBounds(6, 115, 85, 71);
	    p1.add(lblNewLabel_1);
	    
	    saladCheckBox.setBackground(new Color(135, 206, 250));
	    saladCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    saladCheckBox.setBounds(6, 192, 85, 21);
	    saladCheckBox.addActionListener(this);
	    p1.add(saladCheckBox);
	    
	    JLabel lblNewLabel_2 = new JLabel("New label");
	    lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\somon.jpg"));
	    lblNewLabel_2.setBounds(109, 10, 85, 72);
	    p1.add(lblNewLabel_2);
	    

	    salmonCheckBox.setBackground(new Color(135, 206, 250));
	    salmonCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    salmonCheckBox.setBounds(109, 88, 85, 21);
	    salmonCheckBox.addActionListener(this);
	    p1.add(salmonCheckBox);
	    
	    JLabel lblNewLabel_3 = new JLabel("New label");
	    lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\vita.jpg"));
	    lblNewLabel_3.setBounds(109, 115, 85, 71);
	    p1.add(lblNewLabel_3);
	    steakCheckBox.setBackground(new Color(135, 206, 250));
	    steakCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    steakCheckBox.setBounds(109, 192, 85, 21);
	    steakCheckBox.addActionListener(this);
	    
	    p1.add(steakCheckBox);
	    lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\IMG_0442-scaled.jpg"));
	    lblNewLabel_4.setBounds(214, 10, 85, 72);
	    
	    p1.add(lblNewLabel_4);
	    falafelCheckBox.setBackground(new Color(135, 206, 250));
	    falafelCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    falafelCheckBox.setBounds(214, 88, 85, 21);
	    falafelCheckBox.addActionListener(this);
	    
	    p1.add(falafelCheckBox);
	    lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Honey-Glazed-Crispy-Pork-Belly-square.jpg"));
	    lblNewLabel_5.setBounds(214, 115, 85, 71);
	    
	    p1.add(lblNewLabel_5);
	    porkCheckBox.setBackground(new Color(135, 206, 250));
	    porkCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    porkCheckBox.setBounds(214, 192, 85, 21);
	    porkCheckBox.addActionListener(this);
	    
	    p1.add(porkCheckBox);
	    lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\__opt__aboutcom__coeus__resources__content_migration__simply_recipes__uploads__2013__02__Rosemary-Lamb-Chops-LEAD-2-4b70775441df47848c0b4352446bac77.jpg"));
	    lblNewLabel_6.setBounds(319, 10, 85, 72);
	    
	    p1.add(lblNewLabel_6);
	    lambCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lambCheckBox.setBackground(new Color(135, 206, 250));
	    lambCheckBox.setBounds(319, 88, 85, 21);
	    lambCheckBox.addActionListener(this);
	    
	    p1.add(lambCheckBox);
	    lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Best-Ever-Beef-StewIMG_1367.jpg"));
	    lblNewLabel_7.setBounds(319, 115, 85, 71);
	    
	    p1.add(lblNewLabel_7);
	    stewCheckBox.setBackground(new Color(135, 206, 250));
	    stewCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    stewCheckBox.setBounds(319, 192, 85, 21);
	    stewCheckBox.addActionListener(this);
	    
	    p1.add(stewCheckBox);
	    lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\quiack-roasted-potatoes-2.jpg"));
	    lblNewLabel_8.setBounds(436, 10, 85, 72);
	    
	    p1.add(lblNewLabel_8);
	    potatoesCheckBox.setFont(new Font("Arial Black", Font.BOLD, 11));
	    potatoesCheckBox.setBackground(new Color(135, 206, 250));
	    potatoesCheckBox.setBounds(436, 88, 85, 21);
	    potatoesCheckBox.addActionListener(this);
	    
	    p1.add(potatoesCheckBox);
	    lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Easy-Roasted-Vegetables-7150.jpg"));
	    lblNewLabel_9.setBounds(436, 115, 85, 71);
	    
	    p1.add(lblNewLabel_9);
	    vegetablesCheckBox.setBackground(new Color(135, 206, 250));
	    vegetablesCheckBox.setFont(new Font("Arial Black", Font.BOLD, 9));
	    vegetablesCheckBox.setBounds(436, 193, 85, 21);
	    vegetablesCheckBox.addActionListener(this);
	    
	    p1.add(vegetablesCheckBox);
	    lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\French-fries-b9e3e0c.jpg"));
	    lblNewLabel_10.setBounds(539, 10, 85, 72);
	    
	    p1.add(lblNewLabel_10);
	    friesCheckBox.setBackground(new Color(135, 206, 250));
	    friesCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    friesCheckBox.setBounds(539, 88, 85, 21);
	    friesCheckBox.addActionListener(this);
	    
	    p1.add(friesCheckBox);
	    lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Homemade-Creamy-Vegtable-Soup-Recipe-1200.jpg"));
	    lblNewLabel_11.setBounds(539, 115, 85, 71);
	    
	    p1.add(lblNewLabel_11);
	    soupCheckBox.setBackground(new Color(135, 206, 250));
	    soupCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    soupCheckBox.setBounds(539, 192, 85, 21);
	    soupCheckBox.addActionListener(this);
	    
	    p1.add(soupCheckBox);
	    lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\doner_kebab_2-1080x960-1.jpg"));
	    lblNewLabel_12.setBounds(645, 10, 85, 72);
	    
	    p1.add(lblNewLabel_12);
	    kebabCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    kebabCheckBox.setBackground(new Color(135, 206, 250));
	    kebabCheckBox.setBounds(645, 88, 85, 21);
	    kebabCheckBox.addActionListener(this);
	    
	    p1.add(kebabCheckBox);
	    lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Chicken-Shawarma-5-scaled.jpg"));
	    lblNewLabel_13.setBounds(645, 115, 85, 71);
	    
	    p1.add(lblNewLabel_13);
	    shawarmaCheckBox.setBackground(new Color(135, 206, 250));
	    shawarmaCheckBox.setFont(new Font("Arial Black", Font.BOLD, 9));
	    shawarmaCheckBox.setBounds(645, 193, 85, 21);
	    shawarmaCheckBox.addActionListener(this);
	    
	    p1.add(shawarmaCheckBox);
	    lblNewLabel_14.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\classic-buffalo-wings-horizontal-279-1547506155.jpg"));
	    lblNewLabel_14.setBounds(751, 10, 85, 72);
	    
	    p1.add(lblNewLabel_14);
	    wingsCheckBox.setBackground(new Color(135, 206, 250));
	    wingsCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    wingsCheckBox.setBounds(751, 89, 85, 21);
	    wingsCheckBox.addActionListener(this);
	    
	    p1.add(wingsCheckBox);
	    lblNewLabel_15.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Best-Hummus.jpg"));
	    lblNewLabel_15.setBounds(751, 115, 85, 71);
	    
	    p1.add(lblNewLabel_15);
	    hummusCheckBox.setBackground(new Color(135, 206, 250));
	    hummusCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    hummusCheckBox.setBounds(751, 193, 89, 21);
	    hummusCheckBox.addActionListener(this);
	    
	    p1.add(hummusCheckBox);
	    tp.add("Drinks",p2);  
	    p2.setLayout(null);
	    lblNewLabel_16.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\glass_water.jpg"));
	    lblNewLabel_16.setBounds(10, 32, 90, 90);
	    
	    p2.add(lblNewLabel_16);
	    waterCheckBox.setBackground(new Color(135, 206, 250));
	    waterCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    waterCheckBox.setBounds(10, 143, 90, 21);
	    waterCheckBox.addActionListener(this);
	    
	    p2.add(waterCheckBox);
	    lblNewLabel_17.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\istockphoto-530428650-612x612.jpg"));
	    lblNewLabel_17.setBounds(132, 32, 90, 90);
	    
	    p2.add(lblNewLabel_17);
	    sodaCheckBox.setBackground(new Color(135, 206, 250));
	    sodaCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    sodaCheckBox.setBounds(132, 143, 90, 21);
	    sodaCheckBox.addActionListener(this);
	    
	    p2.add(sodaCheckBox);
	    lblNewLabel_18.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\fruitjuice_148446767.jpg"));
	    lblNewLabel_18.setBounds(257, 32, 90, 90);
	    
	    p2.add(lblNewLabel_18);
	    jucieCheckBox.setBackground(new Color(135, 206, 250));
	    jucieCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    jucieCheckBox.setBounds(257, 143, 90, 21);
	    jucieCheckBox.addActionListener(this);
	    
	    p2.add(jucieCheckBox);
	    lblNewLabel_19.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\beer_123784216.jpg"));
	    lblNewLabel_19.setBounds(746, 32, 90, 90);
	    
	    p2.add(lblNewLabel_19);
	    beerCheckBox.setBackground(new Color(135, 206, 250));
	    beerCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    beerCheckBox.setBounds(746, 143, 90, 21);
	    beerCheckBox.addActionListener(this);
	    
	    p2.add(beerCheckBox);
	    lblNewLabel_20.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\istockphoto-469545971-612x612.jpg"));
	    lblNewLabel_20.setBounds(511, 32, 90, 90);
	    
	    p2.add(lblNewLabel_20);
	    wineCheckBox.setBackground(new Color(135, 206, 250));
	    wineCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    wineCheckBox.setBounds(511, 143, 90, 21);
	    wineCheckBox.addActionListener(this);
	    
	    p2.add(wineCheckBox);
	    lblNewLabel_21.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\pink-lady-recipe-759333-hero-images-1-d2b3b4bf3416440e9339d0eb1a40afc3.jpg"));
	    lblNewLabel_21.setBounds(626, 32, 90, 90);
	    
	    p2.add(lblNewLabel_21);
	    cocktailCheckBox.setBackground(new Color(135, 206, 250));
	    cocktailCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    cocktailCheckBox.setBounds(626, 143, 90, 21);
	    cocktailCheckBox.addActionListener(this);
	    
	    p2.add(cocktailCheckBox);
	    lblNewLabel_22.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Green-Smoothie-with-Berries-1.jpg"));
	    lblNewLabel_22.setBounds(383, 32, 90, 90);
	    
	    p2.add(lblNewLabel_22);
	    smoothieCheckBox.setBackground(new Color(135, 206, 250));
	    smoothieCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    smoothieCheckBox.setBounds(383, 143, 90, 21);
	    smoothieCheckBox.addActionListener(this);
	    
	    p2.add(smoothieCheckBox);
	    tp.add("Deserts",p3);
	    p3.setLayout(null);
	    lblNewLabel_23.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\2ChocolateChipCookies.jpg"));
	    lblNewLabel_23.setBounds(10, 32, 97, 93);
	    
	    p3.add(lblNewLabel_23);
	    cookieCheckBox.setBackground(new Color(135, 206, 250));
	    cookieCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    cookieCheckBox.setBounds(10, 143, 97, 21);
	    cookieCheckBox.addActionListener(this);
	    
	    p3.add(cookieCheckBox);
	    lblNewLabel_24.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\9266919-c023924050f9406bab6eccea1664e88b.jpg"));
	    lblNewLabel_24.setBounds(160, 32, 97, 93);
	    
	    p3.add(lblNewLabel_24);
	    cakeCheckBox.setBackground(new Color(135, 206, 250));
	    cakeCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    cakeCheckBox.setBounds(160, 143, 97, 21);
	    cakeCheckBox.addActionListener(this);
	    
	    p3.add(cakeCheckBox);
	    lblNewLabel_25.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Strawberry_ice_cream_cone_(5076899310).jpg"));
	    lblNewLabel_25.setBounds(308, 32, 97, 93);
	    
	    p3.add(lblNewLabel_25);
	    icecreamCheckBox.setFont(new Font("Arial Black", Font.BOLD, 11));
	    icecreamCheckBox.setBackground(new Color(135, 206, 250));
	    icecreamCheckBox.setBounds(308, 143, 97, 21);
	    icecreamCheckBox.addActionListener(this);
	    
	    p3.add(icecreamCheckBox);
	    lblNewLabel_26.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\1200px-RaspberrySherbet.jpg"));
	    lblNewLabel_26.setBounds(453, 32, 97, 93);
	    
	    p3.add(lblNewLabel_26);
	    sorbetCheckBox.setBackground(new Color(135, 206, 250));
	    sorbetCheckBox.setFont(new Font("Arial Black", Font.PLAIN, 12));
	    sorbetCheckBox.setBounds(453, 143, 97, 21);
	    sorbetCheckBox.addActionListener(this);
	    
	    p3.add(sorbetCheckBox);
	    lblNewLabel_27.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\prajitura-brownie-6.jpg"));
	    lblNewLabel_27.setBounds(602, 32, 97, 93);
	    
	    p3.add(lblNewLabel_27);
	    brownieCheckBox.setBackground(new Color(135, 206, 250));
	    brownieCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    brownieCheckBox.setBounds(602, 143, 97, 21);
	    brownieCheckBox.addActionListener(this);
	    
	    p3.add(brownieCheckBox);
	    lblNewLabel_28.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Easy-Moist-Vanilla-Cupcakes-021-2.jpg"));
	    lblNewLabel_28.setBounds(739, 32, 97, 93);
	    
	    p3.add(lblNewLabel_28);
	    cupcakeCheckBox.setBackground(new Color(135, 206, 250));
	    cupcakeCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    cupcakeCheckBox.setBounds(739, 143, 97, 21);
	    cupcakeCheckBox.addActionListener(this);
	    
	    p3.add(cupcakeCheckBox);
	    contentPane.add(tp);
	    listDreapta.setBackground(new Color(176, 224, 230));
	    
	    
	    scrollPane_1.setViewportView(listDreapta);
		listDreapta.setModel(modelDreapta);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(427, 414, 376, 124);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		caloriiLabel.setHorizontalAlignment(SwingConstants.CENTER);
		caloriiLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		caloriiLabel.setBounds(10, 41, 85, 25);
		panel_1.add(caloriiLabel);
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_29.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_29.setBounds(10, 10, 85, 25);
		
		panel_1.add(lblNewLabel_29);
		lblNewLabel_30.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_30.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_30.setBounds(122, 10, 72, 25);
		
		panel_1.add(lblNewLabel_30);
		lblNewLabel_31.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_31.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_31.setBounds(226, 10, 65, 25);
		
		panel_1.add(lblNewLabel_31);
		lblNewLabel_32.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_32.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_32.setBounds(301, 10, 65, 25);
		
		panel_1.add(lblNewLabel_32);
		proteineLabel.setHorizontalAlignment(SwingConstants.CENTER);
		proteineLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		proteineLabel.setBounds(122, 41, 72, 25);
		
		panel_1.add(proteineLabel);
		carbsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		carbsLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		carbsLabel.setBounds(226, 41, 65, 25);
		
		panel_1.add(carbsLabel);
		fatLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		fatLabel.setHorizontalAlignment(SwingConstants.CENTER);
		fatLabel.setBounds(301, 41, 62, 25);
		
		panel_1.add(fatLabel);
		
		golireButton.setBackground(new Color(135, 206, 250));
		golireButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		golireButton.setBounds(134, 89, 101, 25);
		panel_1.add(golireButton);
		golireButton.addActionListener(this);
	    
	   
	    
	}
	
	void setSelectedF() {
		chickenCheckBox.setSelected(false);
		steakCheckBox.setSelected(false);
		falafelCheckBox.setSelected(false);
		porkCheckBox.setSelected(false);
		lambCheckBox.setSelected(false);
		stewCheckBox.setSelected(false);
		potatoesCheckBox.setSelected(false);
		vegetablesCheckBox.setSelected(false);
		friesCheckBox.setSelected(false);
		soupCheckBox.setSelected(false);
		kebabCheckBox.setSelected(false);
		shawarmaCheckBox.setSelected(false);
		wingsCheckBox.setSelected(false);
		hummusCheckBox.setSelected(false);
		waterCheckBox.setSelected(false);
		sodaCheckBox.setSelected(false);
		jucieCheckBox.setSelected(false);
		beerCheckBox.setSelected(false);
		wineCheckBox.setSelected(false);
		cocktailCheckBox.setSelected(false);
		smoothieCheckBox.setSelected(false);
		cookieCheckBox.setSelected(false);
		cakeCheckBox.setSelected(false);
		icecreamCheckBox.setSelected(false);
		sorbetCheckBox.setSelected(false);
		brownieCheckBox.setSelected(false);
		cupcakeCheckBox.setSelected(false);
		saladCheckBox.setSelected(false);
		salmonCheckBox.setSelected(false);
	}
	
	void setEnabledT() {
		chickenCheckBox.setEnabled(true);
		steakCheckBox.setEnabled(true);
		falafelCheckBox.setEnabled(true);
		porkCheckBox.setEnabled(true);
		lambCheckBox.setEnabled(true);
		stewCheckBox.setEnabled(true);
		potatoesCheckBox.setEnabled(true);
		vegetablesCheckBox.setEnabled(true);
		friesCheckBox.setEnabled(true);
		soupCheckBox.setEnabled(true);
		kebabCheckBox.setEnabled(true);
		shawarmaCheckBox.setEnabled(true);
		wingsCheckBox.setEnabled(true);
		hummusCheckBox.setEnabled(true);
		waterCheckBox.setEnabled(true);
		sodaCheckBox.setEnabled(true);
		jucieCheckBox.setEnabled(true);
		beerCheckBox.setEnabled(true);
		wineCheckBox.setEnabled(true);
		cocktailCheckBox.setEnabled(true);
		smoothieCheckBox.setEnabled(true);
		cookieCheckBox.setEnabled(true);
		cakeCheckBox.setEnabled(true);
		icecreamCheckBox.setEnabled(true);
		sorbetCheckBox.setEnabled(true);
		brownieCheckBox.setEnabled(true);
		cupcakeCheckBox.setEnabled(true);
		saladCheckBox.setEnabled(true);
		salmonCheckBox.setEnabled(true);
	}
	
	void cfma(JCheckBox x) {
		for(JCheckBox i : l) {
			if(i != x) {
				i.setEnabled(false);
			}
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		Mancare a = new Mancare();
		
		if(e.getSource() == backButton) {
			ChoosePage frame = new ChoosePage();
			frame.setVisible(true);
			dispose();
		}
		
		if(e.getSource() == clearButton) {
			textField.setText("");
		}
		
		
		if(e.getSource() == Button0) {
			if(textField.getText().isEmpty() == false)
				
			textField.setText(textField.getText()+Button0.getText());
		
				
		}
		if(e.getSource() == Button1) {
			textField.setText(textField.getText()+Button1.getText());
				
		}
		if(e.getSource() == Button2) {
			textField.setText(textField.getText()+Button2.getText());
				
		}
		if(e.getSource() == Button3) {
			textField.setText(textField.getText()+Button3.getText());
				
		}
		if(e.getSource() == Button4) {
			textField.setText(textField.getText()+Button4.getText());
				
		}
		if(e.getSource() == Button5) {
			textField.setText(textField.getText()+Button5.getText());
				
		}
		if(e.getSource() == Button6) {
			textField.setText(textField.getText()+Button6.getText());
				
		}
		if(e.getSource() == Button7) {
			textField.setText(textField.getText()+Button7.getText());
				
		}
		if(e.getSource() == Button8) {
			textField.setText(textField.getText()+Button8.getText());
				
		}
		if(e.getSource() == Button9) {
			textField.setText(textField.getText()+Button9.getText());
				
		}
		
		
		
		if(steakCheckBox.isSelected()) {
			cfma(steakCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'steak' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		
			if(chickenCheckBox.isSelected()) {
			cfma(chickenCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'chicken' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(falafelCheckBox.isSelected()) {
			cfma(falafelCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'falafel' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(porkCheckBox.isSelected()) {
			cfma(porkCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'pork' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(lambCheckBox.isSelected()) {
			cfma(lambCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'lamb' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(stewCheckBox.isSelected()) {
			cfma(stewCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'stew' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(potatoesCheckBox.isSelected()) {
			cfma(potatoesCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'potatoes' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(vegetablesCheckBox.isSelected()) {
			cfma(vegetablesCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'vegetables' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(friesCheckBox.isSelected()) {
			cfma(friesCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'fries' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(soupCheckBox.isSelected()) {
			cfma(soupCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'soup' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(kebabCheckBox.isSelected()) {
			cfma(kebabCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'kebab' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(shawarmaCheckBox.isSelected()) {
			cfma(shawarmaCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'shawarma' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(wingsCheckBox.isSelected()) {
			cfma(wingsCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'wings' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(hummusCheckBox.isSelected()) {
			cfma(hummusCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'hummus' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(waterCheckBox.isSelected()) {
			cfma(waterCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'water' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(sodaCheckBox.isSelected()) {
			cfma(sodaCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'soda' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(jucieCheckBox.isSelected()) {
			cfma(jucieCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'juice' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(beerCheckBox.isSelected()) {
			cfma(beerCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'beer' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(wineCheckBox.isSelected()) {
			cfma(wineCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'wine' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(cocktailCheckBox.isSelected()) {
			cfma(cocktailCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'cocktail' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(smoothieCheckBox.isSelected()) {
			cfma(smoothieCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'smoothie' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(cookieCheckBox.isSelected()) {
			cfma(cookieCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'cookie' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(cakeCheckBox.isSelected()) {
			cfma(cakeCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'cake' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(icecreamCheckBox.isSelected()) {
			cfma(icecreamCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'icecream' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(sorbetCheckBox.isSelected()) {
			cfma(sorbetCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'sorbet' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(brownieCheckBox.isSelected()) {
			cfma(brownieCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'brownie' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(cupcakeCheckBox.isSelected()) {
			cfma(cupcakeCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'cupcake' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(saladCheckBox.isSelected()) {
			cfma(saladCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'salad' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(salmonCheckBox.isSelected()) {
			cfma(salmonCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancarecalc where nume= 'salmon' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		
		if(e.getSource() == egalButton) {
			String out = textField.getText();
			int numr =Integer.parseInt(out);
			
			a.setCalorii((a.getCalorii()*numr)/100);
        	a.setProteine((a.getProteine()*numr)/100);
        	a.setCarbohidrati((a.getCarbohidrati()*numr)/100);
        	a.setGrasimi((a.getGrasimi()*numr)/100);
			
			JOptionPane.showMessageDialog(this, a.toStringC());
			
			textField.setText("");
			setSelectedF();
			setEnabledT();
			
			
			modelDreapta.addElement(a.toStringC());
			
			sumaCalorii= sumaCalorii + a.getCalorii();
			sumaProteine= sumaProteine + a.getProteine();
			sumaCarbo = sumaCarbo + a.getCarbohidrati();
			sumaGrasimi = sumaGrasimi +a.getGrasimi();
			String a1 = Integer.toString(sumaCalorii);
			String a2 = Integer.toString(sumaProteine);
			String a3 = Integer.toString(sumaCarbo);
			String a4 = Integer.toString(sumaGrasimi);
			
			caloriiLabel.setText(a1);
			proteineLabel.setText(a2);
			carbsLabel.setText(a3);
			fatLabel.setText(a4);
			
			
			
			
			
			System.gc();
	
			
		}
		
		if(e.getSource() == golireButton) {
			modelDreapta.clear();
			sumaCalorii = 0;
		    sumaProteine = 0;
		    sumaCarbo = 0;
		    sumaGrasimi = 0;
		    
		    caloriiLabel.setText("0");
			proteineLabel.setText("0");
			carbsLabel.setText("0");
			fatLabel.setText("0");
		    
		}
		
	}
}
