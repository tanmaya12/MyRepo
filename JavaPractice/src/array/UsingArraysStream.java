package array;

import java.util.Arrays;

public class UsingArraysStream {

	public static void main(String[] args) {
		int a[]= {3,-2,87,1,0,-43,897,2};
		Arrays.stream(a).forEach(c-> System.out.print(c+" "));
		int sum = Arrays.stream(a).sum();
		System.out.println();
		System.out.println(sum);
		System.out.println();
		Arrays.stream(a).sorted().forEach(c->System.out.print(c+". "));
		
	}

}
