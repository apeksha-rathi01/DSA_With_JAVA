package Assignment._03_Methods;

import java.util.Scanner;

public class PrimeNumbers {

    static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    static void printPrimes(int n1, int n2) {
        for (int i = n1; i <= n2; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int n2 = sc.nextInt();

        System.out.println("Prime Numbers Between " + n1 + " and " + n2 + " are:");
        printPrimes(n1, n2);

        sc.close();
    }
}
