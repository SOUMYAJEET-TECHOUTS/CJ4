package javaoops;

public class StaticTest {
	
	
		static int a = 10;
		static int b;
	static {
		System.out.println("Static block");
		b = a*10;
	}
	
	public static void main (String[] args)
	{
		System.out.println("From Static block");
		System.out.println("Value=" +a);
		System.out.println("Update value=" +b);
	}

}
