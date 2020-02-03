package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradeRounding {

	public static void main(String[] args) {
		List<Integer> li= new ArrayList<>(Arrays.asList(73,67,38,33)); 
		//[75, 67, 40, 33] as out put below 38 can't round. round up with 5 divisible within < 3 range digits
		li= solve(li);
		System.out.println(solve1(li));
	}
	//using 3rd variable
	private static List<Integer> solve(List<Integer> li) {
		List<Integer> l= new ArrayList<Integer>();
		for (int i = 0; i < li.size(); i++) {
			int grade= li.get(i);
			if(grade>=38) {
				while(grade%5!=0)
				{
					grade++;
				}
				if( (grade-li.get(i)) < 3) {
					l.add(grade);
					//System.out.println(grade);
				}else
					l.add(li.get(i));
			}else
				l.add(li.get(i));
		}
	
		System.out.println(l);
		return l;
	}
	
	private static List<Integer> solve1(List<Integer> li) {
		for (int i = 0; i < li.size(); i++) {
			int grade= li.get(i);
			if(grade>=38) {
				while(grade%5!=0)
				{
					grade++;
				}
				if( (grade-li.get(i)) < 3) {
					li.set(i,grade);
				}else
					li.set(i,li.get(i));
			}else
				li.set(i,li.get(i));
		}
	
		System.out.println(li);
		return li;
	}

}
