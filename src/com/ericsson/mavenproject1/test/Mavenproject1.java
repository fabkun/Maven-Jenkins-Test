package com.ericsson.mavenproject1.test;
import com.ericsson.mavenproject1.config.configAIRConnParameters;
import javax.swing.JOptionPane;

/**
 *
 * @author fabian
 */
public class Mavenproject1 {
    public static void main(String[] args) {
	    String a = "Este es el texto de prueba. Todo Ok";
                 System.out.print(a);
        
        	configAIRConnParameters cnf = new configAIRConnParameters();

		String menu = "Choose one option: 1, 2, 3 o 4 \n";
		for (int i = 1; i <= 4; i++) {
			menu = menu + " option " + i + "\n";
		}
                
		int option1 = Integer.parseInt( JOptionPane.showInputDialog(menu));       
                
		switch (option1) {
		case 1:
			JOptionPane.showMessageDialog(null,
					"Congratulations, you have chosen option 1");
                        cnf.AIRconnectionParameters();
                        
			break;
		case 2:
			JOptionPane.showMessageDialog(null,
					"Congratulations, you have chosen option 2");
                                                cnf.AIRconnectionParameters();

			break;
		case 3:
			JOptionPane.showMessageDialog(null,
					"Congratulations, you have chosen option 3");
                                                cnf.AIRconnectionParameters();

			break;
		case 4:
			JOptionPane.showMessageDialog(null,
					"Congratulations, you have chosen option 4");
                                                cnf.AIRconnectionParameters();

			break;
		default:
			JOptionPane.showMessageDialog(null, option1
					+ " is not a valid option");
			break;
		}
	}

}
