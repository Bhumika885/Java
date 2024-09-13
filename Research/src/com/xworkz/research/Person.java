package com.xworkz.research;

public class Person {
    public String name;
    public String email;
    public int age;
    public String mobile;


    public Person(String name, String email, int age, String mobile) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.mobile = mobile;
    }
    
        
        public String toString() {
            return "Person{" +"name=' " + name + '\'' +", email='" + email + '\'' +", age=" + age +
                   ", mobile='" + mobile + '\'' +'}';
        }
}


        
       
    