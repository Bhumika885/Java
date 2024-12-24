package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;


public class Joker {

    public static void main(String[] args) {

        Collection collection1 = new ArrayList();
        collection1.add(1);
        collection1.add("Bhumika");
        collection1.add(9234567890l);
        collection1.add(2);
        collection1.add("Kajal");
        System.out.println("Collection 1:" + collection1) ;

        Collection collection2 = new ArrayList();
        collection2.add(9845637281l);
        collection2.add(3);
        collection2.add("veenu");
        collection2.add(9063527272l);
        collection2.add(4);
        System.out.println("Collection 2:" + collection2) ;

        System.out.println(".........");

        collection1.addAll(collection2);
        System.out.println("Adding all  of collection 1 and collection 2:" + collection1);

        System.out.println("............");

        boolean valueAvailable = collection1.contains(9845637281l);
        System.out.println("Is Value of 9845637281 is available in collection1: "+ valueAvailable);

        boolean containsall = collection2.containsAll(collection1);
        System.out.println("Does collection 2  Contains all of collection1 :" + containsall);
        System.out.println("...............");



        System.out.println("Collection1 size: " + collection1.size());
        System.out.println("Collection2 size: " + collection2.size());
        System.out.println(".............");


        collection1.remove("Kajal");
        System.out.println("Removing value of Kajal from collection: " + collection1);


        collection1.removeAll(collection2);
        System.out.println("Removing all of collection 2 :"+ collection1);

        collection1.clear();
        System.out.println("clear all elements in collection1:"+ collection1);
    }
    }

