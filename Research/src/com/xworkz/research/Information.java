package com.xworkz.research;

import java.io.*;

// Main class
public class Information {
 
    // main driver method
    public static void main(String[] args) throws Exception
    {
 
        // File path is passed as parameter
        File file = new File("C:\\Users\\bhumi\\eclipse-workspace\\Research\\Info.txt");
 
        	 
        // Creating an object of BufferedReader class
        BufferedReader br= new BufferedReader(new FileReader(file));
 
        // Declaring a string variable
                       String st;
        	        while ((st = br.readLine()) != null)
 
                    System.out.println(st);
    }
}

