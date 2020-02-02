package singleton.full;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class VerifySingleton {

	public static void main(String[] args) {
		
		//Checking with Serializable   s1,s2
		try {
		SingletonClass s1= SingletonClass.getInstance();
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\ZavaDev\\SpringPractice\\DesignPattern\\input.txt"));
		out.writeObject(s1);
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\ZavaDev\\SpringPractice\\DesignPattern\\input.txt"));
		
		SingletonClass s2= (SingletonClass) in.readObject();
		in.close();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		//checking with cloneble s3,s4
		try {
		SingletonClass s3= SingletonClass.getInstance();
		SingletonClass s4= (SingletonClass) s3.clone();
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		//checking with Reflection api  s5,s6
		try {
		Constructor<?>[] constructors = SingletonClass.class.getDeclaredConstructors();
		
		Constructor<?> constructor = constructors[0];
		constructor.setAccessible(true);
		SingletonClass s5 = (SingletonClass) constructor.newInstance();
		SingletonClass s6 = (SingletonClass) constructor.newInstance();
		System.out.println(s5.hashCode());
		System.out.println(s6.hashCode());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
