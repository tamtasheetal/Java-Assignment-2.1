
import java.util.*;
 
public class GreatestNumber
{
	public static void main (String[]args)
	{
	int x,y,z,largest;
	Scanner s = new Scanner(System.in);
	// To recive input from keyboard
	System.out.println("Enter any three numbers: ");
	x=s.nextInt();
	y=s.nextInt();
	z=s.nextInt();
	//Using if statement.
	if(x>=y && x>=z) 
	{
	System.out.println("Largest number: "+x);
	}
	if(y>=x && y>=z) 
	{
	System.out.println("Largest number: "+y);
	}
	if(z>=x && z>=y) 
	{
	System.out.println("Largest number: "+z);
	}
	}
	}