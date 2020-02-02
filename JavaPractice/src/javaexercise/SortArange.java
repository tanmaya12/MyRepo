package javaexercise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArange {

	public static void main(String[] args) 
	{
		List<Integer> nos = new ArrayList<Integer>(Arrays.asList(5,1,1,4,2,3));//511423.... [2,3,4]
		System.out.println(nos);	
		for (int i = 0; i < nos.size(); i++)
		{
			if(i==nos.size()-1)
				break;
			if (!((nos.get(i)>=nos.get(i+1))))// | (nos.get(i)==nos.get(i+1))|(nos.get(i)<nos.get(i+1)))
			{
				System.out.println(i);
			}
		}
		
	}

}
