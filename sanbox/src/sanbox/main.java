package sanbox;

public class main {

	public static void main(String[] args) {
		perfume p = new perfume();
		
		System.out.println(p.top);
		System.out.println(p.top_size);
		System.out.println(p.type);
		
		System.out.println(p.pressed);
		
		p.press();
		
		System.out.println(p.pressed);

	}

}
