/**
 * 
 * @author IOT
 *
 */
public class Student extends Person 
{
	private String sid;
	private String course;
	private String ResponsibleParty;
	
	/**
	 * 
	 * @param sid
	 * @param course
	 * @param responsibleParty
	 */
	public Student(String sid, String course, String responsibleParty, String nid, String name, double height, double weight) 
	{
		super(nid,name,height,weight);
		this.sid = sid;
		this.course = course;
		ResponsibleParty = responsibleParty;
	}
	
	/**
	 * setters and getters
	 */
	public void setResponsibleParty(String responsibleParty) 
	{
		ResponsibleParty = responsibleParty;
	}

	public String getSid() 
	{
		return sid;
	}

	public String getCourse() 
	{
		return course;
	}

	public String getResponsibleParty() 
	{
		return ResponsibleParty;
	}

	public void setSid(String sid) 
	{
		this.sid = sid;
	}

	public void setCourse(String course) 
	{
		this.course = course;
	}
	
	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return "This is a Student. Name:"+super.getName()+", NID:"+super.getNid()+
				", Height:" + super.getHeight()+", Weight"+ super.getWeight()+
				", sid:"+this.getSid()+", course:"+this.getCourse()+ "ResponsibleParty:"+this.getResponsibleParty();
	}
	
	@Override
	public double calculateSalary(double hoursWorked, double rate) 
	{
		// TODO Auto-generated method stub
		return 0.0;
	}
	
	
	
	

}
