package com.example.abdelrahman.bloodtypediet;

/**
 * Created by abdelrahman on 28/10/16.
 */
public class Food {
String name;
    String a;
    String b;
    String ab;
    String o;
    String category;
public Food(String name,Category cat,Type typeA,Type typeB,Type typeAB,Type typeO){
    this.name=name;
    category=cat.toString();
    a=typeA.toString();
    b=typeB.toString();
    ab=typeAB.toString();
    o=typeO.toString();
}
}
