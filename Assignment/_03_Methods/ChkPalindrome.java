package Assignment._03_Methods;

import java.util.Scanner;

public class ChkPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = sc.nextInt();
        palindrome(num);
    }

     static void palindrome(int num) {
        int original = num;
        int rem, sum=0;
        while(num>0){
            rem = num % 10;
            sum = (sum * 10) + rem;
            num = num / 10;
        }
        if(original == sum){
            System.out.println(original+" is a Palindrome.");
        }else{
            System.out.println(original+" is not a Palindrome.");
        }
    }
}
