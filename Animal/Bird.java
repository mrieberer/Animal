package com.example2.animal;


public class Bird extends Animal {
	char predator = ' ';
	int maxFlightSpeed = 0;

	public Bird(String animalName, String habitat, char predator, int maxFlightSpeed) {
		super(animalName, habitat);
		this.predator = predator;
		this.maxFlightSpeed = maxFlightSpeed;
		
		
	}
	
	public Bird(char predator, int maxFlightSpeed) {
		super(" ", " ");
		this.predator = predator;
		this.maxFlightSpeed = maxFlightSpeed;
		
	}
	

	public char getPredator() {
		return predator;
	}

	public void setPredator(char predator) {
		this.predator = predator;
	}

	public int getMaxFlightSpeed() {
		return maxFlightSpeed;
	}

	public void setMaxFlightSpeed(int maxFlightSpeed) {
		this.maxFlightSpeed = maxFlightSpeed;
	}
	
	public String toString(){
		return "[Bird: predator = "+ predator +" maxFlightSpeed = "+ maxFlightSpeed+" animalName = " + this.getName() + "";
	}
	

}
