package com.xworkz.internal;

public class Gun extends Weapon {
	@Override
	protected void use() {
		System.out.println("Running use in Gun");
	}

	@Override
	public void fire() {
		System.out.println("Running fire in Gun");
	}

	public void carry() {
		System.out.println("Running carry in Gun");
		use();
		fire();
	}
 

}
