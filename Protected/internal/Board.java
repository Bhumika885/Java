package com.xworkz.internal;

public class Board {
	private double width;
	private int height;

	protected Board() {
		System.out.println("Const with no arguments");
	}

	public Board(double width, int height) {
		super();
		this.width = width;
		this.height = height;
		System.out.println("Const with double and int");
	}
	
	
}


