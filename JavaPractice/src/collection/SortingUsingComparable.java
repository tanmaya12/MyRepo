package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class SortingUsingComparable {

	public static void main(String[] args) {
		String[] s= {"acbu","tanu","zebra","kumar"};
		System.out.println(Arrays.toString(s));
		ArrayList<String> al= new ArrayList<String>(Arrays.asList(s));
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		ArrayList<Employee> arraylist = new ArrayList<Employee>();
		   arraylist.add(new Employee(223, "Chaitanya", 26.3));
		   arraylist.add(new Employee(245, "Rahul", 24.98));
		   arraylist.add(new Employee(209, "Ajeet", 32.6));

		   Collections.sort(arraylist);

		   for(Employee str: arraylist){
				System.out.println(str);
		   }
	}

}
class Employee implements Comparable<Employee>
{
	private Integer id;
	private String name;
	private Double percentage;

	public Employee(Integer id, String name, Double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}

	@Override
	public int compareTo(Employee o) {
		//return this.id-o.getId();
		//return (int) (this.percentage-o.getPercentage());
		return this.name.compareTo(o.getName());
	}
	
}
