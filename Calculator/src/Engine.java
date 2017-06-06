import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class Engine implements ActionListener {
	
	Calculator parent;
	
	char selectedAction = ' ';
	double currentResult = 0;
	
	Engine(Calculator parent){
		this.parent = parent;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		JButton click = (JButton)e.getSource();
		
		String dispFieldText= parent.display.getText();
		
		double displayValue = 0;
		if(!"".equals(dispFieldText)){
			
			displayValue = Double.parseDouble(dispFieldText);
		}
		
		Object src = e.getSource();
		
		if(src == parent.buttonPlus){
			
			selectedAction = '+';
			currentResult = displayValue;
			parent.display.setText("");
			
		} else if (src == parent.buttonMinus){
			
			selectedAction = '-';
			currentResult = displayValue;
			parent.display.setText("");
		} else if (src == parent.buttonMulti){
			
			selectedAction = '*';
			currentResult = displayValue;
			parent.display.setText("");
		} else if (src == parent.buttonDivide){
			
			selectedAction = '/';
			currentResult = displayValue;
			parent.display.setText("");
		} else if (src == parent.clear){
			
			selectedAction = ' ';
			currentResult = 0;
			parent.display.setText("");
		} else if (src == parent.buttonEqual) {
			if (selectedAction == '+'){
				currentResult += displayValue;
				parent.display.setText("" + currentResult);
			} else if (selectedAction == '-'){
				currentResult -= displayValue;
				parent.display.setText("" + currentResult);
			} else if (selectedAction == '*'){
				currentResult *= displayValue;
				parent.display.setText("" + currentResult);
			} else if (selectedAction == '/'){
				currentResult /= displayValue;
				parent.display.setText("" + currentResult);
			}
		} else {
			String clickedButtonLabel = click.getText();
			parent.display.setText(dispFieldText + clickedButtonLabel);
		}
	}
}
