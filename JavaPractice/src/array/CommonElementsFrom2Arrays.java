package array;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonElementsFrom2Arrays {

	public static void main(String[] args) {
		int a[]= {1,4,6,0,9,1,5,10};
		int b[]= {2,3,0,1,7,5,};
		int[] out= displayCommonsOnly(a,b);
		System.out.println(Arrays.toString(out));
		displayCommonsOnly2(a,b);
		
	}

	private static int[] displayCommonsOnly(int[] a, int[] b) {
		Set<Integer> set= new HashSet<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			if(set.contains(b[i])) {
				al.add(b[i]);
			}
		}
		int[] t= new int[al.size()];
		for (int i = 0; i < al.size(); i++) {
			t[i]=al.get(i);
		}
		//al.forEach(i-> t[i]=al.get(i));
		return t;
	}
	private static void displayCommonsOnly2(int[] a, int[] b) {
		List<Integer> al = Arrays.stream(a).boxed().collect(Collectors.toList());
		List<Integer> bl = IntStream.of(b).boxed().collect(Collectors.toList());
		HashSet<Integer> set= new HashSet<Integer>(al);
		set.retainAll(bl);
		System.out.println(set);
		int[] t= new int[set.size()];
		int i=0;
		for(Integer in: set) {
			t[i]=in; i++;
		}
		System.out.println(Arrays.toString(t));
	}

}
