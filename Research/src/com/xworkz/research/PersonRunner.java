package com.xworkz.research;

public class PersonRunner {

    public static void main(String[] args) {
    	
        Person[] people = new Person[5];
        
        people[0] = new Person("Alice", "alice@example.com", 30, "123-456-7890");
        people[1] = new Person("Bob", "bob@example.com", 25, "234-567-8901");
        people[2] = new Person("Charlie", "charlie@example.com", 35, "345-678-9012");
        people[3] = new Person("Diana", "diana@example.com", 28, "456-789-0123");
        people[4] = new Person("Edward", "edward@example.com", 40, "567-890-1234");

        // Use a for-each loop to print all details of each Person
        for (Person person : people) {
            System.out.println(person);
        }
    }
}


