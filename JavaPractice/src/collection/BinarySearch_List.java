package collection;

import java.util.*;

public class BinarySearch_List {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>(Arrays.asList(1, 4, 6, 8, 98));
		System.out.println(li.size());
		boolean flag = li.contains(8);
		System.out.println(flag);
		int search = Collections.binarySearch(li, 6);// if present return index , else return "(-(insertion point) - 1)"
		// The insertion point is defined as the point at which the key would be
		// inserted into the list.
		System.out.println(search);
		Set<Employee> set = new HashSet<Employee>();			
		set.add(new Employee(223, "Chaitanya", 26.3));
		set.add(new Employee(245, "Rahul", 24.98));
		set.add(new Employee(288, "Ajeet", 32.6));
		set.add(new Employee(299, "Cabu", 76.6));
		
		Comparator<Employee> com = new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getId().compareTo(e2.getId());
			}
		};
		int search2 = Collections.binarySearch(new ArrayList<Employee>(set), new Employee(299, null, null), com);
		if (search2 >= 0) {
			System.out.println("found at index: " + search2);
		} else {
			System.out.println("Not found");
		}
	}

}
