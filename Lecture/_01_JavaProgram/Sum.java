package Lecture._01_JavaProgram;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of two number is: "+sum);

        float c = sc.nextFloat();
        int d = sc.nextInt();
        float sum1 = c + d;
        System.out.println("Sum of two number is: "+sum1);
    }
}
