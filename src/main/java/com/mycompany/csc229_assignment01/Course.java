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
    private String name;
    private String code;
     //here I will create the default constructor
    public Course(){
        ID = 0;
        name = " ";
        code = " ";
    }
        //here I will create the parameterized constructor
    public Course(int ID, String name, String code){
        ID = ID;
        name = name;
        code = code;
    }
        //here I will create the setters
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCode(String code) {
        this.code = code;
    }
   //here I will create the getters
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public String getCode() {
        return code;
    }
}
  


