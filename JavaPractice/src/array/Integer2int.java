package array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Integer2int {

	public static void main(String[] args) {
		// Integer to int
		Integer[] i = { 1, 34, 67, 8, 12 };
		int[] a = new int[i.length];
		for (int j = 0; j < i.length; j++) {
			a[j] = i[j].intValue();
		}
		System.out.println(Arrays.toString(a));

		// int to Integer
		int[] x = { 888, 55, 21, 56, 789, 59 };
		Integer[] intx = new Integer[x.length];
		for (int j = 0; j < x.length; j++) {
			intx[j] = Integer.valueOf(x[j]);
		}
		System.out.println(Arrays.toString(intx));
		// using java 8
		Integer[] i8 = Arrays.stream(x).boxed().toArray(Integer[]::new);
		Integer[] in8 = IntStream.of(x).boxed().toArray(Integer[]::new);
		// int[] to List<Integer>
		List<Integer> li = Arrays.stream(x).boxed().collect(Collectors.toList());
		List<Integer> li2 = IntStream.of(x).boxed().collect(Collectors.toList());
	}

}
