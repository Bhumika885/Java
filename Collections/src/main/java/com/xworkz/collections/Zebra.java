package com.xworkz.collections;
import java.util.ArrayList;
import java.util.Collection;

public class Zebra {
    public static void main(String[] args) {


        Collection collection1 = new ArrayList();
        collection1.add(100);
        collection1.add(250);
        collection1.add(3000);
        collection1.add(43);
        collection1.add(51);
        System.out.println("Collection 1:" + collection1);

        Collection collection2 = new ArrayList();
        collection2.add(600);
        collection2.add(70000);
        collection2.add(823);
        collection2.add(956);
        collection2.add(10666);
        System.out.println("Collection 2:" +collection2);

        collection1.addAll(collection2);
        System.out.println("Adding collection 1 and collection 2:" + collection1);

        boolean valueAvailable = collection1.contains(8);
        System.out.println("Value of 8 available in collection1: "+ valueAvailable);

        boolean containsall = collection2.containsAll(collection1);
        System.out.println("Contains all of collection1 :" + containsall);


        System.out.println("Collection1 size: " + collection1.size());
        System.out.println("Collection2 size: " + collection2.size());

        collection1.remove(1);
        System.out.println("Removing value of 1 from collection: " + collection1);

        boolean removeall =  collection1.removeAll(collection2);
        System.out.println("Removing all of collections 1 from collections 2:"+removeall);
        collection1.clear();
        System.out.println("clear all elements in collection1:"+ collection1);
    }
}
