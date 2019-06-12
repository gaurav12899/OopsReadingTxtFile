package first;
import javax.swing.*;

public class proj1 {
	public static void main(String[] args)
	{
		double count=0;
		String ans;
	ans=JOptionPane.showInputDialog("who is the prime minister of india \n A.Narender Modi \n B.Rahul Gandhi \n C.Amit shah");
	if(ans.equalsIgnoreCase("A"))
	{
		System.out.println("Correct answer");
		count++;
	}	
	else {
		System.out.println("Incorrect answer");
	}
	
	
	

 ans=JOptionPane.showInputDialog("which batsman has the most no. of internatinal centuries \n A.Brian lara \n B.Sachin Tendulkar \n C.Virat kohli");
if(ans.equalsIgnoreCase("b"))
{
	System.out.println("Correct answer");
	count++;
}
else {
	System.out.println("Incorrect answer");
}




ans=JOptionPane.showInputDialog("who is the president of America \n A.Narender Modi \n B.Barack Obama \n C.Donald Trump");
if(ans.equalsIgnoreCase("C"))
{
	System.out.println("Correct answer");
	count++;
}
else {
	System.out.println("Incorrect answer");
}

	
	

ans=JOptionPane.showInputDialog("5*8 \n A.40 \n B.20 \n C.30");
if(ans.equalsIgnoreCase("A"))
{
	System.out.println("Correct answer");
	count++;
}
else {
	System.out.println("Incorrect answer");
}
System.out.println("winning percentage="+(count/4)*100+"%");
	}

}
