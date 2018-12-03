package tests;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Calc {
	public  String  randomData(String Method, int Length) {
		 String SALTCHARS="";
		if (Method=="Alpha")
		{
			SALTCHARS  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";								
		}
		else
		{
			 SALTCHARS = "0123456789";							
		}
     
     StringBuilder salt = new StringBuilder();
     Random rnd = new Random();
    
     while (salt.length() < Length) { // length of the random string.
         int index = (int) (rnd.nextFloat() * SALTCHARS.length());
         salt.append(SALTCHARS.charAt(index));
     }       
     String saltStr = salt.toString();
     return saltStr;

 }

	 public /*static*/ void timer1(int seconds)
	    
	    {
	    	 try {
	             TimeUnit.SECONDS.sleep(seconds);
	         } catch (InterruptedException e) {
	             e.printStackTrace();                   
	         } 	
	    	
	    }
	 
	 
	 
}