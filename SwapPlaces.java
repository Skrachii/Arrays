package L9_Arrays;

import java.util.Arrays;

public class SwapPlaces {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        System.out.println("Before swap" + Arrays.toString(arr));
        swap(arr, 4,5);
        System.out.println("After swap" + Arrays.toString(arr));
    }

    public static void swap(int[] a, int i,int j){
        int temp= a[i];
        a[i]=a[j];
        a[j]=temp;
}
}