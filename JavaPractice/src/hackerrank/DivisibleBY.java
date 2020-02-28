package hackerrank;

public class DivisibleBY {

	public static void main(String[] args) {
		for (int i = 3; i < 35; i++) {
			if (i%3==0 && i%5==0) {
				System.out.println(i+" Both");
			} else if (i%3==0) {
				System.out.println(i+ " By3");
			} else if (i%5==0) {
				System.out.println(i+" By5");
			}else{
				System.out.println(i);
			}
			
		}
	}

}
