package com.example2.animal;
/*
 
 2. In this exercise you will create a class Animal, a class Bird and a class Main. Your task is to
implement the concept of Inheritance. Both your class Animal and your class Bird should have
two attributes each (that you will define!), constructor, getters and setters and method
toString(). In your class Bird, you should overload its constructor and use attributes defined in
the class Animal as parameters for the constructors.
In your class Main, you should instantiate an object of the class Animal and an object of the
class Bird, use their constructors and print their attributes using the String returned from the
method toString().
Hint1: Use the slides 17 and 18 of lecture 014 as a reference.
Hint 2: Use the reserved word super when implementing the constructor of the class Bird
 
 */


public class Animal {
	private String name = "";
	private String habitat = "";
	
	public Animal(String name, String habitat) {
		this.name = name;
		this.habitat = habitat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public String toString() {
		return "Animal [name ="+name+" habitat = "+habitat+"]";
	}

}
