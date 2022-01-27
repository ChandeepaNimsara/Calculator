package Calculators;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JButton NO7_Button;
	private JButton NO8_Button;
	private JButton NO9_Button;
	private JButton Minus_Button;
	private JButton NO4_Button;
	private JButton NO5_Button;
	private JButton NO6_Button;
	private JButton Multiple_Button;
	private JButton NO1_Button;
	private JButton NO2_Button;
	private JButton NO3_Button;
	private JButton Divide_Button;
	private JButton NO0_Button;
	private JButton Dot_Button;
	private JButton Delete_Button;
	private JButton Equal_Button;
	
	JLabel Sub_Display1;
	
	double firstcalnum;
	double secondcalnum;
	double result;
	String operations;
	String calanswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("CALCULATOR");
		frame.setBackground(Color.GRAY);
		frame.setResizable(false);           //  can't resize
		frame.getContentPane().setFont(new Font("Verdana", Font.PLAIN, 15));
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 277, 381);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Main_Display = new JLabel("0");
		Main_Display.setFont(new Font("Verdana", Font.PLAIN, 18));
		Main_Display.setForeground(Color.BLACK);
		Main_Display.setBackground(new Color(255, 255, 255));
		Main_Display.setHorizontalAlignment(SwingConstants.RIGHT);
		Main_Display.setBounds(20, 40, 220, 28);
		frame.getContentPane().add(Main_Display);
		
		Sub_Display1 = new JLabel("");
		Sub_Display1.setHorizontalAlignment(SwingConstants.LEFT);
		Sub_Display1.setForeground(Color.BLACK);
		Sub_Display1.setFont(new Font("Verdana", Font.PLAIN, 14));
		Sub_Display1.setBackground(new Color(0, 255, 255));
		Sub_Display1.setBounds(20, 11, 220, 28);
		frame.getContentPane().add(Sub_Display1);
		
		JPanel Main_Panel = new JPanel();
		Main_Panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Main_Panel.setBackground(Color.WHITE);
		Main_Panel.setBounds(10, 10, 240, 56);
		frame.getContentPane().add(Main_Panel);
		
		JPanel Key_Panel = new JPanel();
		Key_Panel.setBackground(Color.darkGray);
		Key_Panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		Key_Panel.setBounds(10, 76, 240, 255);
		Key_Panel.setLayout(null);
		frame.getContentPane().add(Key_Panel);
		
		// first key row
		
		JButton Clear_Button = new JButton("C");
		Clear_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Sub_Display1.setText("");
				Main_Display.setText("0");
			}
		});
		Clear_Button.setBackground(Color.GRAY);
		Clear_Button.setForeground(Color.WHITE);
		Clear_Button.setFont(new Font("Verdana", Font.BOLD, 20));
		Clear_Button.setBounds(5, 5, 55, 45);
		Clear_Button.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		Key_Panel.add(Clear_Button);
		
		JButton PlusORMinus_Button = new JButton("+/-");
		PlusORMinus_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				operations = "e";
				Sub_Display1.setText(Sub_Display1.getText() + operations);
			}
		});
		PlusORMinus_Button.setForeground(Color.WHITE);
		PlusORMinus_Button.setFont(new Font("Verdana", Font.BOLD, 20));
		PlusORMinus_Button.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		PlusORMinus_Button.setBackground(Color.GRAY);
		PlusORMinus_Button.setBounds(63, 5, 55, 45);
		Key_Panel.add(PlusORMinus_Button);
		
		JButton Precen_Button = new JButton("%");
		Precen_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                operations = "%";
				
				if(Main_Display.getText().equals("")||Main_Display.getText().equals("0")) {
					
					Sub_Display1.setText(Sub_Display1.getText() + operations);
				}
				else {
					Sub_Display1.setText(Main_Display.getText() + operations);
					Main_Display.setText("");
				}
			}
		});
		Precen_Button.setForeground(Color.WHITE);
		Precen_Button.setFont(new Font("Verdana", Font.BOLD, 20));
		Precen_Button.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		Precen_Button.setBackground(Color.GRAY);
		Precen_Button.setBounds(121, 5, 55, 45);
		Key_Panel.add(Precen_Button);
		
		JButton Plus_Button = new JButton("+");
		Plus_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				operations = "+";
				
				if(Main_Display.getText().equals("")||Main_Display.getText().equals("0")) {
					
					Sub_Display1.setText(Sub_Display1.getText() + operations);
				}
				else {
					Sub_Display1.setText(Main_Display.getText() + operations);
					Main_Display.setText("");
				}
			}
		});
		Plus_Button.setForeground(Color.WHITE);
		Plus_Button.setFont(new Font("Verdana", Font.BOLD, 20));
		Plus_Button.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		Plus_Button.setBackground(Color.LIGHT_GRAY);
		Plus_Button.setBounds(179, 5, 55, 45);
		Key_Panel.add(Plus_Button);
		
		// second key row
		
		JButton NO7_Button;
		NO7_Button = new JButton("7");
		NO7_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = Sub_Display1.getText() + NO7_Button.getText();
				Sub_Display1.setText(EnterNumber);
			}
		});
		NO7_Button.setBackground(Color.GRAY);
		NO7_Button.setForeground(Color.WHITE);
		NO7_Button.setFont(new Font("Verdana", Font.BOLD, 20));
		NO7_Button.setBounds(5, 55, 55, 45);
		NO7_Button.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		Key_Panel.add(NO7_Button);
		
		JButton NO8_Button;
		NO8_Button = new JButton("8");
		NO8_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = Sub_Display1.getText() + NO8_Button.getText();
				Sub_Display1.setText(EnterNumber);
			}
		});
		NO8_Button.setForeground(Color.WHITE);
		NO8_Button.setFont(new Font("Verdana", Font.BOLD, 20));
		NO8_Button.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		NO8_Button.setBackground(Color.GRAY);
		NO8_Button.setBounds(63, 55, 55, 45);
		Key_Panel.add(NO8_Button);
		
		JButton NO9_Button;
		NO9_Button = new JButton("9");
		NO9_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = Sub_Display1.getText() + NO9_Button.getText();
				Sub_Display1.setText(EnterNumber);
			}
		});
		NO9_Button.setForeground(Color.WHITE);
		NO9_Button.setFont(new Font("Verdana", Font.BOLD, 20));
		NO9_Button.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		NO9_Button.setBackground(Color.GRAY);
		NO9_Button.setBounds(121, 55, 55, 45);
		Key_Panel.add(NO9_Button);
		
		JButton Minus_Button;
		Minus_Button = new JButton("-");
		Minus_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
               operations = "-";
				
				if(Main_Display.getText().equals("")||Main_Display.getText().equals("0")) {
					
					Sub_Display1.setText(Sub_Display1.getText() + operations);
				}
				else {
					Sub_Display1.setText(Main_Display.getText() + operations);
					Main_Display.setText("");
				}
			}
		});
		Minus_Button.setForeground(Color.WHITE);
		Minus_Button.setFont(new Font("Verdana", Font.BOLD, 20));
		Minus_Button.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		Minus_Button.setBackground(Color.LIGHT_GRAY);
		Minus_Button.setBounds(179, 55, 55, 45);
		Key_Panel.add(Minus_Button);
		
		// third key row
		
		JButton NO4_Button;
		NO4_Button = new JButton("4");
		NO4_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = Sub_Display1.getText() + NO4_Button.getText();
				Sub_Display1.setText(EnterNumber);
			}
		});
		NO4_Button.setBackground(Color.GRAY);
		NO4_Button.setForeground(Color.WHITE);
		NO4_Button.setFont(new Font("Verdana", Font.BOLD, 20));
		NO4_Button.setBounds(5, 105, 55, 45);
		NO4_Button.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		Key_Panel.add(NO4_Button);
		
		JButton NO5_Button;
		NO5_Button = new JButton("5");
		NO5_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = Sub_Display1.getText() + NO5_Button.getText();
				Sub_Display1.setText(EnterNumber);
			}
		});
		NO5_Button.setForeground(Color.WHITE);
		NO5_Button.setFont(new Font("Verdana", Font.BOLD, 20));
		NO5_Button.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		NO5_Button.setBackground(Color.GRAY);
		NO5_Button.setBounds(63, 105, 55, 45);
		Key_Panel.add(NO5_Button);
		
		JButton NO6_Button;
		NO6_Button = new JButton("6");
		NO6_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = Sub_Display1.getText() + NO6_Button.getText();
				Sub_Display1.setText(EnterNumber);
			}
		});
		NO6_Button.setForeground(Color.WHITE);
		NO6_Button.setFont(new Font("Verdana", Font.BOLD, 20));
		NO6_Button.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		NO6_Button.setBackground(Color.GRAY);
		NO6_Button.setBounds(121, 105, 55, 45);
		Key_Panel.add(NO6_Button);
		
		JButton Multiple_Button;
		Multiple_Button = new JButton("x");
		Multiple_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                operations = "x";
				
				if(Main_Display.getText().equals("")||Main_Display.getText().equals("0")) {
					
					Sub_Display1.setText(Sub_Display1.getText() + operations);
				}
				else {
					Sub_Display1.setText(Main_Display.getText() + operations);
					Main_Display.setText("");
				}
			}
		});
		Multiple_Button.setForeground(Color.WHITE);
		Multiple_Button.setFont(new Font("Verdana", Font.BOLD, 20));
		Multiple_Button.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		Multiple_Button.setBackground(Color.LIGHT_GRAY);
		Multiple_Button.setBounds(179, 105, 55, 45);
		Key_Panel.add(Multiple_Button);
		
		// forth key row
		
		JButton NO1_Button;
		NO1_Button = new JButton("1");
		NO1_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = Sub_Display1.getText() + NO1_Button.getText();
				Sub_Display1.setText(EnterNumber);
			}
		});
		NO1_Button.setBackground(Color.GRAY);
		NO1_Button.setForeground(Color.WHITE);
		NO1_Button.setFont(new Font("Verdana", Font.BOLD, 20));
		NO1_Button.setBounds(5, 155, 55, 45);
		NO1_Button.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		Key_Panel.add(NO1_Button);
		
		JButton NO2_Button;
		NO2_Button = new JButton("2");
		NO2_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = Sub_Display1.getText() + NO2_Button.getText();
				Sub_Display1.setText(EnterNumber);
			}
		});
		NO2_Button.setForeground(Color.WHITE);
		NO2_Button.setFont(new Font("Verdana", Font.BOLD, 20));
		NO2_Button.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		NO2_Button.setBackground(Color.GRAY);
		NO2_Button.setBounds(63, 155, 55, 45);
		Key_Panel.add(NO2_Button);
		
		JButton NO3_Button;
		NO3_Button = new JButton("3");
		NO3_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = Sub_Display1.getText() + NO3_Button.getText();
				Sub_Display1.setText(EnterNumber);
			}
		});
		NO3_Button.setForeground(Color.WHITE);
		NO3_Button.setFont(new Font("Verdana", Font.BOLD, 20));
		NO3_Button.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		NO3_Button.setBackground(Color.GRAY);
		NO3_Button.setBounds(121, 155, 55, 45);
		Key_Panel.add(NO3_Button);
		
		JButton Divide_Button;
		Divide_Button = new JButton("/");
		Divide_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                operations = "/";
				
				if(Main_Display.getText().equals("")||Main_Display.getText().equals("0")) {
					
					Sub_Display1.setText(Sub_Display1.getText() + operations);
				}
				else {
					Sub_Display1.setText(Main_Display.getText() + operations);
					Main_Display.setText("");
				}
			}
		});
		Divide_Button.setForeground(Color.WHITE);
		Divide_Button.setFont(new Font("Verdana", Font.BOLD, 20));
		Divide_Button.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		Divide_Button.setBackground(Color.LIGHT_GRAY);
		Divide_Button.setBounds(179, 155, 55, 45);
		Key_Panel.add(Divide_Button);
		
		// fifth key row
		
		JButton NO0_Button;
		NO0_Button = new JButton("0");
		NO0_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = Sub_Display1.getText() + NO0_Button.getText();
				Sub_Display1.setText(EnterNumber);
			}
		});
		NO0_Button.setBackground(Color.GRAY);
		NO0_Button.setForeground(Color.WHITE);
		NO0_Button.setFont(new Font("Verdana", Font.BOLD, 20));
		NO0_Button.setBounds(5, 205, 55, 45);
		NO0_Button.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		Key_Panel.add(NO0_Button);
		
		JButton Dot_Button;
		Dot_Button = new JButton(".");
		Dot_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				operations = ".";
				Sub_Display1.setText(Sub_Display1.getText() + operations);
			}
		});
		Dot_Button.setForeground(Color.WHITE);
		Dot_Button.setFont(new Font("Verdana", Font.BOLD, 20));
		Dot_Button.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		Dot_Button.setBackground(Color.GRAY);
		Dot_Button.setBounds(63, 205, 55, 45);
		Key_Panel.add(Dot_Button);
		
		JButton Delete_Button;
		Delete_Button = new JButton("del");
		Delete_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				deleteEquation();
	
			}
		});
		Delete_Button.setForeground(Color.WHITE);
		Delete_Button.setFont(new Font("Verdana", Font.BOLD, 20));
		Delete_Button.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		Delete_Button.setBackground(Color.GRAY);
		Delete_Button.setBounds(121, 205, 55, 45);
		Key_Panel.add(Delete_Button);
		
		JButton Equal_Button;
		Equal_Button = new JButton("=");
		Equal_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String finalans;
				String strEq = Sub_Display1.getText();
		        double previousNumber, afterNumber;
		        char operation;
		        
		        previousNumber = getPreviousNumber(strEq.toCharArray());
		        afterNumber = getAfterNumber(strEq.toCharArray());
		        operation =strEq.toCharArray()[checkOperationPosition(strEq.toCharArray())];
  
		        finalans = doOperation(Character.toString(operation), previousNumber, afterNumber);
		        Main_Display.setText(finalans);
		             	
			}
		});
		Equal_Button.setForeground(Color.WHITE);
		Equal_Button.setFont(new Font("Verdana", Font.BOLD, 20));
		Equal_Button.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		Equal_Button.setBackground(Color.GRAY);
		Equal_Button.setBounds(179, 205, 55, 45);
		Key_Panel.add(Equal_Button);
		
	}
	
	//check weather number or not
	
	public static boolean checkNumbers(char c){
        try{
            char[] numbers = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.'};
            for(int a = 0; a < numbers.length; a++){
                if(numbers[a] == c){
                    return true;
                }
            }
        }catch (NumberFormatException e){
            return false;
        }
        return false;
    }
	
	// operation position
	
	public static int checkOperationPosition(char[] array){
        int j, pos = 0;
        for(j = 0; j < array.length; j++){
            if(!checkNumbers(array[j])){
                pos = j;
            }
        }
        return pos;
    }
	
	//get previous number
	
	public static double getPreviousNumber(char[] arr){
        String str = "";
        for(int a = 0; a < checkOperationPosition(arr); a++){
            str += Character.toString(arr[a]);
        }
        double preNo = Double.parseDouble(str);
        return preNo;
    }

	//get after number
	
	public static double getAfterNumber(char[] arr){
		double afterNo ;
        String str = "";
        for(int a = checkOperationPosition(arr) + 1; a < arr.length; a++){
            str += Character.toString(arr[a]);
        }
        
        if(arr[checkOperationPosition(arr)]=='%') {
        	afterNo = 1;
        }
        else {
        	afterNo = Double.parseDouble(str);
        }
        
        return afterNo;
    }

	// calculation part
	
	public static String doOperation(String c, double previous, double after){
        String ans; double a = 0;
        switch(c){
            case "+":
                a = previous + after;
                break;
            case "-":
                a = previous - after;
                break;
            case "x":
                a = previous * after;
                break;
            case "/":
            	
            	try {
            		a = previous / after;
            	}
            	catch(ArithmeticException e) {
            		JOptionPane.showMessageDialog(null,"Dividing number by zero is meaningless...","Divide by zero",JOptionPane.INFORMATION_MESSAGE);
            	}
                break;
            case "%":
                a = previous / 100;
                break;
            default:
            	JOptionPane.showMessageDialog(null,"Your operator is wrong...","Input Error!",JOptionPane.WARNING_MESSAGE);
                return "Your operator is wrong...";
               
        }

        ans = String.format("%.4f", a);
        return ans;
    }
	
	// delete button
	
	public void deleteEquation() {
		
		String currentEquation = Sub_Display1.getText();
		ArrayList<Character> eqChar = new ArrayList<Character>();
		String finalEquation = "";
		
		try {
			
			for (char c: currentEquation.toCharArray()) {
				
				eqChar.add(c);
			}
			
			eqChar.remove(eqChar.size() - 1);
			
			for(char f: eqChar) {
				 finalEquation += Character.toString(f);
			}
		}
		catch(IndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null,"Your equation is empty...","Can not delete!",JOptionPane.INFORMATION_MESSAGE);
		}
		
		Sub_Display1.setText(finalEquation);
	}
	
}
