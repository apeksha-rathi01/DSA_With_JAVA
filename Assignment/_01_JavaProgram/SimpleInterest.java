package Assignment._01_JavaProgram;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***Calculate Simple Interest***");
        System.out.print("Enter the Principal Amount (P) : ");
        double principal = sc.nextDouble();
        System.out.print("Enter the Time (T) : ");
        double time = sc.nextDouble();
        System.out.print("Enter the Rate Interest (R) : ");
        double rate = sc.nextDouble();

        double SI = (principal * time * rate)/100;
        System.out.println("Simple Interest is: "+SI);
    }
}
