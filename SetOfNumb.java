package ArraysExercises;

import java.util.Arrays;

public class SetOfNumb {
    public static void main(String[] args) {
        int[] arr={1,2,9,1,2,3,1,4,1,5,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(arr);
    }
}
