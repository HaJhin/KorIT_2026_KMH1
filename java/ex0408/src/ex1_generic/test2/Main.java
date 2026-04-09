package ex1_generic.test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		AnimalPrint ap = new AnimalPrint();
		
		List<Animal> list1 = Arrays.asList(new Dog(),new Puppy());
		List<Dog> dogs = new ArrayList<Dog>();
		List<Puppy> cats = new ArrayList<>();
		
		ap.printAnimals(list1);    
		
		List<Number> list2 = Arrays.asList(1,2,3,4,5);
		// System.out.println(sum(list2) );
	} // main ed
	
	// 숫자타입의 List를 받아 총합을 구하는 sum 메서드

	public static double sum(List<? extends Number> list) {
		double total = 0;
		for (Number obj : list) {
			total += obj.doubleValue();
		}
		return total;
	}
} // class ed
