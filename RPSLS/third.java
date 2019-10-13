package RPSLS;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class third extends second{

	public static void main(String[] args) {
		 second obj = new second();
		 
		 obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        Toolkit tk = Toolkit.getDefaultToolkit();
	        int xSize = ((int) tk.getScreenSize().getWidth());  
	        int ySize = ((int) tk.getScreenSize().getHeight());  
	        obj.setSize(xSize,ySize); 
	        obj.setVisible(true);

	}

}
