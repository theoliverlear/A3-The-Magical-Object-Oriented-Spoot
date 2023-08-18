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
// Last Modified: 8/17/2023                                                  |
//---------------------------------------------------------------------------|
import java.util.ArrayList;
public class SuperSpoot extends Spoot {
    private ArrayList<String> powers;
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
    @Override
    public String details() {
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
    //---------------------------Add-Power------------------------------------
    public void addPower(String power) {
        this.powers.add(power);
    }
    //------------------------------Getters-----------------------------------
    public ArrayList<String> getPowers() {
        return this.powers;
    }
    //------------------------------Setters-----------------------------------
    public void setPowers(ArrayList<String> powers) {
        this.powers = powers;
    }
}
