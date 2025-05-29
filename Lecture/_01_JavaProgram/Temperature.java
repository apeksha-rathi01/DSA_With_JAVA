package Lecture._01_JavaProgram;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Temp in Celcius : ");
        float tempC = sc.nextFloat();
        float temp = (tempC * 9/5) +32;
        System.out.println("Temp in celsius to fahrenheit: "+ temp);

    }
}
