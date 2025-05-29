package com.Assignments;

import java.util.Scanner;

public class PythagoreanTriplet {
    //A Pythagorean triplet is a set of three positive integers a,b,c that satisfy the Pythagoras theorem: a^2 + b^2 = c^2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter three number for Pythagorean Triplet Checker: ");
        System.out.print("Enter your 1st number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter your 2nd number: ");
        int n2 = sc.nextInt();
        System.out.print("Enter your 3rd number: ");
        int n3 = sc.nextInt();
        if(isPythagoreanTripletChecker(n1,n2,n3)){
            System.out.println("Yes, it is a Pythagorean triplet.");
        }else{
            System.out.println("Yes, it is not a Pythagorean triplet.");
        }
    }

    static boolean isPythagoreanTripletChecker(int a, int b, int c) {
        int x = a * a;
        int y = b * b;
        int z = c * c;

        return ( (x+y==z) || (y+z==x) || (x+z==y) );
    }

}
