package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        System.out.println("Addition of two number is: "+sum);
    }
}
