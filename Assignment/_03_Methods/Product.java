package Assignment._03_Methods;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your 1st number: ");
        int n1 = sc.nextInt();
        System.out.print("Please enter your 2nd number: ");
        int n2 = sc.nextInt();
        System.out.println("Product of "+n1+" and "+n2+" is: "+  product(n1,n2));
    }

    static int product(int n1, int n2) {
        int result = n1 * n2;
        return result;
    }
}
