package com.xworkz.internal;

public class State {
		
		private String name;
		private int noOfDistrict;
		private int population;
		private String stateLang;
		private String ChiefMinister;
		private String capital;
		public State(String name, int noOfDistrict, int population, String stateLang, String chiefMinister,
				String capital) {
			super();
			this.name = name;
			this.noOfDistrict = noOfDistrict;
			this.population = population;
			this.stateLang = stateLang;
			ChiefMinister = chiefMinister;
			this.capital = capital;
		}
		@Override
		public String toString() {
			return "State [name=" + name + ", noOfDistrict=" + noOfDistrict + ", population=" + population + ", stateLang="
					+ stateLang + ", ChiefMinister=" + ChiefMinister + ", capital=" + capital + "]";
		}
		
		@Override
		public boolean equals(Object obj) {
			System.out.println("Running a equals in Country");
			if(obj!=null) {
				if(obj instanceof State) {
					State state=(State)obj;
					if(this.name.equals(state.name) && this.noOfDistrict==state.noOfDistrict) {
						System.out.println("left and right is Same");
					}
				}else {
					System.out.println("Obj is a Not State");
				}
			}else {
				System.out.println("Obj is Null");
			}
			return super.equals(obj);	}
		
	}


