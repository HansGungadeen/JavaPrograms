/**
 * 
 */

/**
 * @author IOT
 *
 */
public abstract class Person 
{
	
	private String nid;
	private String name;
	private double height;
	private double weight;

	
	public Person() 
	{
		super();
	}
	
	
	
	/*Constructors*/
	/**
	 * overloaded 4 parameters constructors
	 * @param nid
	 * @param name
	 * @param height
	 * @param weight
	 */
	
	public Person(String nid, String name, double height, double weight) 
	{
		super();
		this.nid = nid;
		this.name = name;
		this.height = height;
		this.weight = weight;	
	}
	
	
	/**
	 * Getters and setters
	 *
	 */
	
	public String getNid() 
	{
		return nid;
	}


	public String getName() 
	{
		return name;
	}


	public double getHeight() 
	{
		return height;
	}


	public double getWeight() 
	{
		return weight;
	}


	public void setNid(String nid) 
	{
		this.nid = nid;
	}


	public void setName(String name) 
	{
		this.name = name;
	}


	public void setHeight(double height) 
	{
		this.height = height;
	}


	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	
	/**
	 * Calculate BMI of person
	 * @return
	 */
	public double calculateBmi()
	{
		return(this.weight/(Math.pow(height/100, 2)));
	}
	
	//equals
	
	public boolean equals(Person p)
	{
		if(this.nid.equalsIgnoreCase(p.nid))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public abstract String toString();
	
	/**
	 * calculate salary of a Person hoursWorked * rate
	 * @param hoursWorked of a person
	 * @param rate of a person
	 * @return salary of a person
	 */
	public abstract double calculateSalary(double hoursWorked, double rate);
}
