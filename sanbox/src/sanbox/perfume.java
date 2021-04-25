package sanbox;

public class perfume 
{
	String type = "glass";
	String top = "metal";
	
	int top_size = 2;
	
	static boolean pressed = false;
	
	public static void press()
	{
		pressed = true;
		
	}
	

	public static void unpress()
	{
		pressed = false;
		
	}

	

}
