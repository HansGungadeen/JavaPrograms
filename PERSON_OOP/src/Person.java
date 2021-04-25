
//import java.math.*;

public class Person {
	
	/*attributes*/
	private String nid;
	private String firstName;
	private String lastName;
	private String dob;
	private char gender;
	private double height;
	private double weight;
	
	/*constructors*/
	
	/**
	 * Default Constructor
	 */
	
	public Person()
	{
		this.nid=null;
		this.firstName=null;
		this.lastName=null;
		this.dob=null;
		this.gender='_';
		this.height=0.0;
		this.weight=0.0;
	}
	
	/**
	 * overloaded 2 parameter constructor
	 * @param dob of person
	 * @param weight of person
	 */
	
	public Person(String dob, double weight)
	{
		
		this.dob=dob;
		this.weight=weight;
		
		this.nid=null;
		this.firstName=null;
		this.lastName=null;
		this.gender='_';
		this.height=0.0;
	}
	
	/**
	 * Overloaded 7 para constructors
	 * @param nid of person
	 * @param firstName of person
	 * @param laastName of person
	 * @param dob of person
	 * @param gender of person
	 * @param height of person
	 * @param weight of person
	 */
	
	public Person(String nid, String firstName, String lastName, String dob, char gender, double height, double weight)
	{
		this.nid=nid;
		this.firstName=firstName;
		this.lastName=lastName;
		this.dob=dob;
		this.gender=gender;
		this.height=height;
		this.weight=weight;
	}
	
	/**
	 * method to return first name and last name of a person
	 * @return full name of a person
	 */
	public String getName()
	{
		return this.firstName + " " + this.lastName; 
	}
	
	/**
	 * 
	 * @return the bmi of a person
	 */
	public double calculateBmi()
	{
		return(this.weight/(Math.pow(this.height, 2)));
	}
	
	/**
	 * 
	 * @return the nid of a person
	 */
	public String getNid()
	{
		return this.nid;
	}
	
	/**
	 * 
	 * @return the first name of a person
	 */
	public String getfirstName()
	{
		return this.firstName;
	}
	
	/**
	 * 
	 * @return the last name of a person
	 */
	public String getlastName()
	{
		return this.lastName;
	}
	
	/**
	 * 
	 * @return the dob of a person
	 */
	public String getDob()
	{
		return this.dob;
	}

	/**
	 * 
	 * @return the gender of a person
	 */
	public char getGender()
	{
		return this.gender;
	}
	
	/**
	 * 
	 * @return the height of a person
	 */
	public double getHeight()
	{
		return this.height;
	}
	
	/**
	 * 
	 * @return the weight of a person
	 */
	public double getWeight()
	{
		return this.weight;
	}
	

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public void setdob(String dob)
	{
		this.dob = dob;
	}
	
	public void setGender(char gender)
	{
		this.gender = gender;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}
	
	
	public void setNid(String nid)
	{
		this.nid = nid;
	}


}
