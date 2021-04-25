package sanbox;

public class Person 
{
	
	private String nid;
	private String name;
	private char gender;
	private int height;
	private int weight;
	
	
	public Person(String nid, String name, char gender, int height, int weight)
	{
		this.nid = nid;
		this.name = name;
		this.gender=gender;
		this.height=height;
		this.weight=weight;
	}


	public Person() {
		this.nid = null;
		this.name = null;
		this.gender='_';
		this.height=0;
		this.weight=0;
	}


	public String getNid() {
		return nid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height/100;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight/1000;
	}
	
	public double calculateBMI()
	{
		return(this.weight/(Math.pow(this.height, 2 )));
	}


	@Override
	public String toString() 
	{
		return "Person Nid=" + getNid() + ", Name=" + getName() + ", Gender=" + getGender()
				+ ", Height=" + getHeight() + ", Weight=" + getWeight();
	}
	
	
	
	
	
	
	
	
}
