package Assignment._01_JavaProgram;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.next();
        System.out.println("Hello "+name+"! Your Welcome.");
    }
}
