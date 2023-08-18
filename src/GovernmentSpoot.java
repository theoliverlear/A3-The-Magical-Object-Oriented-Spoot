// Oliver Sigwarth                                                           |
// Computer Programming (CIDS 162)                                           |
// Assignment 3 - The Magical Object Oriented Spoot                          |
// Program: GovernmentSpoot.java                                             |
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
public class GovernmentSpoot extends Spoot {
    private String department;
    //------------------------Argument-Constructor----------------------------
    public GovernmentSpoot(String name, String color, int age, int weight,
                           String department) {
        super(name, color, age, weight);
        this.department = department;
    }
    //------------------------Default-Constructor-----------------------------
    public GovernmentSpoot() {
        super();
        this.department = "Department of Spoots";
    }
    //--------------------------Change-Gov-Name-------------------------------
    public void fileNewName(String newName, Spoot spoot) {
        System.out.println("Filing new name for " + spoot.getName() + " to" +
                           newName + " in the " + this.department + ".");
        spoot.setName(newName);
    }
    //---------------------------Fetch-Details--------------------------------
    @Override
    public String details() {
        String basePhrase = "My name is %s. I am %d years old. I am a %s" +
                            " Spoot and I weigh %d lbs. I am a Government " +
                            "Spoot! I work for the %s.";
        return String.format(basePhrase, this.getName(), this.getAge(),
                             this.getColor(), this.getWeight(),
                             this.department);
    }
    //------------------------------Getters-----------------------------------
    public String getDepartment() {
        return this.department;
    }
    //------------------------------Setters-----------------------------------
    public void setDepartment(String department) {
        this.department = department;
    }
}
