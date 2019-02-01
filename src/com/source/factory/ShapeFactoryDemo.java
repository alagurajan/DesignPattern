package com.source.factory;

public class ShapeFactoryDemo {

	public static void main(String[] args) {
		ShapeFactory factory	=	new ShapeFactory();
		
		Shape shape1	=	factory.getShape("CIRCLE");
		shape1.draw();
		
		Shape shape2	=	factory.getShape("rectangle");
		shape2.draw();
		
		Shape shape3	=	factory.getShape("square");
		shape3.draw();
		
		
	}
}
