package com.xworkz.internal;

public abstract class Provider{
	public String name;
	public String ceoname;

	public Provider(String name, String ceoname) {
		super();
		this.name = name;
		this.ceoname = ceoname;
	}

public abstract void use();{

}

public abstract void main();{
	
}

@Override
public String toString() {
	return "Provider [name=" + name + ", ceoname=" + ceoname + "]";
}


@Override
public boolean equals(Object obj) {
	if(obj!=null) {
		if(obj instanceof Provider ) {
			Provider provider=(Provider)obj;
			if(this.name.equals(provider.name)&&this.ceoname.equals(provider.ceoname)) {
				return true;
			}
			else {
				System.out.println("...");
			}
			
		}
		else {
			System.out.println(",,,");
		}
	}
	return super.equals(obj);
}
}







		



	
