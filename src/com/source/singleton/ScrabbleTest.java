package com.source.singleton;

import java.util.LinkedList;

public class ScrabbleTest {

	public static void main(String[] args) throws InterruptedException {
		Singleton	newInstance	=	Singleton.getInstance();
		System.out.println("Instance 1 ID: "+System.identityHashCode(newInstance));
		
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> playerOneTiles	=	newInstance.getTiles(7);
		System.out.println("\nPlayer 1: "+playerOneTiles);
		System.out.println(newInstance.getLetterList());
		System.out.println();
		Singleton	instanceTwo	=	Singleton.getInstance();
		System.out.println("Instance 2 ID: "+System.identityHashCode(instanceTwo));
		
		System.out.println(instanceTwo.getLetterList());
		
		LinkedList<String> playeeTwoTiles	=	instanceTwo.getTiles(7);
		System.out.println("\nPlayer 2: "+playeeTwoTiles);
		System.out.println(instanceTwo.getLetterList());

	}
}
