package com.source.strategy;

public class Animal {
	
	private String name, food, sound;
	private double height, weight, speed;
	
	public Flys flyingType;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public String tryToFly(){
		return flyingType.fly();
	}
	
	public void setFlyingAbility(Flys newFlyType){
		flyingType = newFlyType;
	}
}
