package hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StrangeCounter {
// Complete the strangeCounter function below.
	static long strangeCounter(long t) {
		long value = 3, temp = 0, count = 1;
		for (long i = 0; i < t; i++) {
			if (count <= t && (2 * count + 1) >= t) {
				long d = t - count;
				value -= d;
				temp = value;
				break;
			} else {
				count = count + 3 * ((long) Math.pow(2, i));
				value *= 2;
			}
		}
		return temp;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		long t = scanner.nextLong();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long result = strangeCounter(t);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
