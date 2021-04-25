
import java.util.Scanner;

public class method1 {
	
	

	public static void main(String[] args) 
	{
		
		Scanner mykey = new Scanner(System.in);
		int x,y,sum;
		
		System.out.println("Sum of two numbers");
		
		System.out.print("Enter Num1: ");
		x = mykey.nextInt();
		
		System.out.print("Enter Num2: ");
		y = mykey.nextInt();
		
		sum = sumInt(x,y);
		System.out.print("Sum: " + sum);
		
		mykey.close();
		
		
		
	}
	
	public static int sumInt(int num1, int num2) 
	{
		int sum = num1 + num2;
				
				return sum;
				
	
	}

}
