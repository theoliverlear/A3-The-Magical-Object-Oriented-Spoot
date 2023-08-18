// Oliver Sigwarth                                                           |
// Computer Programming (CIDS 162)                                           |
// Assignment 3 - The Magical Object Oriented Spoot                          |
// Program: SuperSpoot.java                                                  |
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
| 1. Design the Spoot class with Constructors, Getters, and Setters.         |
----------------------------------------------------------------------------*/
public class SuperSpoot extends Spoot {
    // The SuperSpoot class is a Spoot who has superpowers. They are a
    // subclass of the Spoot class. The abilities of the SuperSpoot are found
    // in the powers ArrayList.
    /*------------------------------------------------------------------------
    | 4a. Include comments in your code to explain the purpose and           |
    |     functionality of classes, methods, and significant blocks of code. |
    ------------------------------------------------------------------------*/

    //---------------------------Class-Variables------------------------------
    private ArrayList<String> powers;
    /*------------------------------------------------------------------------
    | 1b. Define constructors to initialize the Spoot objects with relevant  |
    |     attributes.                                                        |
    ------------------------------------------------------------------------*/

    //------------------------Argument-Constructor----------------------------
    public SuperSpoot(String name, String color, int age, int weight,
                      ArrayList<String> powers) {
        super(name, color, age, weight);
        this.powers = powers;
    }
    //------------------------Default-Constructor-----------------------------
    public SuperSpoot() {
        super();
        this.powers = new ArrayList<>();
        this.powers.add("super cuteness");
    }
    //---------------------------Fetch-Details--------------------------------

    /*------------------------------------------------------------------------
    | 1d. Create a method called "details" that will return the name, color, |
    |     weight, and age.                                                   |
    ------------------------------------------------------------------------*/
    @Override
    public String details() {
        // This implementation of the details() method informs the user of a
        // given SuperSpoot’s characteristics in sentence form. Since the
        // SuperSpoot inherits generic Spoots, its universal characteristics
        // are returned. Lastly, the method provides the abilities of a given
        // SuperSpoot from the powers ArrayList.
        String basePhrase = "My name is %s. I am %d years old. I am a %s" +
                            " Spoot and I weigh %d lbs. I am a Super Spoot" +
                            " with the following powers: %s.";
        String powerPhrase = "";
        for (int i = 0; i < this.powers.size(); i++) {
            powerPhrase += this.powers.get(i);
            if (i < this.powers.size() - 1) {
                powerPhrase += ", ";
            }
        }
        return String.format(basePhrase, this.getName(), this.getAge(),
                             this.getColor(), this.getWeight(), powerPhrase);
    }
    //-----------------------------Add-Power----------------------------------
    public void addPower(String power) {
        this.powers.add(power);
    }
    /*------------------------------------------------------------------------
    | 1c. Implement appropriate getter and setter methods to access and      |
    |     modify Spoot attributes.                                           |
    ------------------------------------------------------------------------*/

    //------------------------------Getters-----------------------------------
    public ArrayList<String> getPowers() {
        return this.powers;
    }
    //------------------------------Setters-----------------------------------
    public void setPowers(ArrayList<String> powers) {
        this.powers = powers;
    }
}
