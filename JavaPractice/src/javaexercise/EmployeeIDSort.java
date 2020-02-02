package javaexercise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee
{
	int empID;
	int age;
	String name;

	public Employee(int empID, int age, String name)
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
		return "Employee [empID=" + empID + ", age=" + age + ", name=" + name + "]";
	}
}
class Order implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1, Employee e2) 
	{		
		return e1.getempid()-e2.getempid();
	}
}
public class EmployeeIDSort 
{
	public static void main(String[] args) 
	{
		List<Employee> li= new ArrayList<>();
		li.add(new Employee(101, 25, "tanmaya"));
		li.add(new Employee(78, 20, "tanmay"));
		li.add(new Employee(201, 25, "tanm"));
		li.add(new Employee(178, 22, "nmay"));
		Collections.sort(li,new Order());
		
		System.out.println(li);
		for (Employee employee : li) {
			System.out.println(employee);
		}
		//sorted empID
		li.stream().sorted((e1,e2)->(e1.getempid()-e2.getempid())).forEach(t->System.out.println("lambda  :"+t));
		li.stream().sorted((e1,e2)->(e1.getempid()-e2.getempid())).forEach(System.out::println);
		//sorted name
		li.stream().sorted((e1,e2)->e1.getname().compareTo(e2.getname())).forEach(System.out::println);
	}
}
