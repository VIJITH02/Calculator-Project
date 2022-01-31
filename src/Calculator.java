import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.FontUIResource;
import javax.swing.border.Border;
public class Calculator implements ActionListener {
	
	
	boolean button=false,allOperator=false,plusOperator=false,minusOperator=false,divisionOperator=false,multiplicationOperator=false;
	boolean percentageOperator=false;
	
	String oldValue;
	String newValue;
	String oldValue2;
	
	float oldValueF;
	float newValueF;
	float result;
	
	JFrame jf;
	JLabel displayLabel,displayLabel2;
	JButton seven;
	JButton eight;	
	JButton nine;
	JButton four;
	JButton five;
	JButton six;
	JButton one;
	JButton two;
	JButton three;
	JButton dot;
	JButton zero;
	JButton equals;
	JButton division;
	JButton multiplication;
	JButton minus;
	JButton plus;
	JButton clear;
	JButton plusorMinus;
	JButton percentage;
	JButton firstDigit;
	
	public Calculator() {
		
		//Setting Frame
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.getContentPane().setBackground(Color.BLACK);
		jf.setSize(385,650);
		jf.setLocation(300, 100);
		//Lock Frame
		jf.setResizable(false);	
		
		//Setting display 1 (Main Display)
		displayLabel=new JLabel();
		displayLabel.setBounds(0, 60, 370, 90);
		displayLabel.setBackground(Color.BLACK);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.WHITE);
		displayLabel.setFont(new Font("Ariel", Font.PLAIN, 70));
		jf.add(displayLabel);
		
		//Setting Display 2 (to show operation)
		displayLabel2=new JLabel();
		displayLabel2.setBounds(0, 0, 370, 59);
		displayLabel2.setBackground(Color.BLACK);
		displayLabel2.setOpaque(true);
		displayLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel2.setForeground(Color.WHITE);
		displayLabel2.setFont(new Font("Ariel", Font.PLAIN, 40));
		displayLabel2.setText("0");
		jf.add(displayLabel2);
		
		//Setting Clear Button
		clear=new JButton("AC");
		clear.setBounds(10,160,80,80);
		clear.setFont(new Font("Arial", Font.PLAIN, 30));
		clear.setForeground(Color.WHITE);
		clear.setBackground(Color.LIGHT_GRAY);
		clear.addActionListener(this);
		jf.add(clear);
		
		//Setting Plus or Minus Button
		plusorMinus=new JButton("+/-");
		plusorMinus.setBounds(100, 160, 80, 80);
		plusorMinus.setFont(new Font("Arial", Font.PLAIN, 30));
		plusorMinus.setForeground(Color.WHITE);
		plusorMinus.setBackground(Color.LIGHT_GRAY);
		plusorMinus.addActionListener(this);
		jf.add(plusorMinus);
		
		//Setting % Button
		percentage=new JButton("%");
		percentage.setBounds(190, 160, 80, 80);
		percentage.setFont(new Font("Arial", Font.PLAIN, 40));
		percentage.setForeground(Color.WHITE);
		percentage.setBackground(Color.LIGHT_GRAY);
		percentage.addActionListener(this);
		jf.add(percentage);
		
		//Setting Division Operation Button
		division=new JButton("/");
		division.setBounds(280, 160, 80, 80);
		division.setFont(new Font("Arial", Font.PLAIN, 40));
		division.setForeground(Color.WHITE);
		division.setBackground(Color.ORANGE);
		division.addActionListener(this);
		jf.add(division);
		
		//Setting 7 Button
		seven=new JButton("7");
		seven.setBounds(10, 250, 80, 80);
		seven.setFont(new Font("Arial", Font.PLAIN, 40));
		seven.setBackground(Color.GRAY);
		seven.setForeground(Color.WHITE);
		seven.addActionListener(this);
		jf.add(seven);
		
		//Setting 8 Button
		eight=new JButton("8");
		eight.setBounds(100, 250, 80, 80);
		eight.setFont(new Font("Arial", Font.PLAIN, 40));
		eight.setBackground(Color.GRAY);
		eight.setForeground(Color.WHITE);
		eight.addActionListener(this);
		jf.add(eight);
		
		//Setting 9 Button
		nine=new JButton("9");
		nine.setBounds(190, 250, 80, 80);
		nine.setFont(new Font("Arial", Font.PLAIN, 40));
		nine.setBackground(Color.GRAY);
		nine.setForeground(Color.WHITE);
		nine.addActionListener(this);
		jf.add(nine);
		
		//Setting Multiplication Operation Button
		multiplication=new JButton("*");
		multiplication.setBounds(280, 250, 80, 80);
		multiplication.setFont(new Font("Arial", Font.PLAIN, 40));
		multiplication.setForeground(Color.WHITE);
		multiplication.setBackground(Color.ORANGE);
		multiplication.addActionListener(this);
		jf.add(multiplication);
		
