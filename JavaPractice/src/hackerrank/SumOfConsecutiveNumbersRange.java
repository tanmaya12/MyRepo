package hackerrank;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class SumOfConsecutiveNumbersRange {

	public static void main(String[] args) {
		long start = -2147483648l, end = 21474836l;
		long sum = 0;
		// long sum= (long) IntStream.range(start, end+1).sum();
		for (long i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println(sum);
		long sum2 = ((end - start) * ((end - start) + 1)) / 2;
		System.out.println(sum2);
		System.out.println(suminRange(start, end));
	}

	static long sumNatural(long n) {
		// long sum = (n * (n + 1)) / 2;
		return (n * (n + 1)) / 2;
	}

	static long suminRange(long l, long r) {
		return sumNatural(r) - sumNatural(l - 1);
	}

}
