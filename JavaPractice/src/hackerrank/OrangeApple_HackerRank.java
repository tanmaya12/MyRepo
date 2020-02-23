package hackerrank;

import java.util.Scanner;

public class OrangeApple_HackerRank {

	// Complete the countApplesAndOranges function below.
	//input =5 a,15 o,3 a,2 o,[-2,2,1],[5,-6] //s,t,a,b,apples[],orranges[]
	//output= 1,1 //apple=1, orange=1
	/* 
The first apple falls at position 5 – 2 = 3 .
The second apple falls at position 5 + 2 =7.
The third apple falls at position 5 + 1 = 6.
The first orange falls at position 15 + 5 =20.
The second orange falls at position 15 – 6 = 9.
Only one fruit (the second apple) falls within the region between 7 and 11, so we print 1 as our first line of output.
Only the second orange falls within the region between 7 and 11, so we print 1 as our second line of output.
*/
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    	 
    	int applesOnHouse = 0;
         for (int i = 0; i < apples.length; i++) {
             int applePosition = a + apples[i];
             if (applePosition >= s && applePosition <= t) {
                 applesOnHouse++;
             }
         }
         System.out.println(applesOnHouse);
         
         /* Calculate # of oranges that fall on house */
         int orangesOnHouse = 0;
         for (int i = 0; i < oranges.length; i++) {
             int orangePosition = b + oranges[i];
             if (orangePosition >= s && orangePosition <= t) {
                 orangesOnHouse++;
             }
         }
         System.out.println(orangesOnHouse);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }

}
