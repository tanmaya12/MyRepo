package java8;

import java.util.ArrayList;

public class EqualsHashcode_Override {

	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(new Person("Tanmay", 28));
		people.add(new Person("Kumar", 28));
		people.add(new Person("Behera", 4));
		people.add(new Person("Tanmay", 28));

		for (int i = 0; i < people.size(); i++) {
			for (int y = i + 1; y < people.size(); y++) {
				boolean check = people.get(i).equals(people.get(y));

				System.out.println("-- " + people.get(i).getName() + " - VS - " + people.get(y).getName());
				System.out.println(check);
			}
		}
	}
}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		if (!Person.class.isAssignableFrom(obj.getClass())) {
			return false;
		}

		final Person other = (Person) obj;
		if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
			return false;
		}

		if (this.age != other.age) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 53 * hash + (this.name != null ? this.name.hashCode() : 0);
		hash = 53 * hash + this.age;
		return hash;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
