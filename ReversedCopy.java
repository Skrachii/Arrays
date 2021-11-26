package L9_Arrays;

import java.util.Arrays;

public class ReversedCopy {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        System.out.println("Original Array: "+ Arrays.toString(a));
        System.out.println("Reversed Copy: " +Arrays.toString(reverseCopy(a)));
    }
    public static int[] reverseCopy(int[]a){
    int[] rCopy = new int[a.length];
        for (int i = 0; i <a.length ; i++) {
            rCopy[rCopy.length -1 -i] = a[i];
        }
        return rCopy;
    }

}
