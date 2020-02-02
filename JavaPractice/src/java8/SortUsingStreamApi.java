package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortUsingStreamApi {

	public static void main(String[] args) {
		int a[]= {10,76,9,100,45,10,30,30,41,10,67,1,345};
		//Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(10,76,9,100,45,10,30,30,41,10,67,1,345));
		System.out.println(ar);
		//Collections.sort(ar);
		ar.stream().sorted().forEach(System.out::println);
		System.out.println(ar);
		
		
	}

}
