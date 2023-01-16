import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class OrderPage extends JFrame implements ActionListener{

	private JPanel contentPane;
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
	private final JLabel lblNewLabel_29 = new JLabel("Price: 29.99");
	private final JLabel lblNewLabel_9 = new JLabel("Price: 34.99");
	private final JLabel lblNewLabel_30 = new JLabel("Price: 12.99");
	private final JLabel lblNewLabel_31 = new JLabel("Price: 39.99");
	private final JLabel lblNewLabel_32 = new JLabel("Price: 25.99");
	private final JLabel lblNewLabel_33 = new JLabel("Price: 14.99");
	private final JLabel lblNewLabel_34 = new JLabel("Price: 9.99");
	private final JLabel lblNewLabel_35 = new JLabel("Price: 9.99");
	private final JLabel lblNewLabel_36 = new JLabel("Price: 11.99");
	private final JLabel lblNewLabel_37 = new JLabel("Price: 41.99");
	private final JLabel lblNewLabel_38 = new JLabel("Price: 7.99");
	private final JLabel lblNewLabel_39 = new JLabel("Price: 6.99");
	private final JLabel lblNewLabel_40 = new JLabel("Price: 11.99");
	private final JLabel lblNewLabel_41 = new JLabel("Price: 3.99");
	private final JLabel lblNewLabel_42 = new JLabel("Price: 9.99");
	private final JLabel lblNewLabel_43 = new JLabel("Price: 2.99");
	private final JLabel lblNewLabel_44 = new JLabel("Price: 4.99");
	private final JLabel lblNewLabel_45 = new JLabel("Price: 3.99");
	private final JLabel lblNewLabel_46 = new JLabel("Price: 7.99");
	private final JLabel lblNewLabel_47 = new JLabel("Price: 5.99");
	private final JLabel lblNewLabel_48 = new JLabel("Price: 9.99");
	private final JLabel lblNewLabel_49 = new JLabel("Price: 7.99");
	private final JLabel lblNewLabel_50 = new JLabel("Price: 2.99");
	private final JLabel lblNewLabel_51 = new JLabel("Price: 11.99");
	private final JLabel lblNewLabel_52 = new JLabel("New label");
	private final JLabel lblNewLabel_53 = new JLabel("Price: 3.99");
	private final JLabel lblNewLabel_54 = new JLabel("Price: 1.99");
	private final JLabel lblNewLabel_55 = new JLabel("Price: 4.99");
	private final JLabel lblNewLabel_56 = new JLabel("Price: 4.99");
	private final JLabel lblNewLabel_57 = new JLabel("New label");
	private final JCheckBox falafelCheckBox_1 = new JCheckBox("Falafel");
	private final JCheckBox potatoesCheckBox_1 = new JCheckBox("Potatoes");
	private final JLabel lblNewLabel_8_1 = new JLabel("New label");
	private final JCheckBox friesCheckBox_1 = new JCheckBox("Fries");
	private final JLabel lblNewLabel_10_1 = new JLabel("New label");
	private final JCheckBox hummusCheckBox_1 = new JCheckBox("Hummus");
	private final JLabel lblNewLabel_15_1 = new JLabel("New label");
	private final JCheckBox sorbetCheckBox_1 = new JCheckBox("Sorbet");
	private final JLabel lblNewLabel_57_1 = new JLabel("New label");
	private final JLabel lblNewLabel_58 = new JLabel("Price: 9.99");
	private final JLabel lblNewLabel_59 = new JLabel("Price: 7.99");
	private final JLabel lblNewLabel_60 = new JLabel("Price: 3.99");
	private final JLabel lblNewLabel_61 = new JLabel("Price: 6.99");
	private final JLabel lblNewLabel_62 = new JLabel("Price: 4.99");
	private final JCheckBox falafelCheckBox_1_1 = new JCheckBox("Falafel");
	private final JLabel lblNewLabel_57_2 = new JLabel("New label");
	private final JCheckBox potatoesCheckBox_1_1 = new JCheckBox("Potatoes");
	private final JLabel lblNewLabel_8_1_1 = new JLabel("New label");
	private final JCheckBox friesCheckBox_1_1 = new JCheckBox("Fries");
	private final JLabel lblNewLabel_10_1_1 = new JLabel("New label");
	private final JCheckBox hummusCheckBox_1_1 = new JCheckBox("Hummus");
	private final JLabel lblNewLabel_15_1_1 = new JLabel("New label");
	private final JCheckBox soupCheckBox_1 = new JCheckBox("Soup");
	private final JLabel lblNewLabel_8_1_1_1 = new JLabel("New label");
	private final JCheckBox cookieCheckBox_1 = new JCheckBox("Cookie");
	private final JLabel lblNewLabel_8_1_1_1_1 = new JLabel("New label");
	private final JCheckBox cakeCheckBox_1 = new JCheckBox("Cake");
	private final JLabel lblNewLabel_8_1_1_1_1_1 = new JLabel("New label");
	private final JCheckBox icecreamCheckBox_1 = new JCheckBox("Ice Cream");
	private final JLabel lblNewLabel_8_1_1_1_1_1_1 = new JLabel("New label");
	private final JCheckBox sorbetCheckBox_2 = new JCheckBox("Sorbet");
	private final JLabel lblNewLabel_8_1_1_1_2 = new JLabel("New label");
	private final JCheckBox brownieCheckBox_1 = new JCheckBox("Brownie");
	private final JLabel lblNewLabel_8_1_1_1_2_1 = new JLabel("New label");
	private final JCheckBox cupcakeCheckBox_1 = new JCheckBox("Cupcake");
	private final JLabel lblNewLabel_8_1_1_1_2_1_1 = new JLabel("New label");
	private final JLabel lblNewLabel_63 = new JLabel("Price: 9.99");
	private final JLabel lblNewLabel_64 = new JLabel("Price: 2.99");
	private final JLabel lblNewLabel_65 = new JLabel("Price: 1.99");
	private final JLabel lblNewLabel_66 = new JLabel("Price: 7.99");
	private final JLabel lblNewLabel_67 = new JLabel("Price: 3.99");
	private final JLabel lblNewLabel_61_1 = new JLabel("Price: 6.99");
	private final JLabel lblNewLabel_61_2 = new JLabel("Price: 9.99");
	private final JLabel lblNewLabel_62_1 = new JLabel("Price: 4.99");
	private final JLabel lblNewLabel_62_2 = new JLabel("Price: 11.99");
	private final JLabel lblNewLabel_62_3 = new JLabel("Price: 3.99");
	private final JLabel lblNewLabel_62_4 = new JLabel("Price: 4.99");
	private final JCheckBox chickenCheckBox_1 = new JCheckBox("Chicken");
	private final JCheckBox salmonCheckBox_1 = new JCheckBox("Salmon");
	private final JCheckBox steakCheckBox_1 = new JCheckBox("Steak");
	private final JCheckBox porkCheckBox_1 = new JCheckBox("Pork");
	private final JCheckBox lambCheckBox_1 = new JCheckBox("Lamb");
	private final JCheckBox wingsCheckBox_1 = new JCheckBox("Wings");
	private final JLabel lblNewLabel_57_2_1 = new JLabel("New label");
	private final JLabel lblNewLabel_57_2_2 = new JLabel("New label");
	private final JLabel lblNewLabel_57_2_3 = new JLabel("New label");
	private final JLabel lblNewLabel_57_2_4 = new JLabel("New label");
	private final JLabel lblNewLabel_57_2_5 = new JLabel("New label");
	private final JLabel lblNewLabel_57_2_6 = new JLabel("New label");
	private final JLabel lblNewLabel_63_1 = new JLabel("Price: 29.99");
	private final JLabel lblNewLabel_63_2 = new JLabel("Price: 39.99");
	private final JLabel lblNewLabel_63_3 = new JLabel("Price: 34.99");
	private final JLabel lblNewLabel_63_4 = new JLabel("Price: 25.99");
	private final JLabel lblNewLabel_63_5 = new JLabel("Price: 41.99");
	private final JLabel lblNewLabel_63_6 = new JLabel("Price: 14.99");
	JLabel calLabel = new JLabel("Calories:");
	JLabel prtLabel = new JLabel("Protein:");
	JLabel crbLabel = new JLabel("Carbs:");
	JLabel fatLabel = new JLabel("Fat:");
	JLabel calSumLabel = new JLabel("0");
	JLabel prtSumLabel = new JLabel("0");
	JLabel crbSumLabel = new JLabel("0");
	JLabel fatSumLabel = new JLabel("0");
	
	JCheckBox caloriesCheckBox = new JCheckBox("Show macronutirents");
	JPanel ascunde = new JPanel();
	JCheckBox salmonCheckBox = new JCheckBox("Salmon");
	JCheckBox saladCheckBox = new JCheckBox("Salad");
	
	List<JCheckBox> l = new ArrayList();
	
	DefaultListModel<String> modelDreapta = new DefaultListModel<>();
    JList<String> listDreapta = new JList<>();
    JScrollPane scrollPane_1 = new JScrollPane();
    JButton addButton = new JButton("Add to cart");
    double sumaTotal = 0.00;
    JLabel totalLabel = new JLabel("0.00");
    private final JButton emptyButton = new JButton("Empty cart");
    private final JButton orderButton = new JButton("Continue");
    
    int sumaCalorii = 0;
    int sumaProteine = 0;
    int sumaCarbo = 0;
    int sumaGrasimi = 0;

	public OrderPage() {
		
		l.add(chickenCheckBox);
		l.add(steakCheckBox);
		l.add(falafelCheckBox);
		l.add(porkCheckBox);
		l.add(lambCheckBox);
		l.add(salmonCheckBox);
		l.add(saladCheckBox);
		l.add(stewCheckBox);
		l.add(potatoesCheckBox);
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
		l.add(falafelCheckBox_1);
		l.add(potatoesCheckBox_1);
		l.add(friesCheckBox_1);
		l.add(hummusCheckBox_1);
		l.add(sorbetCheckBox_1);
		l.add(falafelCheckBox_1_1);
		l.add(potatoesCheckBox_1_1);
		l.add(friesCheckBox_1_1);
		l.add(hummusCheckBox_1_1);
		l.add(soupCheckBox_1);
		l.add(cookieCheckBox_1);
		l.add(cakeCheckBox_1);
		l.add(icecreamCheckBox_1);
		l.add(sorbetCheckBox_2);
		l.add(brownieCheckBox_1);
		l.add(cupcakeCheckBox_1);
		l.add(chickenCheckBox_1);
		l.add(salmonCheckBox_1);
		l.add(steakCheckBox_1);
		l.add(porkCheckBox_1);
		l.add(lambCheckBox_1);
		l.add(wingsCheckBox_1);
		
		setTitle("Grab a bite");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	    JPanel p2=new JPanel();  
	    p2.setBackground(new Color(176, 224, 230));
	    JPanel p3=new JPanel();  
	    p3.setBackground(new Color(176, 224, 230));
	    JPanel p4=new JPanel();
	    p4.setBackground(new Color(176, 224, 230));
	    JTabbedPane tp=new JTabbedPane(); 
	    JPanel p5 =new JPanel();
	    p5.setBackground(new Color(176, 224, 230));
	    JPanel p6 =new JPanel();
	    p6.setBackground(new Color(176, 224, 230));
	    tp.setFont(new Font("Arial Black", Font.BOLD, 14));
	    tp.setBounds(26,10,611,460);  
	    
	    JPanel p1=new JPanel();  
	    p1.setBackground(new Color(176, 224, 230));
	    tp.add("Food",p1);  
	    //tp.add(new JScrollPane(p1));
	    p1.setLayout(null);
	    chickenCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    chickenCheckBox.setBackground(new Color(135, 206, 250));
	    chickenCheckBox.setBounds(6, 88, 85, 21);
	    
	    p1.add(chickenCheckBox);
	    lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\pui.jpg"));
	    lblNewLabel.setBounds(6, 10, 85, 72);
	    
	    p1.add(lblNewLabel);
	    
	    JLabel lblNewLabel_1 = new JLabel("New label");
	    lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\salata.jpg"));
	    lblNewLabel_1.setBounds(511, 11, 85, 71);
	    p1.add(lblNewLabel_1);
	    
	    saladCheckBox.setBackground(new Color(135, 206, 250));
	    saladCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    saladCheckBox.setBounds(511, 88, 85, 21);
	    p1.add(saladCheckBox);
	    
	    JLabel lblNewLabel_2 = new JLabel("New label");
	    lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\somon.jpg"));
	    lblNewLabel_2.setBounds(127, 10, 85, 72);
	    p1.add(lblNewLabel_2);
	    
	    salmonCheckBox.setBackground(new Color(135, 206, 250));
	    salmonCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    salmonCheckBox.setBounds(127, 88, 85, 21);
	    p1.add(salmonCheckBox);
	    
	    JLabel lblNewLabel_3 = new JLabel("New label");
	    lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\vita.jpg"));
	    lblNewLabel_3.setBounds(6, 152, 85, 71);
	    p1.add(lblNewLabel_3);
	    steakCheckBox.setBackground(new Color(135, 206, 250));
	    steakCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    steakCheckBox.setBounds(6, 229, 85, 21);
	    
	    p1.add(steakCheckBox);
	    lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\IMG_0442-scaled.jpg"));
	    lblNewLabel_4.setBounds(256, 10, 85, 72);
	    
	    p1.add(lblNewLabel_4);
	    falafelCheckBox.setBackground(new Color(135, 206, 250));
	    falafelCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    falafelCheckBox.setBounds(256, 88, 85, 21);
	    
	    p1.add(falafelCheckBox);
	    lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Honey-Glazed-Crispy-Pork-Belly-square.jpg"));
	    lblNewLabel_5.setBounds(127, 152, 85, 71);
	    
	    p1.add(lblNewLabel_5);
	    porkCheckBox.setBackground(new Color(135, 206, 250));
	    porkCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    porkCheckBox.setBounds(127, 229, 85, 21);
	    
	    p1.add(porkCheckBox);
	    lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\__opt__aboutcom__coeus__resources__content_migration__simply_recipes__uploads__2013__02__Rosemary-Lamb-Chops-LEAD-2-4b70775441df47848c0b4352446bac77.jpg"));
	    lblNewLabel_6.setBounds(382, 10, 85, 72);
	    
	    p1.add(lblNewLabel_6);
	    lambCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lambCheckBox.setBackground(new Color(135, 206, 250));
	    lambCheckBox.setBounds(382, 88, 85, 21);
	    
	    p1.add(lambCheckBox);
	    lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Best-Ever-Beef-StewIMG_1367.jpg"));
	    lblNewLabel_7.setBounds(256, 152, 85, 71);
	    
	    p1.add(lblNewLabel_7);
	    stewCheckBox.setBackground(new Color(135, 206, 250));
	    stewCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    stewCheckBox.setBounds(256, 229, 85, 21);
	    
	    p1.add(stewCheckBox);
	    lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\quiack-roasted-potatoes-2.jpg"));
	    lblNewLabel_8.setBounds(382, 151, 85, 72);
	    
	    p1.add(lblNewLabel_8);
	    potatoesCheckBox.setFont(new Font("Arial Black", Font.BOLD, 11));
	    potatoesCheckBox.setBackground(new Color(135, 206, 250));
	    potatoesCheckBox.setBounds(382, 229, 85, 21);
	    
	    p1.add(potatoesCheckBox);
	    lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\French-fries-b9e3e0c.jpg"));
	    lblNewLabel_10.setBounds(511, 151, 85, 72);
	    
	    p1.add(lblNewLabel_10);
	    friesCheckBox.setBackground(new Color(135, 206, 250));
	    friesCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    friesCheckBox.setBounds(511, 229, 85, 21);
	    
	    p1.add(friesCheckBox);
	    lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Homemade-Creamy-Vegtable-Soup-Recipe-1200.jpg"));
	    lblNewLabel_11.setBounds(511, 299, 85, 71);
	    
	    p1.add(lblNewLabel_11);
	    soupCheckBox.setBackground(new Color(135, 206, 250));
	    soupCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    soupCheckBox.setBounds(511, 376, 85, 21);
	    
	    p1.add(soupCheckBox);
	    lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\doner_kebab_2-1080x960-1.jpg"));
	    lblNewLabel_12.setBounds(6, 298, 85, 72);
	    
	    p1.add(lblNewLabel_12);
	    kebabCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    kebabCheckBox.setBackground(new Color(135, 206, 250));
	    kebabCheckBox.setBounds(6, 376, 85, 21);
	    
	    p1.add(kebabCheckBox);
	    lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Chicken-Shawarma-5-scaled.jpg"));
	    lblNewLabel_13.setBounds(256, 299, 85, 71);
	    
	    p1.add(lblNewLabel_13);
	    shawarmaCheckBox.setBackground(new Color(135, 206, 250));
	    shawarmaCheckBox.setFont(new Font("Arial Black", Font.BOLD, 9));
	    shawarmaCheckBox.setBounds(256, 377, 85, 21);
	    
	    p1.add(shawarmaCheckBox);
	    lblNewLabel_14.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\classic-buffalo-wings-horizontal-279-1547506155.jpg"));
	    lblNewLabel_14.setBounds(127, 298, 85, 72);
	    
	    p1.add(lblNewLabel_14);
	    wingsCheckBox.setBackground(new Color(135, 206, 250));
	    wingsCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    wingsCheckBox.setBounds(127, 376, 85, 21);
	    
	    p1.add(wingsCheckBox);
	    lblNewLabel_15.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Best-Hummus.jpg"));
	    lblNewLabel_15.setBounds(382, 299, 85, 71);
	    
	    p1.add(lblNewLabel_15);
	    hummusCheckBox.setBackground(new Color(135, 206, 250));
	    hummusCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    hummusCheckBox.setBounds(382, 376, 89, 21);
	    
	    p1.add(hummusCheckBox);
	    lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_29.setBackground(new Color(135, 206, 250));
	    lblNewLabel_29.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_29.setBounds(6, 107, 85, 21);
	    
	    p1.add(lblNewLabel_29);
	    lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_9.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_9.setBounds(6, 248, 85, 21);
	    
	    p1.add(lblNewLabel_9);
	    lblNewLabel_30.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_30.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_30.setBounds(6, 394, 85, 21);
	    
	    p1.add(lblNewLabel_30);
	    lblNewLabel_31.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_31.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_31.setBounds(127, 107, 85, 18);
	    
	    p1.add(lblNewLabel_31);
	    lblNewLabel_32.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_32.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_32.setBounds(127, 248, 85, 18);
	    
	    p1.add(lblNewLabel_32);
	    lblNewLabel_33.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_33.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_33.setBounds(127, 394, 85, 18);
	    
	    p1.add(lblNewLabel_33);
	    lblNewLabel_34.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_34.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_34.setBounds(256, 107, 85, 18);
	    
	    p1.add(lblNewLabel_34);
	    lblNewLabel_35.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_35.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_35.setBounds(256, 248, 85, 18);
	    
	    p1.add(lblNewLabel_35);
	    lblNewLabel_36.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_36.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_36.setBounds(256, 394, 85, 18);
	    
	    p1.add(lblNewLabel_36);
	    lblNewLabel_37.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_37.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_37.setBounds(382, 107, 85, 18);
	    
	    p1.add(lblNewLabel_37);
	    lblNewLabel_38.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_38.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_38.setBounds(382, 248, 85, 18);
	    
	    p1.add(lblNewLabel_38);
	    lblNewLabel_39.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_39.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_39.setBounds(382, 394, 85, 18);
	    
	    p1.add(lblNewLabel_39);
	    lblNewLabel_40.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_40.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_40.setBounds(511, 107, 85, 18);
	    
	    p1.add(lblNewLabel_40);
	    lblNewLabel_41.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_41.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_41.setBounds(511, 248, 85, 18);
	    
	    p1.add(lblNewLabel_41);
	    lblNewLabel_42.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_42.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_42.setBounds(511, 394, 85, 18);
	    
	    p1.add(lblNewLabel_42);
	    tp.add("Drinks",p2);  
	    p2.setLayout(null);
	    lblNewLabel_16.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\glass_water.jpg"));
	    lblNewLabel_16.setBounds(10, 24, 90, 90);
	    
	    p2.add(lblNewLabel_16);
	    waterCheckBox.setBackground(new Color(135, 206, 250));
	    waterCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    waterCheckBox.setBounds(10, 120, 90, 21);
	    
	    p2.add(waterCheckBox);
	    lblNewLabel_17.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\istockphoto-530428650-612x612.jpg"));
	    lblNewLabel_17.setBounds(149, 24, 90, 90);
	    
	    p2.add(lblNewLabel_17);
	    sodaCheckBox.setBackground(new Color(135, 206, 250));
	    sodaCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    sodaCheckBox.setBounds(149, 120, 90, 21);
	    
	    p2.add(sodaCheckBox);
	    lblNewLabel_18.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\fruitjuice_148446767.jpg"));
	    lblNewLabel_18.setBounds(286, 24, 90, 90);
	    
	    p2.add(lblNewLabel_18);
	    jucieCheckBox.setBackground(new Color(135, 206, 250));
	    jucieCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    jucieCheckBox.setBounds(286, 120, 90, 21);
	    
	    p2.add(jucieCheckBox);
	    lblNewLabel_19.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\beer_123784216.jpg"));
	    lblNewLabel_19.setBounds(10, 194, 90, 90);
	    
	    p2.add(lblNewLabel_19);
	    beerCheckBox.setBackground(new Color(135, 206, 250));
	    beerCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    beerCheckBox.setBounds(10, 290, 90, 21);
	    
	    p2.add(beerCheckBox);
	    lblNewLabel_20.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\istockphoto-469545971-612x612.jpg"));
	    lblNewLabel_20.setBounds(149, 194, 90, 90);
	    
	    p2.add(lblNewLabel_20);
	    wineCheckBox.setBackground(new Color(135, 206, 250));
	    wineCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    wineCheckBox.setBounds(149, 290, 90, 21);
	    
	    p2.add(wineCheckBox);
	    lblNewLabel_21.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\pink-lady-recipe-759333-hero-images-1-d2b3b4bf3416440e9339d0eb1a40afc3.jpg"));
	    lblNewLabel_21.setBounds(286, 194, 90, 90);
	    
	    p2.add(lblNewLabel_21);
	    cocktailCheckBox.setBackground(new Color(135, 206, 250));
	    cocktailCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    cocktailCheckBox.setBounds(286, 290, 90, 21);
	    
	    p2.add(cocktailCheckBox);
	    lblNewLabel_22.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Green-Smoothie-with-Berries-1.jpg"));
	    lblNewLabel_22.setBounds(430, 24, 90, 90);
	    
	    p2.add(lblNewLabel_22);
	    smoothieCheckBox.setBackground(new Color(135, 206, 250));
	    smoothieCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    smoothieCheckBox.setBounds(430, 120, 90, 21);
	    
	    p2.add(smoothieCheckBox);
	    lblNewLabel_43.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_43.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_43.setBounds(10, 139, 90, 21);
	    
	    p2.add(lblNewLabel_43);
	    lblNewLabel_44.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_44.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_44.setBounds(10, 309, 90, 21);
	    
	    p2.add(lblNewLabel_44);
	    lblNewLabel_45.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_45.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_45.setBounds(149, 139, 90, 18);
	    
	    p2.add(lblNewLabel_45);
	    lblNewLabel_46.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_46.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_46.setBounds(149, 309, 90, 18);
	    
	    p2.add(lblNewLabel_46);
	    lblNewLabel_47.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_47.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_47.setBounds(286, 139, 90, 18);
	    
	    p2.add(lblNewLabel_47);
	    lblNewLabel_48.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_48.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_48.setBounds(286, 309, 90, 18);
	    
	    p2.add(lblNewLabel_48);
	    lblNewLabel_49.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_49.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_49.setBounds(430, 139, 90, 18);
	    
	    p2.add(lblNewLabel_49);
	    tp.add("Deserts",p3);
	    p3.setLayout(null);
	    lblNewLabel_23.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\2ChocolateChipCookies.jpg"));
	    lblNewLabel_23.setBounds(10, 32, 97, 93);
	    
	    p3.add(lblNewLabel_23);
	    cookieCheckBox.setBackground(new Color(135, 206, 250));
	    cookieCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    cookieCheckBox.setBounds(10, 131, 97, 21);
	    
	    p3.add(cookieCheckBox);
	    lblNewLabel_24.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\9266919-c023924050f9406bab6eccea1664e88b.jpg"));
	    lblNewLabel_24.setBounds(160, 32, 97, 93);
	    
	    p3.add(lblNewLabel_24);
	    cakeCheckBox.setBackground(new Color(135, 206, 250));
	    cakeCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    cakeCheckBox.setBounds(160, 131, 97, 21);
	    
	    p3.add(cakeCheckBox);
	    lblNewLabel_25.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Strawberry_ice_cream_cone_(5076899310).jpg"));
	    lblNewLabel_25.setBounds(308, 32, 97, 93);
	    
	    p3.add(lblNewLabel_25);
	    icecreamCheckBox.setFont(new Font("Arial Black", Font.BOLD, 11));
	    icecreamCheckBox.setBackground(new Color(135, 206, 250));
	    icecreamCheckBox.setBounds(308, 131, 97, 21);
	    
	    p3.add(icecreamCheckBox);
	    lblNewLabel_26.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\1200px-RaspberrySherbet.jpg"));
	    lblNewLabel_26.setBounds(10, 210, 97, 93);
	    
	    p3.add(lblNewLabel_26);
	    sorbetCheckBox.setBackground(new Color(135, 206, 250));
	    sorbetCheckBox.setFont(new Font("Arial Black", Font.PLAIN, 12));
	    sorbetCheckBox.setBounds(10, 309, 97, 21);
	    
	    p3.add(sorbetCheckBox);
	    lblNewLabel_27.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\prajitura-brownie-6.jpg"));
	    lblNewLabel_27.setBounds(160, 210, 97, 93);
	    
	    p3.add(lblNewLabel_27);
	    brownieCheckBox.setBackground(new Color(135, 206, 250));
	    brownieCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    brownieCheckBox.setBounds(160, 309, 97, 21);
	    
	    p3.add(brownieCheckBox);
	    lblNewLabel_28.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Easy-Moist-Vanilla-Cupcakes-021-2.jpg"));
	    lblNewLabel_28.setBounds(462, 32, 97, 93);
	    
	    p3.add(lblNewLabel_28);
	    cupcakeCheckBox.setBackground(new Color(135, 206, 250));
	    cupcakeCheckBox.setFont(new Font("Arial Black", Font.BOLD, 12));
	    cupcakeCheckBox.setBounds(462, 131, 97, 21);
	    
	    p3.add(cupcakeCheckBox);
	    lblNewLabel_50.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_50.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_50.setBounds(10, 150, 97, 21);
	    
	    p3.add(lblNewLabel_50);
	    lblNewLabel_51.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_51.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_51.setBounds(160, 150, 97, 18);
	    
	    p3.add(lblNewLabel_51);
	    lblNewLabel_52.setBounds(308, 136, 45, 13);
	    
	    p3.add(lblNewLabel_52);
	    lblNewLabel_53.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_53.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_53.setBounds(308, 150, 97, 18);
	    
	    p3.add(lblNewLabel_53);
	    lblNewLabel_54.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_54.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_54.setBounds(462, 150, 97, 18);
	    
	    p3.add(lblNewLabel_54);
	    lblNewLabel_55.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_55.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_55.setBounds(10, 328, 97, 21);
	    
	    p3.add(lblNewLabel_55);
	    lblNewLabel_56.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_56.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_56.setBounds(160, 328, 97, 18);
	    
	    p3.add(lblNewLabel_56);
	    
	    tp.add("Vegan",p4);
	    p4.setLayout(null);
	    lblNewLabel_57.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\IMG_0442-scaled.jpg"));
	    lblNewLabel_57.setBounds(10, 38, 90, 90);
	    
	    p4.add(lblNewLabel_57);
	    falafelCheckBox_1.setFont(new Font("Arial Black", Font.BOLD, 12));
	    falafelCheckBox_1.setBackground(new Color(135, 206, 250));
	    falafelCheckBox_1.setBounds(10, 134, 90, 21);
	    
	    p4.add(falafelCheckBox_1);
	    potatoesCheckBox_1.setFont(new Font("Arial Black", Font.BOLD, 11));
	    potatoesCheckBox_1.setBackground(new Color(135, 206, 250));
	    potatoesCheckBox_1.setBounds(151, 134, 90, 21);
	    
	    p4.add(potatoesCheckBox_1);
	    lblNewLabel_8_1.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\quiack-roasted-potatoes-2.jpg"));
	    lblNewLabel_8_1.setBounds(151, 38, 90, 90);
	    
	    p4.add(lblNewLabel_8_1);
	    friesCheckBox_1.setFont(new Font("Arial Black", Font.BOLD, 12));
	    friesCheckBox_1.setBackground(new Color(135, 206, 250));
	    friesCheckBox_1.setBounds(296, 134, 90, 21);
	    
	    p4.add(friesCheckBox_1);
	    lblNewLabel_10_1.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\French-fries-b9e3e0c.jpg"));
	    lblNewLabel_10_1.setBounds(296, 38, 90, 90);
	    
	    p4.add(lblNewLabel_10_1);
	    hummusCheckBox_1.setFont(new Font("Arial Black", Font.BOLD, 12));
	    hummusCheckBox_1.setBackground(new Color(135, 206, 250));
	    hummusCheckBox_1.setBounds(436, 134, 90, 21);
	    
	    p4.add(hummusCheckBox_1);
	    lblNewLabel_15_1.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Best-Hummus.jpg"));
	    lblNewLabel_15_1.setBounds(436, 38, 90, 90);
	    
	    p4.add(lblNewLabel_15_1);
	    sorbetCheckBox_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
	    sorbetCheckBox_1.setBackground(new Color(135, 206, 250));
	    sorbetCheckBox_1.setBounds(10, 316, 90, 21);
	    
	    p4.add(sorbetCheckBox_1);
	    lblNewLabel_57_1.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\1200px-RaspberrySherbet.jpg"));
	    lblNewLabel_57_1.setBounds(10, 220, 90, 90);
	    
	    p4.add(lblNewLabel_57_1);
	    lblNewLabel_58.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_58.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_58.setBounds(10, 153, 90, 21);
	    
	    p4.add(lblNewLabel_58);
	    lblNewLabel_59.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_59.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_59.setBounds(151, 153, 90, 18);
	    
	    p4.add(lblNewLabel_59);
	    lblNewLabel_60.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_60.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_60.setBounds(296, 153, 90, 18);
	    
	    p4.add(lblNewLabel_60);
	    lblNewLabel_61.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_61.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_61.setBounds(436, 153, 90, 18);
	    
	    p4.add(lblNewLabel_61);
	    lblNewLabel_62.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_62.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_62.setBounds(10, 335, 90, 21);
	    
	    p4.add(lblNewLabel_62);
	    
	    tp.add("Vegetarian",p5);
	    p5.setLayout(null);
	    falafelCheckBox_1_1.setFont(new Font("Arial Black", Font.BOLD, 12));
	    falafelCheckBox_1_1.setBackground(new Color(135, 206, 250));
	    falafelCheckBox_1_1.setBounds(6, 106, 90, 21);
	    
	    p5.add(falafelCheckBox_1_1);
	    lblNewLabel_57_2.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\IMG_0442-scaled.jpg"));
	    lblNewLabel_57_2.setBounds(6, 10, 90, 90);
	    
	    p5.add(lblNewLabel_57_2);
	    potatoesCheckBox_1_1.setFont(new Font("Arial Black", Font.BOLD, 11));
	    potatoesCheckBox_1_1.setBackground(new Color(135, 206, 250));
	    potatoesCheckBox_1_1.setBounds(131, 106, 90, 21);
	    
	    p5.add(potatoesCheckBox_1_1);
	    lblNewLabel_8_1_1.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\quiack-roasted-potatoes-2.jpg"));
	    lblNewLabel_8_1_1.setBounds(131, 10, 90, 90);
	    
	    p5.add(lblNewLabel_8_1_1);
	    friesCheckBox_1_1.setFont(new Font("Arial Black", Font.BOLD, 12));
	    friesCheckBox_1_1.setBackground(new Color(135, 206, 250));
	    friesCheckBox_1_1.setBounds(255, 106, 90, 21);
	    
	    p5.add(friesCheckBox_1_1);
	    lblNewLabel_10_1_1.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\French-fries-b9e3e0c.jpg"));
	    lblNewLabel_10_1_1.setBounds(255, 10, 90, 90);
	    
	    p5.add(lblNewLabel_10_1_1);
	    hummusCheckBox_1_1.setFont(new Font("Arial Black", Font.BOLD, 12));
	    hummusCheckBox_1_1.setBackground(new Color(135, 206, 250));
	    hummusCheckBox_1_1.setBounds(377, 106, 90, 21);
	    
	    p5.add(hummusCheckBox_1_1);
	    lblNewLabel_15_1_1.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Best-Hummus.jpg"));
	    lblNewLabel_15_1_1.setBounds(377, 10, 90, 90);
	    
	    p5.add(lblNewLabel_15_1_1);
	    soupCheckBox_1.setFont(new Font("Arial Black", Font.BOLD, 12));
	    soupCheckBox_1.setBackground(new Color(135, 206, 250));
	    soupCheckBox_1.setBounds(506, 106, 90, 21);
	    
	    p5.add(soupCheckBox_1);
	    lblNewLabel_8_1_1_1.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Homemade-Creamy-Vegtable-Soup-Recipe-1200.jpg"));
	    lblNewLabel_8_1_1_1.setBounds(506, 10, 90, 90);
	    
	    p5.add(lblNewLabel_8_1_1_1);
	    cookieCheckBox_1.setFont(new Font("Arial Black", Font.BOLD, 12));
	    cookieCheckBox_1.setBackground(new Color(135, 206, 250));
	    cookieCheckBox_1.setBounds(6, 252, 90, 21);
	    
	    p5.add(cookieCheckBox_1);
	    lblNewLabel_8_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\2ChocolateChipCookies.jpg"));
	    lblNewLabel_8_1_1_1_1.setBounds(6, 156, 90, 90);
	    
	    p5.add(lblNewLabel_8_1_1_1_1);
	    cakeCheckBox_1.setFont(new Font("Arial Black", Font.BOLD, 12));
	    cakeCheckBox_1.setBackground(new Color(135, 206, 250));
	    cakeCheckBox_1.setBounds(131, 252, 90, 21);
	    
	    p5.add(cakeCheckBox_1);
	    lblNewLabel_8_1_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\9266919-c023924050f9406bab6eccea1664e88b.jpg"));
	    lblNewLabel_8_1_1_1_1_1.setBounds(131, 156, 90, 90);
	    
	    p5.add(lblNewLabel_8_1_1_1_1_1);
	    icecreamCheckBox_1.setFont(new Font("Arial Black", Font.BOLD, 11));
	    icecreamCheckBox_1.setBackground(new Color(135, 206, 250));
	    icecreamCheckBox_1.setBounds(255, 252, 90, 21);
	    
	    p5.add(icecreamCheckBox_1);
	    lblNewLabel_8_1_1_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Strawberry_ice_cream_cone_(5076899310).jpg"));
	    lblNewLabel_8_1_1_1_1_1_1.setBounds(255, 156, 90, 90);
	    
	    p5.add(lblNewLabel_8_1_1_1_1_1_1);
	    sorbetCheckBox_2.setFont(new Font("Arial Black", Font.PLAIN, 12));
	    sorbetCheckBox_2.setBackground(new Color(135, 206, 250));
	    sorbetCheckBox_2.setBounds(377, 252, 90, 21);
	    
	    p5.add(sorbetCheckBox_2);
	    lblNewLabel_8_1_1_1_2.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\1200px-RaspberrySherbet.jpg"));
	    lblNewLabel_8_1_1_1_2.setBounds(377, 156, 90, 90);
	    
	    p5.add(lblNewLabel_8_1_1_1_2);
	    brownieCheckBox_1.setFont(new Font("Arial Black", Font.BOLD, 12));
	    brownieCheckBox_1.setBackground(new Color(135, 206, 250));
	    brownieCheckBox_1.setBounds(506, 252, 90, 21);
	    
	    p5.add(brownieCheckBox_1);
	    lblNewLabel_8_1_1_1_2_1.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\prajitura-brownie-6.jpg"));
	    lblNewLabel_8_1_1_1_2_1.setBounds(506, 156, 90, 90);
	    
	    p5.add(lblNewLabel_8_1_1_1_2_1);
	    cupcakeCheckBox_1.setFont(new Font("Arial Black", Font.BOLD, 12));
	    cupcakeCheckBox_1.setBackground(new Color(135, 206, 250));
	    cupcakeCheckBox_1.setBounds(6, 385, 90, 21);
	    
	    p5.add(cupcakeCheckBox_1);
	    lblNewLabel_8_1_1_1_2_1_1.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Easy-Moist-Vanilla-Cupcakes-021-2.jpg"));
	    lblNewLabel_8_1_1_1_2_1_1.setBounds(6, 289, 90, 90);
	    
	    p5.add(lblNewLabel_8_1_1_1_2_1_1);
	    lblNewLabel_63.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_63.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_63.setBounds(6, 125, 86, 21);
	    
	    p5.add(lblNewLabel_63);
	    lblNewLabel_64.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_64.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_64.setBounds(6, 271, 90, 21);
	    
	    p5.add(lblNewLabel_64);
	    lblNewLabel_65.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_65.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_65.setBounds(6, 404, 90, 21);
	    
	    p5.add(lblNewLabel_65);
	    lblNewLabel_66.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_66.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_66.setBounds(131, 125, 90, 18);
	    
	    p5.add(lblNewLabel_66);
	    lblNewLabel_67.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_67.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_67.setBounds(255, 130, 90, 13);
	    
	    p5.add(lblNewLabel_67);
	    lblNewLabel_61_1.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_61_1.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_61_1.setBounds(377, 125, 90, 21);
	    
	    p5.add(lblNewLabel_61_1);
	    lblNewLabel_61_2.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_61_2.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_61_2.setBounds(506, 125, 90, 21);
	    
	    p5.add(lblNewLabel_61_2);
	    lblNewLabel_62_1.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_62_1.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_62_1.setBounds(377, 271, 90, 26);
	    
	    p5.add(lblNewLabel_62_1);
	    lblNewLabel_62_2.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_62_2.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_62_2.setBounds(131, 271, 90, 26);
	    
	    p5.add(lblNewLabel_62_2);
	    lblNewLabel_62_3.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_62_3.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_62_3.setBounds(255, 271, 90, 26);
	    
	    p5.add(lblNewLabel_62_3);
	    lblNewLabel_62_4.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_62_4.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_62_4.setBounds(506, 271, 90, 26);
	    
	    p5.add(lblNewLabel_62_4);
	    
	    tp.add("Keto",p6);
	    p6.setLayout(null);
	    chickenCheckBox_1.setFont(new Font("Arial Black", Font.BOLD, 12));
	    chickenCheckBox_1.setBackground(new Color(135, 206, 250));
	    chickenCheckBox_1.setBounds(6, 126, 90, 21);
	    
	    p6.add(chickenCheckBox_1);
	    salmonCheckBox_1.setFont(new Font("Arial Black", Font.BOLD, 12));
	    salmonCheckBox_1.setBackground(new Color(135, 206, 250));
	    salmonCheckBox_1.setBounds(139, 126, 90, 21);
	    
	    p6.add(salmonCheckBox_1);
	    steakCheckBox_1.setFont(new Font("Arial Black", Font.BOLD, 12));
	    steakCheckBox_1.setBackground(new Color(135, 206, 250));
	    steakCheckBox_1.setBounds(284, 126, 90, 21);
	    
	    p6.add(steakCheckBox_1);
	    porkCheckBox_1.setFont(new Font("Arial Black", Font.BOLD, 12));
	    porkCheckBox_1.setBackground(new Color(135, 206, 250));
	    porkCheckBox_1.setBounds(432, 126, 90, 21);
	    
	    p6.add(porkCheckBox_1);
	    lambCheckBox_1.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lambCheckBox_1.setBackground(new Color(135, 206, 250));
	    lambCheckBox_1.setBounds(6, 299, 90, 21);
	    
	    p6.add(lambCheckBox_1);
	    wingsCheckBox_1.setFont(new Font("Arial Black", Font.BOLD, 12));
	    wingsCheckBox_1.setBackground(new Color(135, 206, 250));
	    wingsCheckBox_1.setBounds(139, 299, 90, 21);
	    
	    p6.add(wingsCheckBox_1);
	    lblNewLabel_57_2_1.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\pui.jpg"));
	    lblNewLabel_57_2_1.setBounds(6, 30, 90, 90);
	    
	    p6.add(lblNewLabel_57_2_1);
	    lblNewLabel_57_2_2.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\somon.jpg"));
	    lblNewLabel_57_2_2.setBounds(139, 30, 90, 90);
	    
	    p6.add(lblNewLabel_57_2_2);
	    lblNewLabel_57_2_3.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\vita.jpg"));
	    lblNewLabel_57_2_3.setBounds(284, 30, 90, 90);
	    
	    p6.add(lblNewLabel_57_2_3);
	    lblNewLabel_57_2_4.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\Honey-Glazed-Crispy-Pork-Belly-square.jpg"));
	    lblNewLabel_57_2_4.setBounds(432, 30, 90, 90);
	    
	    p6.add(lblNewLabel_57_2_4);
	    lblNewLabel_57_2_5.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\__opt__aboutcom__coeus__resources__content_migration__simply_recipes__uploads__2013__02__Rosemary-Lamb-Chops-LEAD-2-4b70775441df47848c0b4352446bac77.jpg"));
	    lblNewLabel_57_2_5.setBounds(6, 203, 90, 90);
	    
	    p6.add(lblNewLabel_57_2_5);
	    lblNewLabel_57_2_6.setIcon(new ImageIcon("C:\\Users\\Octa\\Desktop\\pozici\\classic-buffalo-wings-horizontal-279-1547506155.jpg"));
	    lblNewLabel_57_2_6.setBounds(139, 203, 90, 90);
	    
	    p6.add(lblNewLabel_57_2_6);
	    lblNewLabel_63_1.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_63_1.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_63_1.setBounds(6, 148, 86, 21);
	    
	    p6.add(lblNewLabel_63_1);
	    lblNewLabel_63_2.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_63_2.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_63_2.setBounds(139, 148, 86, 21);
	    
	    p6.add(lblNewLabel_63_2);
	    lblNewLabel_63_3.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_63_3.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_63_3.setBounds(284, 148, 86, 21);
	    
	    p6.add(lblNewLabel_63_3);
	    lblNewLabel_63_4.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_63_4.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_63_4.setBounds(432, 148, 86, 21);
	    
	    p6.add(lblNewLabel_63_4);
	    lblNewLabel_63_5.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_63_5.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_63_5.setBounds(6, 319, 86, 21);
	    
	    p6.add(lblNewLabel_63_5);
	    lblNewLabel_63_6.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_63_6.setFont(new Font("Arial Black", Font.BOLD, 12));
	    lblNewLabel_63_6.setBounds(139, 319, 86, 21);
	    
	    p6.add(lblNewLabel_63_6);
	    
	    chickenCheckBox.addActionListener(this);
		steakCheckBox.addActionListener(this);
		falafelCheckBox.addActionListener(this);
		porkCheckBox.addActionListener(this);
		lambCheckBox.addActionListener(this);
		stewCheckBox.addActionListener(this);
		potatoesCheckBox.addActionListener(this);
		friesCheckBox.addActionListener(this);
		soupCheckBox.addActionListener(this);
		kebabCheckBox.addActionListener(this);
		shawarmaCheckBox.addActionListener(this);
		wingsCheckBox.addActionListener(this);
		hummusCheckBox.addActionListener(this);
		waterCheckBox.addActionListener(this);
		sodaCheckBox.addActionListener(this);
		jucieCheckBox.addActionListener(this);
		beerCheckBox.addActionListener(this);
		wineCheckBox.addActionListener(this);
		cocktailCheckBox.addActionListener(this);
		smoothieCheckBox.addActionListener(this);
		cookieCheckBox.addActionListener(this);
		cakeCheckBox.addActionListener(this);
		icecreamCheckBox.addActionListener(this);
		sorbetCheckBox.addActionListener(this);
		brownieCheckBox.addActionListener(this);
		cupcakeCheckBox.addActionListener(this);
		saladCheckBox.addActionListener(this);
		salmonCheckBox.addActionListener(this);
		falafelCheckBox_1.addActionListener(this);
		potatoesCheckBox_1.addActionListener(this);
		friesCheckBox_1.addActionListener(this);
		hummusCheckBox_1.addActionListener(this);
		sorbetCheckBox_1.addActionListener(this);
		falafelCheckBox_1_1.addActionListener(this);
		potatoesCheckBox_1_1.addActionListener(this);
		friesCheckBox_1_1.addActionListener(this);
		hummusCheckBox_1_1.addActionListener(this);
		soupCheckBox_1.addActionListener(this);
		cookieCheckBox_1.addActionListener(this);
		cakeCheckBox_1.addActionListener(this);
		icecreamCheckBox_1.addActionListener(this);
		sorbetCheckBox_2.addActionListener(this);
		brownieCheckBox_1.addActionListener(this);
		cupcakeCheckBox_1.addActionListener(this);
		chickenCheckBox_1.addActionListener(this);
		salmonCheckBox_1.addActionListener(this);
		steakCheckBox_1.addActionListener(this);
		porkCheckBox_1.addActionListener(this);
		lambCheckBox_1.addActionListener(this);
		wingsCheckBox_1.addActionListener(this);
	    
	    scrollPane_1.setBounds(675, 73, 243, 291);
	    contentPane.add(scrollPane_1);
	    
	    listDreapta.setBackground(new Color(176, 224, 230));
	    
	    
	    scrollPane_1.setViewportView(listDreapta);
		listDreapta.setModel(modelDreapta);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(675, 374, 243, 179);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		ascunde.setBorder(null);
		ascunde.setBackground(new Color(135, 206, 250));
		ascunde.setBounds(0, 79, 243, 100);
		panel_1.add(ascunde);
		
		JLabel lblNewLabel_69 = new JLabel("Total:");
		lblNewLabel_69.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_69.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblNewLabel_69.setBounds(10, 10, 63, 33);
		panel_1.add(lblNewLabel_69);
		
		totalLabel.setFont(new Font("Arial Black", Font.BOLD, 16));
		totalLabel.setHorizontalAlignment(SwingConstants.CENTER);
		totalLabel.setBounds(71, 10, 110, 33);
		panel_1.add(totalLabel);
		emptyButton.setBackground(new Color(135, 206, 250));
		emptyButton.setFont(new Font("Arial Black", Font.BOLD, 8));
		emptyButton.setBounds(10, 42, 96, 33);
		
		panel_1.add(emptyButton);
		orderButton.setFont(new Font("Arial Black", Font.BOLD, 12));
		orderButton.setBackground(new Color(135, 206, 250));
		orderButton.setBounds(137, 39, 96, 33);
		
		panel_1.add(orderButton);
		
		calLabel.setFont(new Font("Arial Black", Font.BOLD, 12));
		calLabel.setBounds(10, 85, 63, 24);
		panel_1.add(calLabel);
		
		prtLabel.setFont(new Font("Arial Black", Font.BOLD, 12));
		prtLabel.setBounds(10, 108, 63, 24);
		panel_1.add(prtLabel);
		
		crbLabel.setFont(new Font("Arial Black", Font.BOLD, 12));
		crbLabel.setBounds(10, 131, 63, 24);
		panel_1.add(crbLabel);
		
		fatLabel.setFont(new Font("Arial Black", Font.BOLD, 12));
		fatLabel.setBounds(10, 152, 63, 27);
		panel_1.add(fatLabel);
		
		calSumLabel.setFont(new Font("Arial Black", Font.BOLD, 12));
		calSumLabel.setHorizontalAlignment(SwingConstants.CENTER);
		calSumLabel.setBounds(99, 88, 45, 20);
		panel_1.add(calSumLabel);
		
		prtSumLabel.setHorizontalAlignment(SwingConstants.CENTER);
		prtSumLabel.setFont(new Font("Arial Black", Font.BOLD, 12));
		prtSumLabel.setBounds(99, 108, 45, 24);
		panel_1.add(prtSumLabel);
		
		crbSumLabel.setHorizontalAlignment(SwingConstants.CENTER);
		crbSumLabel.setFont(new Font("Arial Black", Font.BOLD, 12));
		crbSumLabel.setBounds(99, 131, 45, 24);
		panel_1.add(crbSumLabel);
		
		fatSumLabel.setHorizontalAlignment(SwingConstants.CENTER);
		fatSumLabel.setFont(new Font("Arial Black", Font.BOLD, 12));
		fatSumLabel.setBounds(99, 152, 45, 27);
		panel_1.add(fatSumLabel);
	    
	    
	    
	    contentPane.add(tp);
	    
	    addButton.setBackground(new Color(176, 224, 230));
	    addButton.setFont(new Font("Arial Black", Font.BOLD, 15));
	    addButton.setBounds(243, 480, 132, 41);
	    contentPane.add(addButton);
	    
	    JPanel panel = new JPanel();
	    panel.setBackground(new Color(176, 224, 230));
	    panel.setBounds(675, 37, 243, 41);
	    contentPane.add(panel);
	    panel.setLayout(null);
	    
	    JLabel lblNewLabel_68 = new JLabel("Cart");
	    lblNewLabel_68.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_68.setFont(new Font("Arial Black", Font.BOLD, 24));
	    lblNewLabel_68.setBounds(10, 0, 223, 31);
	    panel.add(lblNewLabel_68);
	    
	    caloriesCheckBox.setBackground(new Color(176, 224, 230));
	    caloriesCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
	    caloriesCheckBox.setBounds(481, 476, 155, 21);
	    contentPane.add(caloriesCheckBox);
	    caloriesCheckBox.setFont(new Font("Arial Black", Font.BOLD, 10));
	    backButton.setBackground(new Color(176, 224, 230));
	    backButton.setFont(new Font("Arial Black", Font.BOLD, 12));
	    backButton.setBounds(10, 526, 85, 27);
	    
	    contentPane.add(backButton);
	    addButton.addActionListener(this);
	    emptyButton.addActionListener(this);
	    orderButton.addActionListener(this);
	    caloriesCheckBox.addActionListener(this);
	    backButton.addActionListener(this);
	}
	void setSelectedF() {
		chickenCheckBox.setSelected(false);
		steakCheckBox.setSelected(false);
		falafelCheckBox.setSelected(false);
		porkCheckBox.setSelected(false);
		lambCheckBox.setSelected(false);
		stewCheckBox.setSelected(false);
		potatoesCheckBox.setSelected(false);
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
		falafelCheckBox_1.setSelected(false);
		potatoesCheckBox_1.setSelected(false);
		friesCheckBox_1.setSelected(false);
		hummusCheckBox_1.setSelected(false);
		sorbetCheckBox_1.setSelected(false);
		falafelCheckBox_1_1.setSelected(false);
		potatoesCheckBox_1_1.setSelected(false);
		friesCheckBox_1_1.setSelected(false);
		hummusCheckBox_1_1.setSelected(false);
		soupCheckBox_1.setSelected(false);
		cookieCheckBox_1.setSelected(false);
		cakeCheckBox_1.setSelected(false);
		icecreamCheckBox_1.setSelected(false);
		sorbetCheckBox_2.setSelected(false);
		brownieCheckBox_1.setSelected(false);
		cupcakeCheckBox_1.setSelected(false);
		chickenCheckBox_1.setSelected(false);
		salmonCheckBox_1.setSelected(false);
		steakCheckBox_1.setSelected(false);
		porkCheckBox_1.setSelected(false);
		lambCheckBox_1.setSelected(false);
		wingsCheckBox_1.setSelected(false);
	}
	
	void setEnabledT() {
		chickenCheckBox.setEnabled(true);
		steakCheckBox.setEnabled(true);
		falafelCheckBox.setEnabled(true);
		porkCheckBox.setEnabled(true);
		lambCheckBox.setEnabled(true);
		stewCheckBox.setEnabled(true);
		potatoesCheckBox.setEnabled(true);
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
		falafelCheckBox_1.setEnabled(true);
		potatoesCheckBox_1.setEnabled(true);
		friesCheckBox_1.setEnabled(true);
		hummusCheckBox_1.setEnabled(true);
		sorbetCheckBox_1.setEnabled(true);
		falafelCheckBox_1_1.setEnabled(true);
		potatoesCheckBox_1_1.setEnabled(true);
		friesCheckBox_1_1.setEnabled(true);
		hummusCheckBox_1_1.setEnabled(true);
		soupCheckBox_1.setEnabled(true);
		cookieCheckBox_1.setEnabled(true);
		cakeCheckBox_1.setEnabled(true);
		icecreamCheckBox_1.setEnabled(true);
		sorbetCheckBox_2.setEnabled(true);
		brownieCheckBox_1.setEnabled(true);
		cupcakeCheckBox_1.setEnabled(true);
		chickenCheckBox_1.setEnabled(true);
		salmonCheckBox_1.setEnabled(true);
		steakCheckBox_1.setEnabled(true);
		porkCheckBox_1.setEnabled(true);
		lambCheckBox_1.setEnabled(true);
		wingsCheckBox_1.setEnabled(true);
	}
	
	void cfma(JCheckBox x) {
		for(JCheckBox i : l) {
			if(i != x) {
				i.setEnabled(false);
			}
		}
	}
	public List<String> lal = new ArrayList<String>();
	public int numarare = 0;
	private final JButton backButton = new JButton("Back");
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Mancare a = new Mancare();
		List<String> comanda = new ArrayList<String>();
		
		if(steakCheckBox.isSelected()) {
			cfma(steakCheckBox);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'steak' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='steak' ";
			            stmt.executeUpdate(sql);}
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");}
		            
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'chicken' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		                a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='chicken' ";
			            stmt.executeUpdate(sql);}
		            	
		            } else {
		                JOptionPane.showMessageDialog(null, "error");}
		            
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'falafel' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='falafel' ";
			            stmt.executeUpdate(sql);}
		                
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'pork' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='pork' ";
			            stmt.executeUpdate(sql);}
		                
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'lamb' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='lamb' ";
			            stmt.executeUpdate(sql);}
		                
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'stew' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='stew' ";
			            stmt.executeUpdate(sql);}
		                
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'potatoes' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='potatoes' ";
			            stmt.executeUpdate(sql);}
		                
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'fries' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='fries' ";
			            stmt.executeUpdate(sql);}
		                
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'soup' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='soup' ";
			            stmt.executeUpdate(sql);}
		                
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'kebab' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='kebab' ";
			            stmt.executeUpdate(sql);}
		                
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'shawarma' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='shawarma' ";
			            stmt.executeUpdate(sql);}
		                
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'wings' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='wings' ";
			            stmt.executeUpdate(sql);}
		                
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'hummus' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='hummus' ";
			            stmt.executeUpdate(sql);}
		                
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'water' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='water' ";
			            stmt.executeUpdate(sql);}
		                
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'soda' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='soda' ";
			            stmt.executeUpdate(sql);}
		                
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'juice' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='juice' ";
			            stmt.executeUpdate(sql);}
		                
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'beer' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='beer' ";
			            stmt.executeUpdate(sql);}
		                
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'wine' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='wine' ";
			            stmt.executeUpdate(sql);}
		                
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'cocktail' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='cocktail' ";
			            stmt.executeUpdate(sql);}
		                
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'smoothie' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='smoothie' ";
			            stmt.executeUpdate(sql);}
		                
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'cookie' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='cookie' ";
			            stmt.executeUpdate(sql);}
		                
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'cake' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='cake' ";
			            stmt.executeUpdate(sql);}
		                
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'ice cream' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='ice cream' ";
			            stmt.executeUpdate(sql);}
		                
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'sorbet' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='sorbet' ";
			            stmt.executeUpdate(sql);}
		                
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'brownie' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='brownie' ";
			            stmt.executeUpdate(sql);}
		                
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'cupcake' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='cupcake' ";
			            stmt.executeUpdate(sql);}
		                
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'salad' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='salad' ";
			            stmt.executeUpdate(sql);}
		                
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
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'salmon' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='salmon' ";
			            stmt.executeUpdate(sql);}
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(falafelCheckBox_1.isSelected()) {
			cfma(falafelCheckBox_1);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'falafel' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='falafel' ";
			            stmt.executeUpdate(sql);}
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(potatoesCheckBox_1.isSelected()) {
			cfma(potatoesCheckBox_1);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'potatoes' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='potatoes' ";
			            stmt.executeUpdate(sql);}
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(friesCheckBox_1.isSelected()) {
			cfma(friesCheckBox_1);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'fries' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='fries' ";
			            stmt.executeUpdate(sql);}
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(hummusCheckBox_1.isSelected()) {
			cfma(hummusCheckBox_1);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'hummus' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='hummus' ";
			            stmt.executeUpdate(sql);}
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(sorbetCheckBox_1.isSelected()) {
			cfma(sorbetCheckBox_1);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'sorbet' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='sorbet' ";
			            stmt.executeUpdate(sql);}
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(falafelCheckBox_1_1.isSelected()) {
			cfma(falafelCheckBox_1_1);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'falafel' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='falafel' ";
			            stmt.executeUpdate(sql);}
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(potatoesCheckBox_1_1.isSelected()) {
			cfma(potatoesCheckBox_1_1);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'potatoes' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='potatoes' ";
			            stmt.executeUpdate(sql);}
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(friesCheckBox_1_1.isSelected()) {
			cfma(friesCheckBox_1_1);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'fries' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='fries' ";
			            stmt.executeUpdate(sql);}
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(hummusCheckBox_1_1.isSelected()) {
			cfma(hummusCheckBox_1_1);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'hummus' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='hummus' ";
			            stmt.executeUpdate(sql);}
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(soupCheckBox_1.isSelected()) {
			cfma(soupCheckBox_1);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'soup' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='soup' ";
			            stmt.executeUpdate(sql);}
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(cookieCheckBox_1.isSelected()) {
			cfma(cookieCheckBox_1);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'cookie' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='cookie' ";
			            stmt.executeUpdate(sql);}
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(cakeCheckBox_1.isSelected()) {
			cfma(cakeCheckBox_1);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'cake' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='cake' ";
			            stmt.executeUpdate(sql);}
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(icecreamCheckBox_1.isSelected()) {
			cfma(icecreamCheckBox_1);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'ice cream' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='ice cream' ";
			            stmt.executeUpdate(sql);}
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(sorbetCheckBox_2.isSelected()) {
			cfma(sorbetCheckBox_2);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'sorbet' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='sorbet' ";
			            stmt.executeUpdate(sql);}
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(brownieCheckBox_1.isSelected()) {
			cfma(brownieCheckBox_1);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'brownie' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='brownie' ";
			            stmt.executeUpdate(sql);}
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		            
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(cupcakeCheckBox_1.isSelected()) {
			cfma(cupcakeCheckBox_1);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'cupcake' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='cupcake' ";
			            stmt.executeUpdate(sql);}
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(chickenCheckBox_1.isSelected()) {
			cfma(chickenCheckBox_1);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'chicken' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='chicken' ";
			            stmt.executeUpdate(sql);}
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(salmonCheckBox_1.isSelected()) {
			cfma(salmonCheckBox_1);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'salmon' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='salmon' ";
			            stmt.executeUpdate(sql);}
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(steakCheckBox_1.isSelected()) {
			cfma(steakCheckBox_1);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'steak' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='steak' ";
			            stmt.executeUpdate(sql);}
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(porkCheckBox_1.isSelected()) {
			cfma(porkCheckBox_1);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'pork' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='pork' ";
			            stmt.executeUpdate(sql);}
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(lambCheckBox_1.isSelected()) {
			cfma(lambCheckBox_1);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'lamb' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='lamb' ";
			            stmt.executeUpdate(sql);}
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		if(wingsCheckBox_1.isSelected()) {
			cfma(wingsCheckBox_1);
			 try {
		            Class.forName("com.mysql.jdbc.Driver");
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		            Statement stmt = con.createStatement();
		            ResultSet rs = stmt.executeQuery("Select * from mancare where nume= 'wings' ");
		            if(rs.next()) {
		            	a.setNume(rs.getString("nume"));
		            	a.setCantitate(rs.getInt("cantitate"));
		            	a.setPret(rs.getDouble("pret"));
		            	a.setCalorii(rs.getInt("calorii"));
		            	a.setProteine(rs.getInt("proteine"));
		            	a.setCarbohidrati(rs.getInt("carbohidrati"));
		            	a.setGrasimi(rs.getInt("grasimi"));
		            	a.setBucati(rs.getInt("bucati"));
		                if(a.getBucati() == 0) {
		                	String sql ="Update mancare set bucati = bucati + 5 where nume ='wings' ";
			            stmt.executeUpdate(sql);}
		                
		            } else {
		                JOptionPane.showMessageDialog(null, "error");
		               
		            }
		        } catch(Exception ea) {
		            System.out.println(ea);
		        }
		}
		
		
		
		if(e.getSource() == addButton) {
			modelDreapta.addElement(a.toStringO());
		
			lal.add(a.getNume());
			numarare = numarare +1;
				
			setSelectedF();
			setEnabledT();
			
			sumaTotal = sumaTotal + a.getPret();
			BigDecimal bd1 = new BigDecimal(sumaTotal).setScale(2, RoundingMode.HALF_UP);
		    double newInput2 = bd1.doubleValue();
			String a1 = Double.toString(newInput2);
			totalLabel.setText(a1);
			
			int x1 = (a.getCalorii()*a.getCantitate())/100;
			int x2 = (a.getProteine()*a.getCantitate())/100;
			int x3 = (a.getCarbohidrati()*a.getCantitate())/100;
			int x4 = (a.getGrasimi()*a.getCantitate())/100;
			
			sumaCalorii= sumaCalorii + x1;
			sumaProteine= sumaProteine + x2;
			sumaCarbo = sumaCarbo + x3;
			sumaGrasimi = sumaGrasimi + x4;
			String b1 = Integer.toString(sumaCalorii);
			String a2 = Integer.toString(sumaProteine);
			String a3 = Integer.toString(sumaCarbo);
			String a4 = Integer.toString(sumaGrasimi);
			
			calSumLabel.setText(b1);
			prtSumLabel.setText(a2);
			crbSumLabel.setText(a3);
			fatSumLabel.setText(a4);
			
		}
		
		if(e.getSource() == emptyButton) {
			modelDreapta.clear();
			sumaTotal = 0;
			totalLabel.setText("0.00");
			
			numarare=0;
			
			sumaCalorii = 0;
		    sumaProteine = 0;
		    sumaCarbo = 0;
		    sumaGrasimi = 0;
		    
		    calSumLabel.setText("0");
			prtSumLabel.setText("0");
			crbSumLabel.setText("0");
			fatSumLabel.setText("0");
			
			lal.clear();
			
		}
		
		if(e.getSource() == orderButton) {
			try {
				for(String i: lal){
				String nume = i;
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
	            Statement stmt = con.createStatement();
	            ResultSet rs = stmt.executeQuery("Select * from mancare where nume='"+nume+"'");
                if(rs.next()) {
                //JOptionPane.showMessageDialog(this,"Operation successful");
                String sql ="Update mancare set bucati = bucati - 1 where nume ='"+nume+"' ";
	            stmt.executeUpdate(sql);
                }
                else {
                	JOptionPane.showMessageDialog(this,"No more found!");
                	
                }}

	        } catch(Exception ea) {
	            System.out.println(ea);
	        }
			
			String str = totalLabel.getText();
			modelDreapta.clear();
			sumaTotal = 0;
			totalLabel.setText("0.00");
			
			numarare=0;
			
			sumaCalorii = 0;
		    sumaProteine = 0;
		    sumaCarbo = 0;
		    sumaGrasimi = 0;
		    
		    calSumLabel.setText("0");
			prtSumLabel.setText("0");
			crbSumLabel.setText("0");
			fatSumLabel.setText("0");
			
			lal.clear();
			
			PayPage frame = new PayPage();
			frame.my_update(str);
			frame.setVisible(true);
			dispose();
			
			}
		
		if(e.getSource() == caloriesCheckBox) {
			if (caloriesCheckBox.isSelected()) {
	              ascunde.setVisible(false);
	          } else {
	        	  ascunde.setVisible(true);
	          }
		}
		
		if(e.getSource() == backButton) {
			ChoosePage frame = new ChoosePage();
			frame.setVisible(true);
			dispose();
		}
		
		}
	}