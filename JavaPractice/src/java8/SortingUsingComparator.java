package java8;

import java.util.ArrayList;


public class SortingUsingComparator {

	public static void main(String[] args) {
		
		ArrayList<Employee> arraylist = new ArrayList<Employee>();
		   arraylist.add(new Employee(223, "Chaitanya", 26.3));
		   arraylist.add(new Employee(245, "Rahul", 24.98));
		   arraylist.add(new Employee(209, "Ajeet", 32.6));
		 System.out.println("-------------ID-------------");
		   arraylist.stream().sorted((a,b)->a.getId()-b.getId()).forEach(System.out::println);
		   System.out.println("-------------Name-------------");  
		   arraylist.stream().sorted((a,b)->a.getName().compareTo(b.getName())).forEach(System.out::println);
		   System.out.println("-------------Percentage-------------"); 
		   arraylist.stream().sorted((a,b)->(int)(a.getPercentage()- b.getPercentage())).forEach(System.out::println);

	}

}
class Employee
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
	

}