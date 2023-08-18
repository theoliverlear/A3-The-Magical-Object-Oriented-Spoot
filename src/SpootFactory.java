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
// Last Modified: 8/18/2023                                                  |
//---------------------------------------------------------------------------|

/*----------------------------------------------------------------------------
| 4b. Write a header comment at the beginning of each file, including your   |
|     name and a brief description of the assignment.                        |
----------------------------------------------------------------------------*/
import java.util.ArrayList;
/*----------------------------------------------------------------------------
| 3a. Create a main class called Main to simulate interactions with the      |
|     Spoot objects.                                                         |
 ---------------------------------------------------------------------------*/
public class SpootFactory {
    // The SpootFactory class is where you can see the hub of Spoot creation.
    // Several kinds of Spoots are created and their methods are demonstrated
    // in this class.
    /*------------------------------------------------------------------------
    | 4a. Include comments in your code to explain the purpose and           |
    |     functionality of classes, methods, and significant blocks of code. |
    |------------------------------------------------------------------------|
    | 3. Test Program.                                                       |
    ------------------------------------------------------------------------*/
    public static void testSpootCreation() {
        /*--------------------------------------------------------------------
        | 3b. Instantiate 3 different Spoot and use the description method   |
        |     on each of them.                                               |
        --------------------------------------------------------------------*/

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
    //-----------------------------Main-Method--------------------------------
    public static void main(String[] args) {
        // This method will run the entirety of the program while utilizing
        // other methods as well.
        testSpootCreation();
        // Read README.md to run the program.
        /*--------------------------------------------------------------------
        | 4. Documentation.                                                  |
        --------------------------------------------------------------------*/
    }
}

