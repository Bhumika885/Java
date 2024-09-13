package com.xworkz.research;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
 
public class PastDate {
 
    public static void main(String[] args)
    {
        
        LocalDateTime localDate = LocalDateTime.now();
                DateTimeFormatter dateformatter= DateTimeFormatter.ofPattern("05 12 2015");
        
        System.out.println(dateformatter.format(localDate));
    }
}