package Assignment._01_JavaProgram;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***Fibonacci Series.***");
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        for(int i = 1 ; i <= n ; i++ ){
            System.out.print(first+" ");
            int result = first + second;
            first = second;
            second = result;

        }
    }
}
