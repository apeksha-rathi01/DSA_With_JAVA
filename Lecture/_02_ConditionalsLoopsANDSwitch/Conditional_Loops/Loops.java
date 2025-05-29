package Lecture._02_ConditionalsLoopsANDSwitch.Conditional_Loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
        for loop – Use when you know how many times to repeat.
        while loop – Use when you don’t know how many times to repeat.
        do-while loop – Like while, but it runs at least once before checking the condition.
         */

        /*
            Syntax of for loops:-

            for (initialisation; condition; increment/decrement) {
                // body
            }
        */

        System.out.println("*** FOR-LOOPS ***");
        // Q: Print numbers from 1 to 5
        for (int num = 1; num <= 5; num ++) {
            System.out.println(num);
        }

        // print numbers from 1 to n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int num = 1; num <= n; num++) {
            System.out.print(num + " ");
            System.out.println("Hello World");
        }


        // Syntax of while loops:-
        /*
            Syntax:
            while (condition) {
                // body
            }
         */

        System.out.println("*** WHILE-LOOPS ***");
        int num  = 1;
        while (num <= 5) {
            System.out.println(num);
            num += 1;
        }

        // Syntax of do while loops:-
        /*

            do {
                // body
            } while (condition);

         */

        System.out.println("*** DO-WHILE-LOOPS ***");
        int n1 = 1;
        do {
            System.out.println("Hello World");
        } while (n1 != 1);

    }
}