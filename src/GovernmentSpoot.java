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
// Last Modified: 8/18/2023                                                  |
//---------------------------------------------------------------------------|

/*----------------------------------------------------------------------------
| 4b. Write a header comment at the beginning of each file, including your   |
|     name and a brief description of the assignment.                        |
|----------------------------------------------------------------------------|
| 1. Design the Spoot class with Constructors, Getters, and Setters.         |
----------------------------------------------------------------------------*/
public class GovernmentSpoot extends Spoot {
    // The GovernmentSpoot class uses getters and setters to mutate the
    // characteristics of a given Spoot. It inherits the generic Spoot class
    // and therefore all its characteristics. The department variable is the
    // governmental body where the given Spoot is employed.
    /*------------------------------------------------------------------------
    | 4a. Include comments in your code to explain the purpose and           |
    |     functionality of classes, methods, and significant blocks of code. |
    ------------------------------------------------------------------------*/

    //---------------------------Class-Variables------------------------------
    private String department;
    /*------------------------------------------------------------------------
    | 1b. Define constructors to initialize the Spoot objects with relevant  |
    |     attributes.                                                        |
    ------------------------------------------------------------------------*/

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
        // The fileNewName() method allows a given Spoot to change their legal
        // name. It takes a Spoot and name as an argument. The user is
        // informed of the change in name and which department altered their
        // records. Then the Spoot name is changed with a setter method.
        System.out.println("Filing new name for " + spoot.getName() + " to " +
                           newName + " in the " + this.department + ".");
        spoot.setName(newName);
    }
    //---------------------------Fetch-Details--------------------------------

    /*------------------------------------------------------------------------
    | 1d. Create a method called "details" that will return the name, color, |
    |     weight, and age.                                                   |
    ------------------------------------------------------------------------*/
    @Override
    public String details() {
        // This implementation of the details() method informs the user of a
        // given GovernmentSpoot’s characteristics in sentence form. Since the
        // GovernmentSpoot inherits generic Spoots, its universal
        // characteristics are returned. Lastly, the method informs the user
        // that the given Spoot is a government employee and provides their
        // department name.
        String basePhrase = "My name is %s. I am %d years old. I am a %s" +
                            " Spoot and I weigh %d lbs. I am a Government " +
                            "Spoot! I work for the %s.";
        return String.format(basePhrase, this.getName(), this.getAge(),
                             this.getColor(), this.getWeight(),
                             this.department);
    }
    /*------------------------------------------------------------------------
    | 1c. Implement appropriate getter and setter methods to access and      |
    |     modify Spoot attributes.                                           |
    ------------------------------------------------------------------------*/

    //------------------------------Getters-----------------------------------
    public String getDepartment() {
        return this.department;
    }
    //------------------------------Setters-----------------------------------
    public void setDepartment(String department) {
        this.department = department;
    }
}
