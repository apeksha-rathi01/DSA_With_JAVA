package Lecture._03_Methods;
import static java.util.Collections.swap;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a , b);
        System.out.println("Original Values 'a' is: "+a+" & 'b' is: "+b);

//        String name = "Apeksha Rathi";
//        changenamme(name);
//        System.out.println(name);
//
    }

//    private static void changenamme(String naam) {
//        naam = "Shivansh Rathi"; // String is a final class not change the values.
//        // not changing, it's creating a new object.
//    }

    static void swap(int a, int b){
        // Swap Two Numbers

        int temp = a;
        a = b;
        b = temp;
        // this change will only be in this function scope only.
        System.out.println("After Swap 'a' : "+a+" & 'b' : "+b);
    }

}
