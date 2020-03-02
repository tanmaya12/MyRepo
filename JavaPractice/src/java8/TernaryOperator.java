package java8;

//condition ? if true : if false
public class TernaryOperator {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 30, result;
		result = (a > b) ? b : c;
		System.out.println(result);
		result = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		System.out.println("Max Number: " + result);
	}

}
