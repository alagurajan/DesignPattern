package com.source.oops;

public class WorkWithAnimal {
	int justANum	=	10;
	public static void main(String[] args) {
		
	
		Dog fido	=	new Dog();
		
		fido.setName("Fido");
		System.out.println(fido.getName());
		fido.digHole();
		fido.setWeight(-1);
		
		int randNum	=	10;
		
		fido.chageVar(randNum);
		
		System.out.println("randNum after method call: "+randNum);
		
		changeObjectName(fido);
		
		System.out.println("Dog name after method call: "+fido.getName());
		
		
		Animal doggy	=	new Dog();
		Animal kitty	=	new Cat();
		
		System.out.println("Doggy says :"+doggy.getSound());
		System.out.println("Kitty says :"+kitty.getSound());
		
		Animal[] animals	=	new Animal[4];
		
		animals[0]	=	doggy;
		animals[1]	=	kitty;
		
		System.out.println("Doggy says :"+animals[0].getSound());
		System.out.println("Kitty says :"+animals[1].getSound());
		
		speakAnimal(doggy);
		
		((Dog)doggy).digHole();
		
		Giraffe	giraffe	=	new Giraffe();
		
		giraffe.setName("Rajan");
		
		System.out.println(giraffe.getName());
		
	}
	
	private static void speakAnimal(Animal animal) {
		System.out.println("Animal says :"+ animal.getSound());
	}

	public static void changeObjectName(Dog fido){
		fido.setName("Marcus");
	}
	
	public void sayHello(){
		System.out.println("JustANum "+justANum);
	}
}
