package ArraysExercises;

import java.util.Arrays;

public class SortNumAndStrArr {
    public static void main(String[] args) {
        int[]NumArr={8,5,7,12,44,78,100,0,53};
        String[]StrArr={"Stefan","Emo","Bobi","Milen","Krasi","Angel"};
        System.out.println("Before sort " + Arrays.toString(NumArr));
        Arrays.sort(NumArr);
        System.out.println("Sorted int array " +Arrays.toString(NumArr));
        System.out.println("String before sort " + Arrays.toString(StrArr));
        Arrays.sort(StrArr);
        System.out.println("Sorted int array "+Arrays.toString(StrArr));
    }
}
