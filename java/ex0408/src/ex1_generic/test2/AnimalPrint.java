package ex1_generic.test2;

import java.util.List;

public class AnimalPrint {
	
	public void printAnimals(List<? extends Animal> list) {
		for (Animal obj : list) {
			obj.speak();
		}
	}
}
