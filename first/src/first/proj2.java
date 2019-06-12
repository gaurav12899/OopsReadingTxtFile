package first;
import javax.swing.*;
public class proj2 { 
	public static void main(String[] args)
	{
		String name ="", last="",first="",second="",temp="ZZZ";
		int age=0;
		for(int i=0;i<2;i++)
			{
				while(age<18)
					{
						name=JOptionPane.showInputDialog("enter the first name").toUpperCase();
						last=JOptionPane.showInputDialog("enter the second name").toUpperCase();
						age=Integer.parseInt(JOptionPane.showInputDialog("enter the age "));
					}
					if(temp.compareTo(last)>0)
						{
							temp=last;
							second=first;
							first=name.charAt(0)+"."+last+"\n"+age;
						}
					else
						{
							second=name.charAt(0)+"."+last+"\n"+age;
						}
					age=0;
		}
		System.out.println(first+"\n"+second);

	
	}
}