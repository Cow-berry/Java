import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Calculator {
	JButton clear;
	
	JPanel windowContent;
	JTextField display;
	JButton buttonPoint;
	JButton buttonEqual;
	JButton buttonPlus;
	JButton buttonMinus;
	JButton buttonMulti;
	JButton buttonDivide;
	JPanel p1;
	JPanel p2;
	Calculator() {
		windowContent = new JPanel();
		
		BorderLayout bl = new BorderLayout();
		windowContent.setLayout(bl);
		
		display = new JTextField(30);
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		windowContent.add("North", display);
		
		JButton[] numButtons = new JButton[10];
		clear = new JButton("clear");
		windowContent.add("West", clear);
		
		buttonPoint = new JButton(".");
		buttonEqual = new JButton("=");
		buttonPlus = new JButton("+");
		buttonMinus = new JButton("-");
		buttonMulti = new JButton("*");
		buttonDivide = new JButton("/");
		
		p1 = new JPanel();
		GridLayout gl = new GridLayout (4, 3);
		p1.setLayout(gl);
		
		
		for (int count=0; count<10; count++){
			numButtons[count] = new JButton("" + count);
			p1.add(numButtons[count]);
		}
		
		p1.add(buttonPoint);
		p1.add(buttonEqual);
		
		p2 = new JPanel();
		GridLayout gl2 = new GridLayout(4, 1);
		p2.setLayout(gl2);
		
		p2.add(buttonPlus);
		p2.add(buttonMinus);
		p2.add(buttonMulti);
		p2.add(buttonDivide);
		
		windowContent.add("Center", p1);
		windowContent.add("East", p2);
		
		JFrame frame = new JFrame("Calculator");
		frame.setContentPane(windowContent);
		
		frame.pack();
		
		frame.setVisible(true);
		
		Engine calcEngine = new Engine(this);
		
		for (int count = 0; count<10; count++){
			numButtons[count].addActionListener(calcEngine);
		}
		
		buttonPoint.addActionListener(calcEngine);
		buttonMinus.addActionListener(calcEngine);
		buttonPlus.addActionListener(calcEngine);
		buttonMulti.addActionListener(calcEngine);
		buttonDivide.addActionListener(calcEngine);
		buttonEqual.addActionListener(calcEngine);
		clear.addActionListener(calcEngine);
		
		
	}

	public static void main (String[] args) {
		Calculator calc = new Calculator();
	}
}
