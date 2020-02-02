package java8;

public class AnonymousFunctionEx {
	
	void m1()
	{
		System.out.println("noraml m1().");
	}
	
//	()
//	{System.out.println("anonymous methos");} // name less method (no prefix) is called anonymous method

	public static void main(String[] args) {
		System.out.println("inside main().");
		new AnonymousFunctionEx().m1();
	}

}