		//Setting 4 Button
		four=new JButton("4");
		four.setBounds(10, 340, 80, 80);
		four.setFont(new Font("Arial", Font.PLAIN, 40));
		four.setBackground(Color.GRAY);
		four.setForeground(Color.WHITE);
		four.addActionListener(this);
		jf.add(four);
		
		//Setting 5 Button
		five=new JButton("5");
		five.setBounds(100, 340, 80, 80);
		five.setFont(new Font("Arial", Font.PLAIN, 40));
		five.setBackground(Color.GRAY);
		five.setForeground(Color.WHITE);
		five.addActionListener(this);
		jf.add(five);
		
		//Setting 6 Button
		six=new JButton("6");
		six.setBounds(190, 340, 80, 80);
		six.setFont(new Font("Arial", Font.PLAIN, 40));
		six.setBackground(Color.GRAY);
		six.setForeground(Color.WHITE);
		six.addActionListener(this);
		jf.add(six);
		
		//Setting Subtraction Operation Button
		minus=new JButton("-");
		minus.setBounds(280, 340, 80, 80);
		minus.setFont(new Font("Arial", Font.PLAIN, 40));
		minus.setForeground(Color.WHITE);
		minus.setBackground(Color.ORANGE);
		minus.addActionListener(this);
		jf.add(minus);
		
		//Setting 1 Button
		one=new JButton("1");
		one.setBounds(10, 430, 80, 80);
		one.setFont(new Font("Arial", Font.PLAIN, 40));
		one.setBackground(Color.GRAY);
		one.setForeground(Color.WHITE);
		one.addActionListener(this);
		jf.add(one);
		
		//Setting 2 Button
		two=new JButton("2");
		two.setBounds(100, 430, 80, 80);
		two.setFont(new Font("Arial", Font.PLAIN, 40));
		two.setBackground(Color.GRAY);
		two.setForeground(Color.WHITE);
		two.addActionListener(this);
		jf.add(two);
		
		//Setting 3 Button
		three=new JButton("3");
		three.setBounds(190, 430, 80, 80);
		three.setFont(new Font("Arial", Font.PLAIN, 40));
		three.setBackground(Color.GRAY);
		three.setForeground(Color.WHITE);
		three.addActionListener(this);
		jf.add(three);
		
		//Setting Addition Button
		plus=new JButton("+");
		plus.setBounds(280, 430, 80, 80);
		plus.setForeground(Color.WHITE);
		plus.setBackground(Color.ORANGE);
		plus.addActionListener(this);
		jf.add(plus);
		
		//Setting 0 Button
		zero=new JButton("0");
		zero.setBounds(10, 520, 170, 80);
		zero.setFont(new Font("Arial", Font.PLAIN, 40));
		zero.setBackground(Color.GRAY);
		zero.setForeground(Color.WHITE);
		zero.addActionListener(this);
		jf.add(zero);
		
		//Setting . Button
		dot=new JButton(".");
		dot.setBounds(190, 520, 80, 80);
		dot.setFont(new Font("Arial", Font.PLAIN, 40));
		dot.setBackground(Color.GRAY);
		dot.setForeground(Color.WHITE);
		dot.addActionListener(this);
		jf.add(dot);
		
		//Setting Equals Operation Button
		equals=new JButton("=");
		equals.setBounds(280, 520, 80, 80);
		equals.setFont(new Font("Arial", Font.PLAIN, 40));
		equals.setForeground(Color.WHITE);
		equals.setBackground(Color.ORANGE);
		equals.addActionListener(this);
		jf.add(equals);   

	
		jf.setVisible(true);
		
