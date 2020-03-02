package java8;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Date;
import java.util.function.Supplier;
import java.util.stream.Stream;

/*
  Let’s consider a class or method requiring a huge amount of secure random integers. The classical approach would be to create an array or collection of such integers. Yield provides two major advantages over such approach:
    yield does not require to know the length of the series in advance.
    yield does not require to store all values in memory.
 */

public class Yield_Return {
	private static final Integer RANDOM_INTS = 10;

	public static void main(String[] args) {
		try (Stream randomInt = generateRandomIntStream()) {
			Object[] randomInts = randomInt.limit(RANDOM_INTS).sorted().toArray();
			
			for (int i = 0; i < randomInts.length; i++)
				System.out.println(randomInts[i]);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}

	private static Stream generateRandomIntStream() throws NoSuchAlgorithmException {
		return Stream.generate(new Supplier() {

			final SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
			boolean init = false;
			int numGenerated = 0;

			@Override
			public Integer get() {
				if (!init) {
					random.setSeed(new Date().getTime());
					init = true;
					System.out.println("Seeding");
				}
				final int nextInt = random.nextInt();
				System.out.println("Generated random " + numGenerated++ + ": " + nextInt);
				return nextInt;
			}

		});
	}

}
