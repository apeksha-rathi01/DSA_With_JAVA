package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your year: ");
        int year = sc.nextInt();
        leapYear(year);
    }

    static void leapYear(int year) {
        // Leap year conditions:
        // 1. Year is divisible by 4, AND
        // 2. If divisible by 100, it should also be divisible by 400
        if(year%4==0 && (year%100!=0 || year%400==0)){
            System.out.println(year+" is a leap year.");
        }else{
            System.out.println(year+" is not a leap year.");
        }
    }

}
