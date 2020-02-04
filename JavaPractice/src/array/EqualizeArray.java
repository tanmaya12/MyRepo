package array;

import java.util.HashMap;
import java.util.Map;

public class EqualizeArray {//make all element same others remove
	public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        br.readLine().trim();
//        String[] arr = br.readLine().trim().split(" ");
		int[] arr= {3,8,5,4,3,0,1,3,4};
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0; //Integer.MIN_VALUE;
        System.out.println(Integer.MAX_VALUE);
        for (Integer s : arr) {
            map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
            max = Math.max(max, map.get(s));
        }
        System.out.println(arr.length - max);
        //br.close();
    }

}
