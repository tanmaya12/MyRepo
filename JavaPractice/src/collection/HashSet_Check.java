package collection;

import java.util.HashSet;

class Face {
	String name = "tanmey";
	int a = 30;	
}

public class HashSet_Check {

	public static void main(String[] args) {
		HashSet<Face> set = new HashSet<Face>();
		set.add(new Face());
		set.add(new Face());
		System.out.println(set.size());
	}

}
