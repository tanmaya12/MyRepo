package annotation;

import java.lang.reflect.Method;

public class CabuMain {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		CabuHello h= new CabuHello();
		Method m= h.getClass().getMethod("sayHello");
		
		Cabu ca= m.getAnnotation(Cabu.class);
		System.out.println(ca.annotationType()+" getting value= "+ca.value());
	}

}
