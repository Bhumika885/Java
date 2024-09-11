package com.xworkz.internal;

public class Gun {
	private String name;
	private String type;
	private double weight;
	private String manfBy;
	private String noOfBullet;
	private int range;

	public Gun(String name, String type, double weight, String mangBy, String noOfBullet, int range) {
		super();
		this.name = name;
		this.type = type;
		this.weight = weight;
		this.manfBy = manfBy;
		this.noOfBullet = noOfBullet;
		this.range = range;
	}

	@Override
	public String toString() {
		return "Gun [name=" + name + ", type=" + type + ", weight=" + weight + ", manfBy=" + manfBy + ", noOfBullet="
				+ noOfBullet + ", range=" + range + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running a equals in Gun");
		if(obj!=null) {
			
			if(obj instanceof Gun)
			{
				Gun gun=(Gun)obj;
				if(this.name.equals(gun.name) && this.range==gun.range) {
					System.out.println("Left and Right is Same");
					
				}
			}else {
				System.out.println("Obj is a Gun");
			}
		}else {
			System.out.println("Obj is Null");
		}
		return super.equals(obj);
	}


}
