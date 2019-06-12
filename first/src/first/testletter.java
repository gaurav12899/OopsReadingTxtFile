package first;

import javax.swing.*;

public class testletter {
	public static void main(String[] args) {
		
	char ch = JOptionPane.showInputDialog("Enter a char,letter or integer ").charAt(0);
	boolean test= Character.isLetter(ch);
	System.out.println(test);
	if (test==true) {
		System.out.println(ch+",is a letter");
	}
	else {
		System.out.println(ch+",is not a letter");
	}
}
}