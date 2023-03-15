package co.in.an.eye.tech.java.design.patterns;// Java Program to show Deep Cloning

// Importing java input/output libraries

// Class
public class CloneUsingCloneableInterface implements Cloneable {

    // Main driver method
    public static void main(String[] args) throws CloneNotSupportedException {
        // Creating first object of GFG class
        CloneUsingCloneableInterface t1 = new CloneUsingCloneableInterface();

        // Using clone() method to create duplicate object
        // of t1 reference variable
        // else for every object manually object needs
        // to be copied in deep copying
        // clone() ease this manual effort
        CloneUsingCloneableInterface t2 = t1.clone();

        // Comparing two objects just after deep copying
        // Returning true for shallow(by default) copying
        // Returning false for deep copying
        System.out.println(t1 == t2);
        System.out.println(t1.equals(t2));
    }

    // Defining a method as clone method is protected
// Defining within the class called cloneable interface
    public CloneUsingCloneableInterface clone() throws CloneNotSupportedException {
        return (CloneUsingCloneableInterface) super.clone();
    }
}

