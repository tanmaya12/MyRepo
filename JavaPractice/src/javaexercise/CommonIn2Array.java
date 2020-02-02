package javaexercise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonIn2Array {

	public static void main(String[] args) 
	{
		List<String> l1 = new ArrayList<String>(Arrays.asList("a","b","c","d"));
		List<String> l2 = new ArrayList<String>(Arrays.asList("z","c","g","a"));
		System.out.println(l1+"\n"+l2);
		l2.retainAll(l1);
		System.out.println(l2);
	}
}
