package Lecture._03_Methods;
public class Shadowing {
    /*
    Shadowing means when two variables have the same name —
    one inside a method and one outside (in the class which is instance variable) —
    the one inside the method (local variable) hides the one outside.
    So, the method uses its own variable.
     */

    static int x = 90; //Instance Variable
    //Static means object-independent.
    //'x' is available everything inside the block of X - (Class Shadowing).

    public static void main(String[] args) {

        System.out.println(x); // 90
        int x ; // Class variable at line 9 is shadowing by this.
        //System.out.println(x); // Scaope will begin when value is initialised.

        x = 40; // Local Variable (Shadows the instance variable).
        System.out.println("Local Variable: "+x); // 40
        System.out.println("Instance Variable: "+Shadowing.x);
        fun();

    }
    static void fun(){
        System.out.println(x);
    }
}
