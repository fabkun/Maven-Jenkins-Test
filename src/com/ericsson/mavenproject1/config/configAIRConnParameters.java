package com.ericsson.mavenproject1.config;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fabian
 */
public class configAIRConnParameters {
    
        public void AIRconnectionParameters( Integer option2) {       
                             
         String newLine = System.getProperty("line.separator");

            
            
            //String menu = new String("Choose one option 1.2 : 1.2, 2.2, 3.2 o 4.2 \n");
		//for (int i = 1; i <= 4; i++) {
		//	menu = menu + " option " + i + "\n";
		//}
                //int option2 = Integer.parseInt( JOptionPane.showInputDialog(menu));       

		switch (option2) {
		case 1:
//			JOptionPane.showMessageDialog(null,
//					"Congratulations, you have chosen option 1.2");
                                                             System.out.print("Opción 1,2" + newLine);

                        
			break;
		case 2:
//			JOptionPane.showMessageDialog(null,
//					"Congratulations, you have chosen option 2.2");
                            System.out.print("Opción 2,2" + newLine);

			break;
		case 3:
//			JOptionPane.showMessageDialog(null,
//					"Congratulations, you have chosen option 3.2");
                                                    System.out.print("Opción 3,2" + newLine);

			break;
		case 4:
//			JOptionPane.showMessageDialog(null,
//					"Congratulations, you have chosen option 4.2");
                                                    System.out.print("Opción 4,2" + newLine);

			break;
		default:
			JOptionPane.showMessageDialog(null, option2
					+ " is not a valid option");
			break;
		}
            
            
            
            
            
            
        
        }
}
