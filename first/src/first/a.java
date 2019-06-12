package first;
import javax.swing.*;

public class a {
	public static void main(String[] args) {
	
	String word=JOptionPane.showInputDialog("Enter a Word");
	
	while(!(word.equalsIgnoreCase("stop"))){
	System.out.println(word);
	word=JOptionPane.showInputDialog("Enter a Word");
	}
	
	}
}
