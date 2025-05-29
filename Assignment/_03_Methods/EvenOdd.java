package Assignment._03_Methods;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();
        even_odd(num);
    }

    static void even_odd(int num) {
        if(num%2 == 0){
            System.out.println(num+" is Even Number.");
        }else{
            System.out.println(num+" is Odd Number.");
        }
    }

}
