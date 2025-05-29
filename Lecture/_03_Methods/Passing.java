package Lecture._03_Methods;
public class Passing {
    public static void main(String[] args) {
        String name = "Apeksha Rathi";
        greet(name); // Values of reference variable is passed
    }
    static void greet(String naam){ // Copy of the reference variable
        System.out.println(naam);
    }

    /*
    When we pass something in the function. In Java, there is no pass by reference it's only pass by value.
    (In this case it's only passing the value of that reference "copy of that reference")
     */
}
