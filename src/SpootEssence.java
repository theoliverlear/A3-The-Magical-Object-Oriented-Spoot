// Oliver Sigwarth                                                           |
// Computer Programming (CIDS 162)                                           |
// Assignment 3 - The Magical Object Oriented Spoot                          |
// Program: SpootEssence.java                                                |
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
// Last Modified: 8/18/2023                                                  |
//---------------------------------------------------------------------------|

/*----------------------------------------------------------------------------
| 4b. Write a header comment at the beginning of each file, including your   |
|     name and a brief description of the assignment.                        |
|----------------------------------------------------------------------------|
| 1. Design the Spoot class with Constructors, Getters, and Setters.         |
----------------------------------------------------------------------------*/
public abstract class SpootEssence {
    // The SpootEssence class is an abstract class which holds the essential
    // characteristics and methods of all Spoots. It implements the getters,
    // setters, and basic construction of every Spoot class. This is helpful
    // in reducing the boilerplate code which object-orientation can add.
    /*------------------------------------------------------------------------
    | 4a. Include comments in your code to explain the purpose and           |
    |     functionality of classes, methods, and significant blocks of code. |
    |------------------------------------------------------------------------|
    | 1a. Create a class called Spoot with the following attributes: name,   |
    |     color, weight, and age.                                            |
    ------------------------------------------------------------------------*/

    //---------------------------Class-Variables------------------------------
    private String name;
    private String color;
    private int age;
    private int weight;
    /*------------------------------------------------------------------------
    | 1b. Define constructors to initialize the Spoot objects with relevant  |
    |     attributes.                                                        |
    ------------------------------------------------------------------------*/

    //--------------------------Argument-Constructor--------------------------
    public SpootEssence(String name, String color, int age, int weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    //--------------------------Default-Constructor---------------------------
    SpootEssence() {
        this.name = "Spooter";
        this.color = "white";
        this.age = 1;
        this.weight = 1;
    }
    //-------------------------------Methods----------------------------------

    /*------------------------------------------------------------------------
    | 1d. Create a method called "details" that will return the name, color, |
    |     weight, and age.                                                   |
    ------------------------------------------------------------------------*/
    public abstract String details();
    // The details() method is where the characteristics of a Spoot are
    // returned as a String. Each Spoot implementation will have its own
    // details that will be provided via the method. The abstract nature of
    // the method signals that each Spoot will have this method, but it’s up
    // to the subclasses to choose how to implement it.
    /*------------------------------------------------------------------------
    | 1c. Implement appropriate getter and setter methods to access and      |
    |     modify Spoot attributes.                                           |
    ------------------------------------------------------------------------*/

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
    public int getWeight() {
        return this.weight;
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
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
