class RocketRunner{

public static void main(String[]args){
	
	
	
	
	    Rocket rocket1 = new Rocket("india", 23.0, 30000,10);
		System.out.println("rocketcountry:"+rocket1.country);
		System.out.println("rocketspeed:"+rocket1.speed);
		System.out.println("rocketfuelcapacity:"+rocket1.fuelcapacity);
		System.out.println("noofthrusters:"+rocket1.noofthrusters);
		
		
		Rocket rocket2 = new Rocket("russia", 24.0, 40000,20);
		System.out.println("rocketcountry:"+rocket2.country);
		System.out.println("rocketspeed:"+rocket2.speed);
		System.out.println("rocketfuelcapacity:"+rocket2.fuelcapacity);
		System.out.println("noofthrusters:"+rocket2.noofthrusters);
		
		
		Rocket rocket3 = new Rocket("japan", 25.0, 50000,30);
		System.out.println("rocketcountry:"+rocket3.country);
		System.out.println("rocketspeed:"+rocket3.speed);
		System.out.println("rocketfuelcapacity:"+rocket3.fuelcapacity);
		System.out.println("noofthrusters:"+rocket3.noofthrusters);
		
        

}
}