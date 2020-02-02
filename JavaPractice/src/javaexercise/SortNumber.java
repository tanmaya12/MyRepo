package javaexercise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortNumber {
	public static void main(String[] args) {
//		Scanner s= new Scanner(System.in);
//		System.out.println("Enter a no.:");
		long num = 9040909790L; // Integer.parseInt(s.nextLine()); s.close();
		List<Long> li = new ArrayList<Long>();
		int count=0;
		while (num != 0) {
			long mod;
			mod = num % 10;
			if(mod==0)
				count++;
			li.add(mod);
			num /= 10;
		}
		// System.out.println(li);
		Collections.sort(li);
		System.out.println(li);  
		System.out.println(count);
		
		  String str= ""; 
		  Object[] array = li.toArray();
		  
		  System.out.println(); 
		  for (int i = 0; i < li.size(); i++) 
		  { str= str+ array[i]; } 
		  System.out.println(str); 
		  long nout= Long.parseLong(str);
		 // String.format("%"+count+"d0", nout);
		  System.out.println("Increasing order:"+String.format("%04d", nout));
		  
		 
	}	

}
