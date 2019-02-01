package com.source.decorator;

public class PlainPizza implements Pizza {

	@Override
	public String getDescription() {
		return "This Dough";
	}

	@Override
	public double getCost() {
		return 4.0;
	}

}
