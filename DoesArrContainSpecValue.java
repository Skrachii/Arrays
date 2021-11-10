package ArraysExercises;

public class DoesArrContainSpecValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {7,8,9,10,11,12};
        System.out.println(contains(arr, 10));
        System.out.println(contains(arr2, 10));
    }

    public static boolean contains(int[] arr, int value) {
        for (int i : arr) {
            if (value == i) {
                return true;
            }
        }
        return false;
    }
}

