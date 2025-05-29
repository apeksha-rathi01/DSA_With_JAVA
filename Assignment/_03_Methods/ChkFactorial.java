package Assignment._03_Methods;

import java.util.Scanner;

public class ChkFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();
        Factorial(num);
    }
    static void Factorial(int n){
        int f = 1;
        for(int i=1; i<=n ; i++ ){
            f = f * i;
        }
        System.out.println("Factorial of "+n+"! is: "+f);
    }
}
