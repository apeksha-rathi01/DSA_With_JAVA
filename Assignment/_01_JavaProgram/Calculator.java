package Assignment._01_JavaProgram;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st number :");
        double a = sc.nextDouble();
        System.out.print("Enter your 2nd number :");
        double b = sc.nextDouble();
        System.out.print("Enter Operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result = 0;
        if(operator == '+'){
            result = a + b;
            System.out.println("Addition of two number is: "+result);
        }else if(operator == '-'){
            result = a - b;
            System.out.println("Subtract of two number is: "+result);
        }else if(operator == '*'){
            result = a * b;
            System.out.println("Multiplication of two number is: "+result);
        }else if(operator == '/'){
            if(b!=0) {
                result = a / b;
                System.out.println("Division of two number is: " + result);
            }else{
                System.out.println("Error! Can't divided by zero.");
            }
        }else{
            System.out.println("Invalid Operator.");
        }
    }
}
