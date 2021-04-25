
public class Hr extends Person 
{

	public Hr() {
		// TODO Auto-generated constructor stub
	}

	public Hr(String nid, String name, double height, double weight) {
		super(nid, name, height, weight);
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Student jsmith = new Student("J12568745641256","John Smith",175.50,100.50,"BDAC10001","Big Data Analytics","Smith Donald");
		System.out.println(jsmith.calculateBmi());
		System.out.print(jsmith.getName()+" has a salary of:" + jsmith.calculateSalary(0,0);

	}

}
