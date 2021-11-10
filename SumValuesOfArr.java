package ArraysExercises;

public class SumValuesOfArr {
    public static void main(String[] args) {
        int[] myArr={1,2,3,4};
        int sum=0;
        for (int i:myArr) {
            sum-=i;
        }
        System.out.println(sum);
    }
}
