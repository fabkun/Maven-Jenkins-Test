package com.ericsson.mavenproject1.test;
import com.ericsson.mavenproject1.config.configAIRConnParameters;
import javax.swing.JOptionPane;

/**
 *
 * @author fabian
 */
public class Mavenproject1 {
    public static void main(String[] args) {
         String newLine = System.getProperty("line.separator");
                String a = "Este es el texto de prueba. Todo Ok";
                 System.out.print(a + newLine);

                 
                 int option1 = Integer.parseInt( args[0]);
                 int option2 = Integer.parseInt( args[1]);

        
        	configAIRConnParameters cnf = new configAIRConnParameters();

//		String menu = "Choose one option: 1, 2, 3 o 4 \n";
//		for (int i = 1; i <= 4; i++) {
//			menu = menu + " option " + i + "\n";
//		}
                
		//int option1 = Integer.parseInt( JOptionPane.showInputDialog(menu));       
                
		switch (option1) {
		case 1:
//			JOptionPane.showMessageDialog(null,
//					"Congratulations, you have chosen option 1");
                                     System.out.print("Opción 1" + newLine);

                        cnf.AIRconnectionParameters(option2);
                        
			break;
		case 2:
//			JOptionPane.showMessageDialog(null,
//					"Congratulations, you have chosen option 2");
                                                         System.out.print("Opción 2" + newLine);

                                                cnf.AIRconnectionParameters(option2);

			break;
		case 3:
                                                         System.out.print("Opción 3" + newLine);			
                                                cnf.AIRconnectionParameters(option2);

			break;
		case 4:
                                                         System.out.print("Opción 4" + newLine);

//			JOptionPane.showMessageDialog(null,
//					"Congratulations, you have chosen option 4");
                                                cnf.AIRconnectionParameters(option2);

			break;
		default:
			JOptionPane.showMessageDialog(null, option1
					+ " is not a valid option");
			break;
		}
	}

}
