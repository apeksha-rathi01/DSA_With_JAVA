package Assignment._03_Methods;

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your 1st Number: ");
        int n1 = sc.nextInt();
        System.out.print("Please enter your 2nd Number: ");
        int n2 = sc.nextInt();
        System.out.print("Please enter your 3rd Number: ");
        int n3 = sc.nextInt();

        System.out.println("Maximum Number is: "+maxNum(n1, n2, n3));
        System.out.println("Minimum Number is: "+minNum(n1, n2, n3));

    }
    static int maxNum(int n1, int n2, int n3){
        int max = n1;
        if(n2 > max){
            max = n2;
        }
        if(n3 > max){
            max = n3;
        }
        return max;
    }
    static int minNum(int n1, int n2, int n3){
        int min = n1;
        if(n2 < min){
            min = n2;
        }
        if(n3 < min){
            min = n3;
        }
        return min;
    }
}