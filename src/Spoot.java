// Oliver Sigwarth                                                           |
// Computer Programming (CIDS 162)                                           |
// Assignment 3 - The Magical Object Oriented Spoot                          |
// Program: Spoot.java                                                       |
// Description:                                                              |
/*---------------------------------------------------------------------------|
| In this assignment, you will create a Java program to explore the concepts |
| of basic classes, constructors, getters, and setters. Instead of using     |
| real-world entities, you will design a class hierarchy representing        |
| imaginary creatures called Spoots. These Spoots will have specific         |
| attributes such as name, color and age. Your objective is to demonstrate   |
| your understanding of class design and object-oriented programming         |
| concepts by implementing the Spoot class.                                  |
----------------------------------------------------------------------------*/
// Created: 8/15/2023                                                        |
// Last Modified: 8/15/2023                                                  |
//---------------------------------------------------------------------------|
public class Spoot {
    //----------------------------Class-Variables------------------------------
    private String name;
    private String color; // console corresponds to color
    private int age;
    //--------------------------Argument-Constructor--------------------------
    public Spoot(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    //--------------------------Default-Constructor--------------------------
    Spoot() {
        this.name = "Spoot";
        this.color = "white";
        this.age = 1;
    }
}
