package com.example2.animal;

public class Main {

	public static void main(String[] args) {
		Bird bird = new Bird('P',100);

		Animal animal = new Animal("falcon","fields");
		
		System.out.println(animal.getName());
		System.out.println(animal.getHabitat());
		System.out.println(bird.getPredator());
		System.out.println(bird.getMaxFlightSpeed());
		System.out.println(animal.toString());
		System.out.println(bird.toString());

	}

}
