package com.xworkz.external;

import com.xworkz.internal.Weapon;

public class MachineGun extends Weapon {
	
	//Override
	protected void use() {
		System.out.println("Running use in weapon");
	}
     //Override
	public void fire() {
		System.out.println("Running fire in weapon");
	}
		
	public void attack() {
		use();
		fire();
		
	}

}

