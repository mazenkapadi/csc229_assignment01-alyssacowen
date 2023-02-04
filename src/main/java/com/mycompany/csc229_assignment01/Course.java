/*
* ToDo 01:
 Complete the followings:

The Course class should have:

    - ID 

    - Name

    - Code

 - You need to have setters and getters for all data members
 - You must have a default constructor and an overloaded one that accepts 3 parameters to update the member variables.

 - Using a driver class (with main), instantiate the Course class and call its methods to change the id, name, and code.

 - Test and run your code.

 - Add comments to explain your program.

 - Push the code to GitHub.

 - Submit the Github link here (make sure it is a public repo).


 */

package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class Course {
//here I will create the data members
    private int ID;
    private String Name;
    private String Code;
    //here I will create the default constructor
    public Course(){
        ID = 0;
        Name = " ";
        Code = " ";
    }
    //here I will create the parameterized constructor
    public Course(int ID, String Name, String Code){
        ID = ID;
        Name = Name;
        Code = Code;
    }
    //here I will create the setters
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public void setCode(String Code) {
        this.Code = Code;
    }
        //here I will create the getters
    public int getID() {
        return ID;
    }
    public String getName() {
        return Name;
    }
    public String getCode() {
        return Code;
    }
}


