package Lecture._03_Methods;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Q: Take input of 2 numbers and print the sum
        Scanner sc = new Scanner(System.in);
        int n1, n2, sum = 0;
        System.out.println("Enter the 1st Number: ");
        n1 = sc.nextInt();
        System.out.println("Enter the 2nd Number: ");
        n2 = sc.nextInt();
        sum = n1 + n2;
        System.out.println("Sum of two number is: "+sum);

        // Now do this entire thing 10 times. (It's a dry format)
        // In coding, DRY means "Don't Repeat Yourself."
        // Instead of writing the same code again and again, try to bundle it into a short code format.
        // We use functions and methods for that purpose, so we can reuse them in many places.

    }
}