package javaexercise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employe
{
	int empID;
	int age;
	String name;

	public Employe(int empID, int age, String name)
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
		return "Employe [empID=" + empID + ", age=" + age + ", name=" + name + "]";
	}
}
public class EmployeeIDSortUsingComparator {

	public static void main(String[] args) {
		List<Employe> li= new ArrayList<>();
		li.add(new Employe(101, 25, "tanmaya"));
		li.add(new Employe(78, 20, "tanmay"));
		li.add(new Employe(201, 25, "tanm"));
		li.add(new Employe(178, 22, "nmay"));
		Collections.sort(li,new Comparator<Employe>() {
			@Override
			public int compare(Employe e1, Employe e2) 
			{		
				return e1.getempid()-e2.getempid();
			}
		} );
		
		System.out.println(li);
		for (Employe employee : li) {
			System.out.println(employee);
		}
		//sorted by age
		li.stream().sorted((e1,e2)->e1.getage()-e2.getage()).forEach(System.out::println);

	}

}
