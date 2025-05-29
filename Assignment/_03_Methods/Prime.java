package Assignment._03_Methods;

import java.util.Scanner;

public class Prime {
    static boolean isPrime(int n){
        if(n <= 1)
            return false;
        for(int i=1 ; i<=n/2 ; i++ ){
            if(i%2==0)
                return true;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Checking Prime or Not,\nIf it is Prime return (TRUE) else return (FALSE).");
        System.out.println(isPrime(n));
    }
}
