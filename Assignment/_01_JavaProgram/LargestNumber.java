package Assignment._01_JavaProgram;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the largest number.");
        System.out.print("Enter your 1st number:");
        double num1 = sc.nextDouble();
        System.out.print("Enter your 2nd number:");
        double num2 = sc.nextDouble();
        if(num1 > num2) {
            System.out.println(num1 + " is Greater.");
        }else if(num1 < num2){
            System.out.println(num2 + " is Greater.");
        }else{
            System.out.println("Both numbers are equal.");
        }
    }
}
