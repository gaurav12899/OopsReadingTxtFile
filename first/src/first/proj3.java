package first;
import javax.swing.*;
public class proj3 {
	public static void main(String[] args)
	{
		String full_name=JOptionPane.showInputDialog("Enter your full name");
		String first_name=full_name.substring(0,full_name.indexOf(' '));
		String middle_name=full_name.substring(full_name.indexOf(' ')+1,full_name.lastIndexOf(' '));
		String last_name=full_name.substring(full_name.lastIndexOf(' ')+1);
		System.out.println("First name:"+first_name);
		System.out.println("Middle name:"+middle_name);
		System.out.println("Last name:"+last_name);
		System.out.println("Full name:"+first_name+" "+middle_name.charAt(0)+". "+last_name);
		
	}

}
