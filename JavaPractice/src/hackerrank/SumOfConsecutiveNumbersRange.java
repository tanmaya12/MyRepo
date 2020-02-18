package hackerrank;

import java.util.stream.IntStream;

public class SumOfConsecutiveNumbersRange {

	public static void main(String[] args) {
		int start=45, end= 259999;
		long sum=0;
		//long sum= (long) IntStream.range(start, end+1).sum();
		for(long i=start; i<= end;i++) {
			sum+= i;
		}
		
		System.out.println(sum);
	}

}
