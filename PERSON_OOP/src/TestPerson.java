/**
 * 
 */
import java.util.Scanner;
/**
 * @author Dell
 *
 */
public class TestPerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputNid,inputFirstName,inputLastName,inputDoB;
		char inputGender;
		double inputHeight,inputWeight;
		
		Scanner myKey = new  Scanner(System.in);
		
		/* person 1*/
		
		Person p1 = new Person();
		System.out.println(p1);
		
		/* set first name and gender Person 1*/
		System.out.println("Enter first name of person 1:");
		inputFirstName = myKey.next();
		
		System.out.println("Enter Gender of person 1:");
		inputGender = myKey.next().charAt(0);
		
		p1.setFirstName(inputFirstName);
		p1.setGender(inputGender);
		
		System.out.println("first name of person 1 is: "+ p1.getFirstName());
		System.out.println("Gender of person 1 is: "+ p1.getGender());
		
		System.out.println("Full record of person 1: "+ p1.toString());
		
		/* date of birth person 1*/
		
		System.out.println("Enter date of birth of person 1:");
		inputDoB = myKey.next();
		
		p1.setDOB(inputDoB);
		
		System.out.println("Date of birth of person 1 is: "+ p1.getDOB());
		
		System.out.println("Full record of person 1: "+ p1.toString());
		
		/* Person 2*/
		
		Person p2 = new Person();
		
		System.out.println("Enter date of birth of person 2:");
		inputDoB = myKey.next();
		
		System.out.println("Enter weight of person 2:");
		inputWeight = myKey.nextDouble();
		
		p2.setDOB(inputDoB);
		p2.setWeight(inputWeight);
		
		System.out.println("Date of birth of person 2 is: "+ p2.getDOB());
		System.out.println("weight of person 2 is: "+ p2.getWeight());
		
		System.out.println("Full record of person 1: "+ p2.toString());
		
		/* Person 3*/
		
		Person p3 = new Person();
		
		System.out.println("enter Nid of the peron 3: ");
		inputNid = myKey.next();
		
		System.out.println("enter first name of the peron 3: ");
		inputFirstName = myKey.next();
		
		System.out.println("enter last name of the peron 3: ");
		inputLastName = myKey.next();
		
		System.out.println("enter date of birth of the peron 3: ");
		inputDoB = myKey.next();
		
		System.out.println("enter gender of the peron 3: ");
		inputGender = myKey.next().charAt(0);
		
		System.out.println("enter height of the peron 3: ");
		inputHeight = myKey.nextDouble();
		
		System.out.println("enter weight of the peron 3: ");
		inputWeight = myKey.nextDouble();
		
		p3.setNid(inputNid);
		p3.setFirstName(inputFirstName);
		p3.setLastName(inputLastName);
		p3.setDOB(inputDoB);
		p3.setGender(inputGender);
		p3.setHeight(inputHeight);
		p3.setWeight(inputWeight);
		
		System.out.println("Nid of person 3: "+ p3.getNid());
		System.out.println("first name of person 3: "+ p3.getFirstName());
		System.out.println("last nameof person 3: "+ p3.getLastName());
		System.out.println("date of birth of person 3: "+ p3.getDOB());
		System.out.println("gender of person 3: "+ p3.getGender());
		System.out.println("height of person 3: "+ p3.getHeight());
		System.out.println("weight of person 3: "+ p3.getWeight());
		
		System.out.println("Full record of person 3: "+ p3.toString());
		
		

	}

}
