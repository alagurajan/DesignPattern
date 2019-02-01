package com.source.strategy;

public interface Flys {

	String fly();
}


class ItFly implements Flys{

	@Override
	public String fly() {
		return "Flying High";
	}
	
}

class CantFly implements Flys{

	@Override
	public String fly() {
		return "I Can't fly";
	}
	
}