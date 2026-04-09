package ex1_list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayExample2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		while (list.size() < 10) {
			int i = (int)(Math.random()*30+1);
			list.add(i);
		}
		
		System.out.println(list);
		
		int total = 0;
		for (int i : list) {
			if (i%2 != 0) total += i;
		}
		
		System.out.println(total);
	}
}
