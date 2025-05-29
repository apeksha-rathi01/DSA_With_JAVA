package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        reverseString(str);
    }
    static void reverseString(String s){
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
             rev += s.charAt(i);
        }
        System.out.println("Reverse String :"+rev);
    }
}
