package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your digit of a number: ");
        int digits = sc.nextInt();
        sumOfDigits(digits);
    }
    static void sumOfDigits(int digNum){
        int n1 = digNum;
        int r, sum = 0;
        while(digNum>0){
            r = digNum % 10;
            sum = sum + r;
            digNum = digNum / 10;
        }
        System.out.println("Sum of digit "+n1+" is: "+sum);
    }
}