		//Terminate While Closing the Application
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Setting Action Listener for 7 Button
		if(e.getSource()==seven) {
			
			oldValue2=displayLabel.getText();
			
			if(allOperator) {
				
				displayLabel.setText("7");
				allOperator=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
			
		//Setting Action Listener for 8 Button	
		}else if(e.getSource()==eight) {
			
			if(allOperator) {
				displayLabel.setText("8");
				allOperator=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
		
		//Setting Action Listener for 9 Button	
		}else if(e.getSource()==nine) {

			if(allOperator) {
				displayLabel.setText("9");
				allOperator=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
		
		//Setting Action Listener for 4 Button	
		}else if(e.getSource()==four) {

			if(allOperator) {
				displayLabel.setText("4");
				allOperator=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
		
		//Setting Action Listener for 5 Button	
		}else if(e.getSource()==five) {

			if(allOperator) {
				displayLabel.setText("5");
				allOperator=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
			
		//Setting Action Listener for 6 Button	
		}else if(e.getSource()==six) {

			if(allOperator) {
				displayLabel.setText("6");
				allOperator=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
		
			//Setting Action Listener for 1 Button
		}else if(e.getSource()==one){

			if(allOperator) {
				displayLabel.setText("1");
				allOperator=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
			
		//Setting Action Listener for 2 Button
		}else if(e.getSource()==two) {

			if(allOperator) {
				displayLabel.setText("2");
				allOperator=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
			
		//Setting Action Listener for 3 Button	
		}else if(e.getSource()==three) {
			
			if(allOperator) {
				displayLabel.setText("3");
				allOperator=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
			
		//Setting Action Listener for 0 Button	
		}else if(e.getSource()==zero) {
			
				if(allOperator) {
				displayLabel.setText("0");
				allOperator=false;
				}else {
				displayLabel.setText(displayLabel.getText()+"0");
				}	
			
		//Setting Action Listener for . Button	
		}else if(e.getSource()==dot) {
			
			if(allOperator) {
				displayLabel.setText(".");
				allOperator=false;
			}else {
				displayLabel.setText(displayLabel.getText()+".");
			}
			
			
		//Setting Action Listener for "+/-" Button
		}else if(e.getSource()==plusorMinus) {

			
			float negative=Float.parseFloat(displayLabel.getText().toString());
			negative *= -1;
			displayLabel.setText(String.valueOf(negative));
			
			
			
			
			
		 //Setting Action Listener for "=" Button
	}	 else if(e.getSource()==equals) {
		
	
			//Operation for Addition
			if(plusOperator) {
				newValue=displayLabel.getText();
				
				oldValueF=Float.parseFloat(oldValue);
				newValueF=Float.parseFloat(newValue);
			
				result=oldValueF+newValueF;
				
				displayLabel2.setText(oldValue+"+"+newValue);
				
				displayLabel.setText(result+"");
				plusOperator=false;
				
			
			//Operation for Subtraction	
			}else if(minusOperator) {
				newValue=displayLabel.getText();
				
				float oldValueF=Float.parseFloat(oldValue);
				float newValueF=Float.parseFloat(newValue);
			
				float result=oldValueF-newValueF;
				
				displayLabel2.setText(oldValue+"-"+newValue);
			
				displayLabel.setText(result+"");
				minusOperator=false;
				
			//Operation for Division
			}else if(divisionOperator) {
				newValue=displayLabel.getText();
				
				float oldValueF=Float.parseFloat(oldValue);
				float newValueF=Float.parseFloat(newValue);
			
				float result=oldValueF/newValueF;
			
				displayLabel2.setText(oldValue+"/"+newValue);
				
				displayLabel.setText(result+"");
				divisionOperator=false;
				
			//Operation for Multiplication
			}else if(multiplicationOperator) {
				
				newValue=displayLabel.getText();
				
				float oldValueF=Float.parseFloat(oldValue);
				float newValueF=Float.parseFloat(newValue);
			
				float result=oldValueF*newValueF;
			
				displayLabel2.setText(oldValue+"x"+newValue);
				
				displayLabel.setText(result+"");
				multiplicationOperator=false;
				
			//Operation for Percentage	
			}else if(percentageOperator) {
				newValue=displayLabel.getText();
				
				float oldValueF=Float.parseFloat(oldValue);
				float result=oldValueF/100;
				
				displayLabel.setText(result+"");
				percentageOperator=false;
				
			
				
			}
			
			
			
			
			
		//Setting Addition Button
		}else if(e.getSource()==plus) {
			
			allOperator=true;
			plusOperator=true;
			oldValue=displayLabel.getText();
			displayLabel2.setText(oldValue+"+");
		
		//Setting Subtraction Button	
		}else if(e.getSource()==minus) {
			allOperator=true;
			minusOperator=true;
			oldValue=displayLabel.getText();
			displayLabel2.setText(oldValue+"-");
		
		//Setting Division Button
		}else if(e.getSource()==division) {
			allOperator=true;
			divisionOperator=true;
			oldValue=displayLabel.getText();
			displayLabel2.setText(oldValue+"/");
		
		//Setting Multiplication Button
		}else if(e.getSource()==multiplication) {
			allOperator=true;
			multiplicationOperator=true;
			oldValue=displayLabel.getText();
			displayLabel2.setText(oldValue+"x");
			
			
		//Setting Clear Button
		}else if(e.getSource()==clear) {
			displayLabel.setText("");
			displayLabel2.setText("0");
			
		//Setting Percentage Button
		}else if(e.getSource()==percentage) {
			allOperator=true;
			percentageOperator=true;
			oldValue=displayLabel.getText();
			displayLabel2.setText(oldValue+"%");
			
			
		}
		
		
	}
	
		
}
