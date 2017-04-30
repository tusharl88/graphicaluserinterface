package graphicaluserinterface;
import javax.swing.JOptionPane;
public class gui {
	public static void main(String args[])
	{
	String fn= JOptionPane.showInputDialog("enter first number");
	String sn= JOptionPane.showInputDialog("enter second number");

long num1 =Integer.parseInt(fn);  // Integer.parseInt() converts string into integer.
long num2 =Integer.parseInt(fn);
long sum= num1+ num2;

JOptionPane.showMessageDialog(null,"the  answer is"+sum,"hello title", JOptionPane.PLAIN_MESSAGE);
	}
}
