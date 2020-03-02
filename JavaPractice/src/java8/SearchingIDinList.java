package java8;

import java.util.ArrayList;


public class SearchingIDinList {

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

			int id= 209;//this id present or not in list of Employee
			for (Employee emp : arraylist) {
				if (emp.getId()==id) {
					System.out.println("found: "+emp.getName());
				}
			}
	}

}