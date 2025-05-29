package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        palindrome(num);
    }
    static void palindrome(int n){
        int n1 = n;
        int r, sum = 0;
        while(n>0){
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if(n1 == sum){
            System.out.println(n1+ " is a Palindrome.");
        }else{
            System.out.println(n1+ " is not a Palindrome.");
        }

    }
}
