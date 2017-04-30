package graphicaluserinterface;

import javax.swing.*;

public class eg1 {
	public static void main(String [] args){
		
		JFrame frame  = new JFrame() ;
		frame.setVisible(true);             // if we write false then frame is not displayed on screen.
	
	//frame.setSize(700,500);
	//frame.setLocation(400,0);
	
	frame.setBounds(300,200,400,400);       // does combined work of location and size. first two are the values of location and then for size.
	
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	
// we can also use-	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);     // closes our application.
	}
	}

