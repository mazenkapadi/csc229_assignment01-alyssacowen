
package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class NewClass {
    
     public static void main(String[] args) {
        //here I am creating a new object of type Course
        Course c1 = new Course();
        //here I am setting the values of variables using setters
        c1.setCode("CSC 229");
        c1.setID(23260);
        c1.setName("Moaath Alrajab");
        //here I made print statements to run my code to see if it works
         System.out.println("Course Code: " + c1.getCode());
         System.out.println("Course ID/Reference Number: " + c1.getID());
         System.out.println("Professor Name: " + c1.getName());
    }
    
}

