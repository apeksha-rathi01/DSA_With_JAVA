package Assignment._03_Methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your 1st number: ");
        int n1 = sc.nextInt();
        System.out.print("Please enter your 2nd number: ");
        int n2 = sc.nextInt();
        sum(n1,n2);

    }

    static void sum(int n1, int n2) {
        int sum = n1 + n2;
        System.out.println("Sum of "+n1+" and "+n2+" is: "+sum);
    }
}
