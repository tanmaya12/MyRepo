package hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StrangeCounter {
// Complete the strangeCounter function below.
	static long strangeCounter(long t) {
//		long value = 3, temp = 0, count = 1;
//		for (long i = 0; i < t; i++) {
//			if (count <= t && (2 * count + 1) >= t) {
//				long d = t - count;
//				value -= d;
//				temp = value;
//				break;
//			} else {
//				count = count + 3 * ((long) Math.pow(2, i));
//				value *= 2;
//			}
//		}
//		return temp;
		long d = 3;
		long ans = 0;
		while (true) {
			if (t <= d) {
				ans = d + 1 - t;
				//System.out.println(ans);
				break;
			} else {
				t -= d;
				d = 2 * d;
				System.out.println(t+" "+d);
			}
		}
		return ans;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		long t = scanner.nextLong();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long result = strangeCounter(t);
		//System.out.println(String.valueOf(result));
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
