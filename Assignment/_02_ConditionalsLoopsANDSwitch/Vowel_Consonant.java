package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a Character: ");
        char ch = sc.next().trim().charAt(0);
        vowel_consonant(ch);
    }

    static void vowel_consonant(char ch) {
        if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
            System.out.println(ch+" is a Vowel.");
        }else{
            System.out.println(ch+" is a Consonant.");
        }
    }
}
