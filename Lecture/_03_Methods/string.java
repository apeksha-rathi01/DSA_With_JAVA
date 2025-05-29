package Lecture._03_Methods;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Greeting Message: ");
        String greetM = sc.next();
        String message = greet(greetM);
        System.out.println(message);

        String personal = myGreet("Apeksha Rathi");
        System.out.println(personal);
    }

    static String myGreet(String name) {
        String message = "My name is " + name;
        return message;
    }

    static String greet(String greeting){
        return greeting;
    }

}
