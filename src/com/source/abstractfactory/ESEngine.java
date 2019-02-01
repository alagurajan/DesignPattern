package com.source.abstractfactory;

public interface ESEngine {

	public String toString();
}

class ESUFOEngine implements ESEngine {

	public String toString(){
		return "1000 mph";
	}
}

class ESUFOBossEngine implements ESEngine {

	public String toString(){
		return "2000 mph";
	}
}