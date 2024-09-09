package com.typesofinheritance;

//Multi level inheritance
public class One1 {
	
	    public void print() {
	        System.out.println("inherit");
	    }
	}

	class Two extends One1 {
	    
	    public void print_for() 
	    {
	        System.out.println("for");
	    }
	}

	class Three extends Two {
	 
	    public void print_will() {
	        System.out.println("will");
	    }
	}

