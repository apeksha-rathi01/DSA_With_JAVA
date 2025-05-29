package Assignment._03_Methods;

import java.util.Scanner;

public class VoteEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your Age: ");
        int age = sc.nextInt();
        vote_eligible(age);
    }

    static void vote_eligible(int age) {
        if(age >= 18){
            System.out.println("Eligible For Voting.");
        }else{
            System.out.println("Not Eligible For Voting.");
        }
    }
}
