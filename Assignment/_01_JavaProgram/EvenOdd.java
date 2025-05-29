package Assignment._01_JavaProgram;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Your number "+n+" is Even.");
        }else{
            System.out.println("Your number "+n+" is Odd.");
        }
    }
}
