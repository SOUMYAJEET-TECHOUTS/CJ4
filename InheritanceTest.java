package javaoops;

class Test {
	void input() 
	{
	int salary = 1000;
	System.out.println("Salary : " + salary);
	}
	 class Employee extends Test {
		 void disp() {
	    int bonus = 10000;
	    System.out.println("Bonus : " + bonus);
		 }
	 }
}
class InheritanceTest {
	    public static void main(String[] args)
	    {
	        Employee b = new Employee();
	        
	        b.input();
	        b.disp();
	        
	    
	       
	                           
	    }
	}

