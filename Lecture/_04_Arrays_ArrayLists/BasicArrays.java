package Lecture._04_Arrays_ArrayLists;
import java.util.Scanner;

public class BasicArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q: Store a roll number
        int a = 29;
        //Q: Store a person's name
        String name = "Apeksha Rathi";

        //Q: Store 5 roll numbers
        int roll0 = 04;
        int roll1 = 12;
        int roll2 = 26;
        int roll3 = 29;
        int roll4 = 35;
        //(Here, we have to declare again & again, instead of this we Array).

        /*
        SYNTAX of Array:
        datatypes[] variable_name = new datatypes[size];
        (Q: store 5 roll numbers)
        int roll[] = new int[5];
        (or direct) - int roll[] = {04,12,26,29,35};
         */

        int [] rollNo ; // Declaration of array, rollNo is getting defined in the stack.
        rollNo = new int[5]; //initialisation: actually here object is being created in the memory (heap).
        System.out.println(rollNo[1]);

        String arr[] = new String[4];
        System.out.println(arr[3]);

        String str = null; // Null is a special literals. It's only assign to non-primitives.

    }
}