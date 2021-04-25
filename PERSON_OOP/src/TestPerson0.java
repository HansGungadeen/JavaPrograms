
import java.util.Scanner;

public class TestPerson0 {
	
	public static void main(String[] args) 
	{
		String inputNid,inputFirstName,inputLastName,inputDoB;
		char inputGender;
		double inputHeight,inputWeight;
		
		Scanner myKey = new  Scanner(System.in);
		
		/*
		Person p1 = new Person();
		System.out.println(p1);
		
		System.out.println("Enter first name of person 1:");
		inputFirstName = myKey.next();
		p1.setFirstName(inputFirstName);
		
		System.out.println("Enter Gender of person 1:");
		inputGender = myKey.next().charAt(0);
		p1.setGender(inputGender);
		
		System.out.println("Enter date of birth of person 1:");
		inputDoB = myKey.next();
		p1.setdob(inputDoB);
		
		System.out.println("");
		System.out.println("*****************************************");
		System.out.println("First name of person 1 is: "+ p1.getfirstName());
		System.out.println("Gender of person 1 is: "+ p1.getGender());
		System.out.println("Date of birth of person 1 is: "+ p1.getDob());
		System.out.println("Full record of person 1: "+ p1.toString());
		System.out.println("*****************************************");
		System.out.println("");
		
		
		Person p2 = new Person();
		
		System.out.println("Enter date of birth of person 2:");
		inputDoB = myKey.next();
		p2.setdob(inputDoB);
		
		System.out.println("Enter weight of person 2:");
		inputWeight = myKey.nextDouble();
		p2.setWeight(inputWeight);
		
		System.out.println("");
		System.out.println("*****************************************");
		System.out.println("Date of birth of person 2 is: "+ p2.getDob());
		System.out.println("weight of person 2 is: "+ p2.getWeight());
		System.out.println("Full record of person 1: "+ p2.toString());
		
		System.out.println("*****************************************");
		System.out.println("");
		
		
		Person p3 = new Person();
		
		System.out.println("enter Nid of the person 3: ");
		inputNid = myKey.next();
		System.out.println("enter first name of the person 3: ");
		inputFirstName = myKey.next();
		System.out.println("enter last name of the person 3: ");
		inputLastName = myKey.next();
		System.out.println("enter date of birth of the person 3: ");
		inputDoB = myKey.next();
		System.out.println("enter gender of the person 3: ");
		inputGender = myKey.next().charAt(0);
		System.out.println("enter height of the person 3: ");
		inputHeight = myKey.nextDouble();
		System.out.println("enter weight of the person 3: ");
		inputWeight = myKey.nextDouble();
		
		p3.setNid(inputNid);
		p3.setFirstName(inputFirstName);
		p3.setLastName(inputLastName);
		p3.setdob(inputDoB);
		p3.setGender(inputGender);
		p3.setHeight(inputHeight);
		p3.setWeight(inputWeight);
		
		System.out.println("");
		System.out.println("*****************************************");
		
		System.out.println("Nid of person 3: "+ p3.getNid());
		System.out.println("first name of person 3: "+ p3.getfirstName());
		System.out.println("last nameof person 3: "+ p3.getlastName());
		System.out.println("date of birth of person 3: "+ p3.getDob());
		System.out.println("gender of person 3: "+ p3.getGender());
		System.out.println("height of person 3: "+ p3.getHeight());
		System.out.println("weight of person 3: "+ p3.getWeight());
		
		System.out.println("Full record of person 3: "+ p3.toString());
		
		System.out.println("*****************************************");
		System.out.println("");
		*/
		//////////////////////////////////////////////////////////////////
		
		
		int i;
		System.out.print("How many students are present in the class?");
		i=myKey.nextInt();
		
		Person[] classroom = new Person[i];

		for( i = 0 ; i<classroom.length; i++)
		{
			System.out.println("Enter details of Person " + (i+1) );
			
			System.out.println("Enter Nid for Student");
			inputNid=myKey.next();
			
			System.out.println("Enter firstName for Student");
			inputFirstName=myKey.next();
			System.out.println("Enter lastName for Student");
			inputLastName=myKey.next();
			System.out.println("Enter Dob for Student");
			inputDoB=myKey.next();
			System.out.println("Enter Gender for Student");
			inputGender=myKey.next().charAt(0);
			System.out.println("Enter Height for Student");
			inputHeight=myKey.nextDouble();
			System.out.println("Enter Weight for Student");
			inputWeight=myKey.nextDouble();
			
			classroom[i]= new Person(inputNid,inputFirstName,inputLastName,inputDoB,inputGender,inputHeight,inputWeight);
		}
		
		for (int k = 0; i<5; i++)
		{
			System.out.println("BMI of Person" + (i+1) + ":");
			classroom[k].calculateBmi();
			System.out.println("BMI :" +k);
		}
		
		myKey.close();
			
	}
	
	
	
	
}
