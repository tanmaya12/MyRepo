package java8;

import java.util.Scanner;
public class RoundingDecimalPlaces 
{
   public static void main(String[] args) 
   {
      System.out.println("Enter a string value = ");//o.50,0.05
      Scanner s = new Scanner(System.in);
      String str= s.nextLine();
      //float f = Float.parseFloat(str);
      s.close();
      dimension(str);
//      int decimals =  str.split(".")[1].length();
//      System.out.println(decimals);
   }
   
   static void dimension(String str)
   {
	   if (Float.parseFloat(str) < 1) 
	      {
	    	  str=str.substring(str.indexOf('.')+1, str.length());
	    	  if (str.length()>1)
	    	  {
	    		  if (str.charAt(0)=='0') {
	    			  System.out.println("Result :: "+str.substring(1, 2)+"mm");
				} else {
					System.out.println("Result :: "+str.substring(0, 2)+"mm");
				}    		  
			  } 
	    	  else 
	    	  {
				System.out.println("Result :: "+str.substring(0, 1)+"0mm");
			  }
	    	 
	      } else {
			 System.out.println("Result :: " + Math.round(Float.parseFloat(str))+"cm");
	      }
   }
 

}