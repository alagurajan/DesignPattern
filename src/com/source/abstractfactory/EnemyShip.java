package com.source.abstractfactory;

public abstract class EnemyShip {

	private String name;
	
	ESWeapon weapon;
	ESEngine engine;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	abstract void makeShip();
	
	public void followHeroShip(){
		System.out.println(getName() + " is following the hero at " + engine );	 
	}
	public void displayEnemyShip(){
		System.out.println(getName() + " is on the screen");
	}
	public void enemyShipShoots(){
		System.out.println(getName() + " attacks and does " + weapon);
	}
	public String toString(){
	    String infoOnShip = "The " + name + " has a top speed of " + engine +" and an attack power of " + weapon;
	    return infoOnShip;
	}

	
}
