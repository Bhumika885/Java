package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;


public class Kite {

    public static void main(String[] args) {

        Collection collection1 = new ArrayList();
        collection1.add("Bhumika");
        collection1.add("Kajal");
        collection1.add("Inder");
        collection1.add("Yogitha");
        collection1.add("Chinu");
        System.out.println("Collection 1:" + collection1) ;

        Collection collection2 = new ArrayList();
        collection2.add("Sonu");
        collection2.add("Veenu");
        collection2.add("Saniya");
        collection2.add("Seema");
        collection2.add("Reema");
        System.out.println("Collection 2:" + collection2) ;

        System.out.println("...");

        collection1.addAll(collection2);
        System.out.println("Adding all  of collection 1 and collection 2:" + collection1);

        System.out.println("..");

        boolean valueAvailable = collection1.contains("Bhumika");
        System.out.println("Is Bhumika is available in collection1: "+ valueAvailable);

        boolean containsall = collection2.containsAll(collection1);
        System.out.println("is collection 2 in all of collection1 :" + containsall);
        System.out.println("........");



        System.out.println("Collection1 size: " + collection1.size());
        System.out.println("Collection2 size: " + collection2.size());
        System.out.println("....");


        collection1.remove("Kajal");
        System.out.println("Removing value of kajal from collection: " + collection1);


        collection1.removeAll(collection2);
        System.out.println("Removing all of collection 2 :"+ collection1);

        collection1.clear();
        System.out.println("clear all elements in collection1:"+ collection1);

    }
}
