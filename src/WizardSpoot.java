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
// Last Modified: 8/18/2023                                                  |
//---------------------------------------------------------------------------|

/*----------------------------------------------------------------------------
| 4b. Write a header comment at the beginning of each file, including your   |
|     name and a brief description of the assignment.                        |
|----------------------------------------------------------------------------|
| 1. Design the Spoot class with Constructors, Getters, and Setters.         |
----------------------------------------------------------------------------*/
public class WizardSpoot extends Spoot {
    // The WizardSpoot class is a Spoot who can utilize getters and setters to
    // cast spells on other Spoots to mutate their characteristics. They are a
    // subclass of Spoot and they add upon their superclass with their magical
    // methods.
    /*------------------------------------------------------------------------
    | 4a. Include comments in your code to explain the purpose and           |
    |     functionality of classes, methods, and significant blocks of code. |
    |------------------------------------------------------------------------|
    | 1b. Define constructors to initialize the Spoot objects with relevant  |
    |     attributes.                                                        |
    ------------------------------------------------------------------------*/

    //------------------------Argument-Constructor----------------------------
    public WizardSpoot(String name, String color, int age, int weight) {
        super(name, color, age, weight);
    }
    //------------------------Default-Constructor-----------------------------
    public WizardSpoot() {
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
        // given WizardSpoot’s characteristics in sentence form. Since the
        // WizardSpoot inherits generic Spoots, its universal characteristics
        // are returned. Lastly, the method informs the user that the given
        // Spoot is a wizard and it has abilities which can be performed on
        // other Spoots.
        String basePhrase = "My name is %s. I am %d years old. I am a %s" +
                            " Spoot and I weigh %d lbs. I am a Wizard " +
                            "Spoot! Ask, and I shall perform a spell on you.";
        return String.format(basePhrase, this.getName(), this.getAge(),
                             this.getColor(), this.getWeight());
    }
    //-------------------------------Spells-----------------------------------
    public void ageSpell(int newAge, Spoot spoot) {
        // The ageSpell() method uses a WizardSpoot’s abilities to age another
        // Spoot. It takes a Spoot and age as arguments. The WizardSpoot
        // announces the spell and mutates the given Spoot to the new age.
        System.out.println("Abrah Kadabrah! " + spoot.getName() + " is now " +
                           newAge + " years old!");
        spoot.setAge(newAge);
    }
    public void colorSpell(String newColor, Spoot spoot) {
        // The colorSpell() method uses a WizardSpoot’s abilities to dye
        // another Spoot. It takes a Spoot and color as arguments. The
        // WizardSpoot announces the spell and mutates the given Spoot to the
        // new color.
        System.out.println("Abrah Kadabrah! " + spoot.getName() + " is now " +
                           newColor + "!");
        spoot.setColor(newColor);
    }
    public void nameSpell() {
        // The nameSpell() method directs the user to the appropriate Spoot
        // who can change their name. The WizardSpoot prompts the user that
        // wizards don’t change names and the user should use a
        // GovernmentSpoot to change their name.
        System.out.println("You're asking a wizard to change your name?" +
                           " That's a job for a government Spoot!");
    }
}
