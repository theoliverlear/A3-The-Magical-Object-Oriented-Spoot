// Oliver Sigwarth                                                           |
// Computer Programming (CIDS 162)                                           |
// Assignment 3 - The Magical Object Oriented Spoot                          |
// Program: WizardSpoot.java                                                 |
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
public class WizardSpoot extends Spoot {
    //------------------------Argument-Constructor----------------------------
    public WizardSpoot(String name, String color, int age, int weight) {
        super(name, color, age, weight);
    }
    //------------------------Default-Constructor-----------------------------
    public WizardSpoot() {
        super();
    }
    //---------------------------Fetch-Details--------------------------------
    @Override
    public String details() {
        String basePhrase = "My name is %s. I am %d years old. I am a %s" +
                            " Spoot and I weigh %d lbs. I am a Wizard " +
                            "Spoot! Ask, and I shall perform a spell on you.";
        return String.format(basePhrase, this.getName(), this.getAge(),
                             this.getColor(), this.getWeight());
    }
    //-------------------------------Spells-----------------------------------
    public void ageSpell(int newAge, Spoot spoot) {
        System.out.println("Abrah Kadabrah! " + spoot.getName() + " is now " +
                           newAge + " years old!");
        this.setAge(newAge);
    }
    public void colorSpell(String newColor, Spoot spoot) {
        System.out.println("Abrah Kadabrah! " + spoot.getName() + " is now " +
                           newColor + "!");
        this.setColor(newColor);
    }
    public void nameSpell() {
        System.out.println("You're asking a wizard to change your name?" +
                           " That's a job for a government Spoot!");
    }
}
