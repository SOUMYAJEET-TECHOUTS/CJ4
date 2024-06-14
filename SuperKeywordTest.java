package javaoops;
import java.io.*;
 class Prog {
	int maxmark = 90;
	 class Rabi extends Prog { 
	    int maxmark = 100; 
	  
	    void display() 
	    { 
	       
	        System.out.println("Maximum Mark: "
	                           + super.maxmark); 
	    } 
	} 
 } 

	class SuperKeywordTest { 
	    public static void main(String[] args) 
	    { 
	        Rabi h = new Rabi(); 
	        h.display();	    } 
	}

