package Lecture._04_Arrays_ArrayLists;
import java.util.*;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //INITIALISATION
        for(int i = 0; i < 3; i++ ){
            list.add(new ArrayList<>());
        }
        //ADD ELEMENTS
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
