package Assignment._02_ConditionalsLoopsANDSwitch;

import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the Total Subjects : ");
        double n = sc.nextInt();
        AVGMARKS(n);
    }
    static void AVGMARKS(double N){
        double avgMarks, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Marks: ");
        for(int i = 1; i<=N; i++){
            double marks = sc.nextInt();
            sum += marks;
        }
        avgMarks = sum / N;
        System.out.println("Average Marks is: "+ avgMarks);

    }
}

