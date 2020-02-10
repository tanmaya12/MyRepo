package java8;

interface I1{
	default void m1() {
		System.out.println("i1m1");
	}
}
interface I2{
	default void m2() {//m1  compiletime error duplicate default method
		System.out.println("i1m1");
	}
}

public class DemoClass implements I1,I2 {

	public static void main(String[] args) {
		new DemoClass().m2();

	}

}
