package com.xworkz.runner;

import com.xworkz.internal.AirtelInternetProvider;
import com.xworkz.internal.BookMyShow;
import com.xworkz.internal.BookingProvider;
import com.xworkz.internal.DellProvider;
import com.xworkz.internal.ExtremeAirtelInternetProvider;
import com.xworkz.internal.Fast5gExtreme;
import com.xworkz.internal.InternetProvider;
import com.xworkz.internal.JioInternetProvider;
import com.xworkz.internal.LenovoProvider;
import com.xworkz.internal.MovieBookingProvider;
import com.xworkz.internal.SatjioInternetProvider;

public class ProviderRunner {

	public static void main(String[] args) {
		BookingProvider bookingProvider=new BookingProvider("bhumi", "madhu");
		
		
        boolean ref=bookingProvider.equals(null);
        
      System.out.println(ref);
      System.out.println(bookingProvider.toString());
      bookingProvider.use();
      System.out.println("...");
      
      
      DellProvider DellProvider =new DellProvider("kitu", "priya");
        boolean ref1=DellProvider.equals(DellProvider);
        System.out.println(ref1);
        System.out.println(DellProvider.toString());
        DellProvider.use();
        
        System.out.println(",,,,");
        
        
        LenovoProvider lenovoProvider1 =new LenovoProvider("bhargavi", "singh" );
        LenovoProvider lenovoProvider2 =new LenovoProvider("bharath", "singh");
        boolean ref2=lenovoProvider1.equals(lenovoProvider2);
        System.out.println(ref2);
        System.out.println(lenovoProvider1.toString());
        lenovoProvider1.use();
        
        System.out.println("---");
        
        InternetProvider internetProvider=new InternetProvider("anushka", "virat");
        boolean ref3=internetProvider.equals(internetProvider);
        System.out.println(ref3);
        System.out.println(internetProvider.toString());
        internetProvider.use();
        
        System.out.println("+++");
        
        MovieBookingProvider movieBookingProvider =new MovieBookingProvider("keerti", "mahima");
        boolean ref4=movieBookingProvider.equals(movieBookingProvider);
        System.out.println(ref4);
        System.out.println(movieBookingProvider.toString());
        movieBookingProvider.book();
        movieBookingProvider.cancel();
        movieBookingProvider.use();
        
        System.out.println("===");
        
        BookMyShow bookMyShow=new BookMyShow("lolo", "karishma", "malaika");
        boolean ref5=bookMyShow.equals(bookMyShow);
        System.out.println(ref5);
        System.out.println(bookMyShow.toString());
        bookMyShow.book();
        bookMyShow.cancel();
        bookMyShow.use();
        
        System.out.println("++++");
        
        AirtelInternetProvider airtelInternetProvider =new AirtelInternetProvider("orry", "madhu");
        boolean ref6=airtelInternetProvider.equals(airtelInternetProvider);
        System.out.println(ref6);
        System.out.println(airtelInternetProvider.toString());
        airtelInternetProvider.use();
        
        System.out.println("++++++++++++");
        
        ExtremeAirtelInternetProvider extremeAirtelInternetProvider=new ExtremeAirtelInternetProvider("rohit", "moni");
        boolean ref7=extremeAirtelInternetProvider.equals(extremeAirtelInternetProvider);
        System.out.println(ref7);
        System.out.println(extremeAirtelInternetProvider.toString());
        extremeAirtelInternetProvider.use();
        
        System.out.println(".......");
        
        Fast5gExtreme fast5gExtreme=new Fast5gExtreme("karthik", "kirana");
        boolean ref8=fast5gExtreme.equals(fast5gExtreme);
        System.out.println(ref8);
        System.out.println(fast5gExtreme.toString());
        fast5gExtreme.use();
        
        System.out.println("++++++++++++");
        JioInternetProvider jioInternetProvider=new JioInternetProvider("mary", "merlin");
        boolean ref9=jioInternetProvider.equals(airtelInternetProvider);
        System.out.println(ref9);
        System.out.println(jioInternetProvider.toString());
        jioInternetProvider.use();
        
        System.out.println("++++++++++++++");
        
        SatjioInternetProvider satjioInternetProvider=new SatjioInternetProvider("aniket", "anu", 86," 13/06/2024");
        boolean ref0=satjioInternetProvider.equals(jioInternetProvider);
        System.out.println(ref0);
        System.out.println(satjioInternetProvider.toString());
        satjioInternetProvider.use();
	}
	

}