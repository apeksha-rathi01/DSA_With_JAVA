package Lecture._01_JavaProgram;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your roll number: ");
        int roll = sc.nextInt();
        System.out.println("Your roll number is: "+roll);
        System.out.print("Please enter your name: ");
        String name = sc.next();
        System.out.println("Your name is: "+name);
        System.out.print("Please enter your marks: ");
        float mark = sc.nextFloat();
        System.out.println("Your marks is: "+mark);
    }
}
