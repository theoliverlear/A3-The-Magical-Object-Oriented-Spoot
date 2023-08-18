// Oliver Sigwarth                                                           |
// Computer Programming (CIDS 162)                                           |
// Assignment 3 - The Magical Object Oriented Spoot                          |
// Program: SpootFactory.java                                                |
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
/*
Instructions:

1.Design the Spoot class with Constructors, Getters, and Setters:

   - Create a class called Spoot with the following attributes: name, color,
     weight and age.
   - Define constructors to initialize the Spoot objects with relevant
     attributes.
   - Implement appropriate getter and setter methods to access and modify
     Spoot attributes.
   - Create a method called "details" that will return the name, color, weight
     and age like so: "My name is Spooty. I am 4 years old. I am a blue Spoot
     and I weigh 2 lbs."
3. Test Program:
   - Create a main class called Main to simulate interactions with the Spoot
     objects.
   - Instantiate 3 different Spoot and use the description method on each of
     them.

4. Documentation:
   - Include comments in your code to explain the purpose and functionality
     of classes, methods, and significant blocks of code.
   - Write a header comment at the beginning of each file, including your name
    and a brief description of the assignment.
 */



// Idea 1: Essence Spoot
//         Essence Spoots are the most basic Spoots.
//         They are like ghosts or phantoms. These
//         Spoots may rank higher on the hierarchy
//         than other Spoots because they are mostly
//         the soul of a Spoot and they have
//         transcended the physical realm.


import java.util.ArrayList;

public class SpootFactory {
    public static void main(String[] args) {
        //------------------------Normal-Spoot--------------------------------
        Spoot normalSpoot = new Spoot("Sarah", "blue", 4, 2);
        System.out.println(normalSpoot.details());
        //------------------------Super-Spoot---------------------------------
        ArrayList<String> powers = new ArrayList<>();
        powers.add("super cuteness");
        powers.add("super speed");
        powers.add("super sparkle");
        SuperSpoot superSpoot = new SuperSpoot("Oliver", "white", 3, 4,
                                               powers);
        System.out.println(superSpoot.details());
        //------------------------Wizard-Spoot--------------------------------
        WizardSpoot wizardSpoot = new WizardSpoot("Gandalf", "grey", 1000, 7);
        System.out.println(wizardSpoot.details());
        wizardSpoot.ageSpell(6, normalSpoot);
        wizardSpoot.nameSpell();
        //----------------------Government-Spoot------------------------------
        GovernmentSpoot governmentSpoot = new GovernmentSpoot("Agent Spooter",
                                                              "black", 5, 3,
                                           "Department of Spoots");
        System.out.println(governmentSpoot.details());
        governmentSpoot.fileNewName("Susan", normalSpoot);

    }
}

