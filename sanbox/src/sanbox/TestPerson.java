package sanbox;

import java.util.Scanner;

public class TestPerson
{
	
	public static void main(String[] args) 
	{
		
		String nid, name;
		char gender;
		int height, weight;
		
		Scanner mykey = new Scanner(System.in);
		
		int i = 5; 
		
		
		Person[] person = new Person[i];
		
		for (i = 0 ; i<5 ; i++)
		{
			System.out.println("Enter details of 5 persons " + ( i++) );
			
			
			System.out.println("Enter National ID number: ");
			nid = mykey.next();
			
			System.out.println("Enter Name: ");
			name = mykey.next();
			
			System.out.println("Enter Gender: ");
			gender = mykey.next().charAt(0);
			
			
			System.out.println("Enter Height(cm): ");
			height = mykey.nextInt();
			
			
			System.out.println("Enter Weight(g): ");
			weight = mykey.nextInt();
			
			
			person[i] = new Person(nid, name, gender, height, weight);
		}
		
		for (int k = 0; i < 5; i ++)
		{
			System.out.println("Name: ");
			System.out.println(person[k].getName());
			System.out.println("BMI:  ");
			System.out.println(person[k].calculateBMI());
		}
			
		mykey.close();

		
	}
	
	

}
