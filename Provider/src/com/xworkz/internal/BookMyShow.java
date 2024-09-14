package com.xworkz.internal;

public class BookMyShow extends MovieBookingProvider{
	
	private String totalHalls;
	
	public BookMyShow(String name,String ceoname,String TotalHalls) {
		
		super(name,ceoname);
		this.totalHalls = totalHalls;

	}
	
		
		@Override
		public void book() {
			System.out.println(",,,,,");
		}
        
	    @Override
		public void cancel() {
			System.out.println(";;;;;");
		}
			
		@Override
		public void use() {
		    System.out.println("......");
		}
		
		@Override
		public String toString() {
			return "BookMyShowMovieBookingProvider [totalHalls=" + totalHalls + ", toString()=" + super.toString() + "]";
		}


		@Override
		public void main() {
		    System.out.println("=====");
		}
	}

