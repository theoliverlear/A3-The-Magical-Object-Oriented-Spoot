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
// Last Modified: 8/18/2023                                                  |
//---------------------------------------------------------------------------|

/*----------------------------------------------------------------------------
| 4b. Write a header comment at the beginning of each file, including your   |
|     name and a brief description of the assignment.                        |
|----------------------------------------------------------------------------|
| 1. Design the Spoot class with Constructors, Getters, and Setters.         |
----------------------------------------------------------------------------*/
public class Spoot extends SpootEssence {
    // The Spoot class is a subclass of SpootEssence. This class creates
    // ordinary Spoots which have the characteristics of provided in the
    // superclass.
    /*------------------------------------------------------------------------
    | 4a. Include comments in your code to explain the purpose and           |
    |     functionality of classes, methods, and significant blocks of code. |
    |------------------------------------------------------------------------|
    | 1b. Define constructors to initialize the Spoot objects with relevant  |
    |     attributes.                                                        |
    ------------------------------------------------------------------------*/

    //------------------------Argument-Constructor----------------------------
    public Spoot(String name, String color, int age, int weight) {
        super(name, color, age, weight);
    }
    //------------------------Default-Constructor-----------------------------
    Spoot() {
        super();
    }
    //---------------------------Fetch-Details--------------------------------

    /*------------------------------------------------------------------------
    | 1d. Create a method called "details" that will return the name, color, |
    |     weight, and age.                                                   |
    ------------------------------------------------------------------------*/
    @Override
    public String details() {
        // This implementation of the details() method informs the user of a
        // given Spoot’s characteristics in sentence form. Since the Spoot
        // class is for generic Spoots, the method informs the user that the
        // given Spoot is ordinary.
        String basePhrase = "My name is %s. I am %d years old. I am a %s" +
                            " Spoot and I weigh %d lbs. I an ordinary" +
                            " Spoot!";
        return String.format(basePhrase, this.getName(), this.getAge(),
                                         this.getColor(), this.getWeight());
    }
}
