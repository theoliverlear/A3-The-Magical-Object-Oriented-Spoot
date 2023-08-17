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
// Last Modified: 8/17/2023                                                  |
//---------------------------------------------------------------------------|
public abstract class SpootEssence {
    //-----------------------------Class-Variables----------------------------
    private String name;
    private String color; // TODO: Console corresponds to color
    private int age;
    //--------------------------Argument-Constructor--------------------------
    public SpootEssence(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    //--------------------------Default-Constructor--------------------------
    SpootEssence() {
        this.name = "Spoot";
        this.color = "white";
        this.age = 1;
    }
    //-------------------------------Methods----------------------------------
    public abstract void details();
    //-------------------------------Getters----------------------------------
    public String getName() {
        return this.name;
    }
    public String getColor() {
        return this.color;
    }
    public int getAge() {
        return this.age;
    }
    //-------------------------------Setters----------------------------------
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
