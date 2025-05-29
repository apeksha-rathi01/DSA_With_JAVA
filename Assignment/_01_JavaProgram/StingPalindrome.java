package Assignment._01_JavaProgram;

import java.util.Scanner;

public class StingPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String.");
        String s = sc.nextLine();
        String str = "";
        for(int i = s.length()-1; i >= 0 ; i--){
            str = str + s.charAt(i);
        }
        if(s.equals(str)){
            System.out.println("Given String "+s+" is a Palindrome.");
        }else{
            System.out.println("Given String "+s+" is not a Palindrome.");
        }
    }
}
