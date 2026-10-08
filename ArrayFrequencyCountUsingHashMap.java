package Arrays;
import java.util.*;
public class ArrayFrequencyCountUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr= {1,1,2,3,4,5,5};
     Map<Integer,Integer> map=new HashMap<>();
     for(int num:arr)
     {
    	 map.put(num, map.getOrDefault(num,0)+1);
     }
     for(Map.Entry<Integer, Integer> entry:map.entrySet())
     {
    	 System.out.println(entry.getKey()+" occurs "+entry.getValue());
     }
	}

}
/*
1 occurs 2
2 occurs 1
3 occurs 1
4 occurs 1
5 occurs 2
*/