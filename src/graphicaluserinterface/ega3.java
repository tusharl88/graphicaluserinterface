package graphicaluserinterface;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class ega3 {
public static void main(String [] args){
		
		JFrame frame  = new JFrame() ;
		frame.setVisible(true);             
	
	frame.setBounds(300,200,400,400);       // does combined work of location and size. first two are the values of location and then for size.
	
	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);     // closes our application.
	
	try {
        URL resource = frame.getClass().getResource("hole.png");
        BufferedImage image = ImageIO.read(resource);
        frame.setIconImage(image);
    } catch (IOException e) {
        e.printStackTrace();
    }
	
	}

}
