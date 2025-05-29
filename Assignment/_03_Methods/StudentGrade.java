package Assignment._03_Methods;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks (Out of 100): ");
        int marks = sc.nextInt();
        calculateGrade(marks);
    }

    static void calculateGrade(int marks) {
        if(marks>=91 && marks<=100){
            System.out.println("Grade : AA");
        }else if(marks>=81 && marks<=90) {
            System.out.println("Grade : AB");
        }else if(marks>=71 && marks<=80) {
            System.out.println("Grade : BB");
        }else if(marks>=61 && marks<=70) {
            System.out.println("Grade : BC");
        }else if(marks>=51 && marks<=60) {
            System.out.println("Grade : CD");
        }else if(marks>=41 && marks<=50){
            System.out.println("Grade : DD");
        } else if (marks <= 40 && marks >= 0) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
        }
    }
}
