
import javax.swing.*;
import java.awt.GridLayout;

public class SimpleGrid {

	public static void main(String[] args) {
		
		JPanel windowContent = new JPanel();
		
		GridLayout f1 = new GridLayout(4, 2);
		windowContent.setLayout(f1);
		
		JLabel label1 = new JLabel("1st number : ");
		JTextField field1 = new JTextField (10);
		
		JLabel label2 = new JLabel("2nd number : ");
		JTextField field2 = new JTextField(10); 
		
		JLabel label3 = new JLabel("result : ");
		JTextField field3 = new JTextField(10); 
		
		JButton go = new JButton("Add");
		
		windowContent.add(label1);
		windowContent.add(field1);
		windowContent.add(label2);
		windowContent.add(field2);
		windowContent.add(label3);
		windowContent.add(field3);
		windowContent.add(go);
		
		JFrame frame = new JFrame("SimpleGrid Calculator");
		frame.setContentPane(windowContent);
		
		frame.setSize(400, 100);
		frame.setVisible(true);
	}

}