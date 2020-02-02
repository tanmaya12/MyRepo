package javaexercise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringSort {

	public static void main(String[] args) {
		String s="TODO Auto generated method stub cabu tanmay kumar";
		List<String> li= new ArrayList<>(Arrays.asList(s.split(" ")));
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
		s=s.replaceAll(s, "");
		for (int i = 0; i < li.size(); i++) 
		{
			s=s+li.get(i).toString()+" ";
		}
		System.out.println("sorted string:\n"+s);
		
		// without using Collection
		String s1="TODO Auto generated method stub cabu tanmay kumar";
		String[] sa=s1.split(" ");//
		for (int i = 0; i < sa.length; i++) 
		{
			for (int j = 1; j < sa.length; j++) {
				//if(Character.)
			}
			
		}
	}

}
