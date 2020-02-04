package array;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Designer_PDF_Viewer {
	// Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
        String index = "abcdefghijklmnopqrstuvwxyz";
        int length = word.length();
        int height = Integer.MIN_VALUE;
        for (char c : word.toCharArray()) {
            int ind = index.indexOf(c);
            int he = h[ind];
            height = Math.max(height, he);
        }
        return height * length;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
