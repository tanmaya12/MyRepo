package java8;

import java.util.*;
import java.util.stream.Collectors;

public class SearchWithoutLoop_List {

	public static void main(String[] args) {
		List<Employee> set = new ArrayList<Employee>();
		set.add(new Employee(223, "Chaitanya", 26.3));
		set.add(new Employee(245, "Rahul", 24.98));
		set.add(new Employee(209, "Ajeet", 32.6));
		set.add(new Employee(249, "Rahul", 24.98));
		set.add(new Employee(286, "Ajeeta", 32.6));

		Comparator<Employee> com = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getId() - o2.getId();
			}
		};
		Collections.sort(set, com);//sort default list using comparator
		//OR
		//sort using comparable
		//List<Employee> sortedList = set.stream().sorted((a,b)->a.getId()-b.getId()).collect(Collectors.toList());
		//set.stream().sorted(com).collect(Collectors.toList());
		System.out.println(set);
		int search = Collections.binarySearch(set, new Employee(209, null, null), com);
		if (search < 0) {
			System.out.println("Not found");
		} else {
			System.out.println("found");
		}
	}

}
