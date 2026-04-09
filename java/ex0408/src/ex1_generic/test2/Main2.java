package ex1_generic.test2;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
	
	//List<? super Dog> list에서 허용되는 타입
	// List<Dog>, List<Animal>, List<Object>
	// List<Puppy>는 안됨
	public static void addDog(List<? super Dog> list) {
		list.add(new Dog());
		list.add(new Puppy()); // Puppy 객체는 Dog로 취급
	}
	
	public static void main(String[] args) {
		List<Animal> animalList = new ArrayList<Animal>();
		List<Dog> dogList = new ArrayList<Dog>();
		List<Puppy> puppyList = new ArrayList<Puppy>();
		
		addDog(animalList);
		addDog(dogList);
		// addDog(puppyList);
		
		for (Animal obj : animalList) {
			obj.speak();
		}

		for (Dog obj : dogList) {
			obj.speak();
		}
	} // main ed
} // class ed