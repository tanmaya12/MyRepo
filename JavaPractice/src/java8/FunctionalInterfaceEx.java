package java8;

@FunctionalInterface
public interface FunctionalInterfaceEx {
	
	void m1(); // functional interface have only one abstract method and multiple default & static method.
	//void m();
	default void m2()
	{
		System.out.println("default ().");
	}
	static void m3()
	{
		System.out.println("satic ().");
	}

}
