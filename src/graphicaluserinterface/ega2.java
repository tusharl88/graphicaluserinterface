package graphicaluserinterface;
import javax.swing.*;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.*;
public class ega2 {
public static void main(String [] args){
		
		JFrame frame  = new JFrame() ;
		frame.setVisible(true);             
	
	frame.setBounds(300,200,400,400);       // does combined work of location and size. first two are the values of location and then for size.
	
	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);     // closes our application.
	
	Container c = frame.getContentPane();
	c.setLayout(new FlowLayout());
	JLabel label = new JLabel("hi");
	label.setText("hello");
	c.add(label);
	label.setBounds(100,50,200,30);
	
	c.setBackground(Color.BLUE);
	
	
	frame.setResizable(false);
	
	}
	}



