package java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class StudentSortedInHashMap {

	public static void main(String[] args) {
		Map<Student, String> map= new HashMap<Student, String>();
		map.put(new Student(1908, 23, "Zava"), "QA");
		map.put(new Student(1998, 45, "Cabu"), "DEV");
		map.put(new Student(1967, 23, "Tanu"), "HR");
		map.put(new Student(1932, 56, "Face"), "SEQ");
		map.put(new Student(1900, 15, "Aabu"), "BA");
		
		System.out.println("----by id------");
		map.entrySet().stream()
			.sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getempid)))
				.forEach(System.out::println);
		System.out.println("----by name----");
		map.entrySet().stream()
		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getname)))
			.forEach(System.out::println);
		System.out.println("---by value---");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
	}

}
class Student
{
	int empID;
	int age;
	String name;

	public Student(int empID, int age, String name)
	{
		this.empID=empID;
		this.age=age;
		this.name=name;
	}
	public void setempid(int empID)
	{		this.empID=empID;	}
	public void setage(int age)
	{		this.age=age;	}
	public void setname(String name)
	{		this.name=name;	}
	public int getempid()
	{		return empID;	}
	public int getage()
	{		return age;	}
	public String getname()
	{		return name;	}
	@Override
	public String toString() {
		return "Student [empID=" + empID + ", age=" + age + ", name=" + name + "]";
	}
}
