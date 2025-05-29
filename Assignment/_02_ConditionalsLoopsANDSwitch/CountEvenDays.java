package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class CountEvenDays {
    public static void main(String[] args) {
        //Q:
        //Kunal is allowed to go out with his friends only on the even days of a given month.
        // Write a program to count the number of days he can go out in the month of August.
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter total Days in August: ");
        int days = sc.nextInt();
        CountEvenDaysInAugust(days);
    }

    static void CountEvenDaysInAugust(int days) {
        System.out.println("The number of days he can go out in the month of August:- ");
        int countdays = 0;
        for(int i=1; i<=days; i++){
            if(i%2==0) {
                countdays++;
                if (i + 2 > days) {
                    // If it's the last even number, don't print comma
                    System.out.print(i);
                } else {
                    System.out.print(i + ", ");

                }
            }
        }
        System.out.println("\nTotal Days are: "+countdays);
    }
}
