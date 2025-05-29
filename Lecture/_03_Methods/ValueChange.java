package Lecture._03_Methods;
import java.util.*;
public class ValueChange {
    public static void main(String[] args) {
        //Let's Create an Array. Because i want to show you if the original values is change or not.
        //What s an Array? Array is a collections of same data-types.

        int arr[] = {1,3,2,45,6};;
        change(arr); //It's call by value
        System.out.println(Arrays.toString(arr));

    }
    static void change(int nums[]){ //nums (values) of the reference variable is actually another to pointing to an object which is arr.
        nums[0] = 99; //If you make a change to the object via this reference variable, same object will be change.

    }
}
