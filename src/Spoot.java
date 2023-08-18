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
public class Spoot extends SpootEssence {
    //------------------------Argument-Constructor----------------------------
    public Spoot(String name, String color, int age, int weight) {
        super(name, color, age, weight);
    }
    //------------------------Default-Constructor-----------------------------
    Spoot() {
        super();
    }
    //---------------------------Fetch-Details--------------------------------
    @Override
    public String details() {
        String basePhrase = "My name is %s. I am %d years old. I am a %s" +
                            " Spoot and I weigh %d lbs. I an ordinary" +
                            " Spoot!";
        return String.format(basePhrase, this.getName(), this.getAge(),
                                         this.getColor(), this.getWeight());
    }
}
