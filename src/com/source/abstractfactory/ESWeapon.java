package com.source.abstractfactory;

public interface ESWeapon {
	
	public String toString();
}

class ESUFOGun implements ESWeapon {

	public String toString(){
		return "20 demage";
	}
}

class ESUFOBossGun implements ESWeapon {

	public String toString(){
		return "40 demage";
	}
}
