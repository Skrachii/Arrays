package ArraysExercises;

public class AverageValueOfArrElements {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
        int sum=0;

        for (int i = 0; i <num.length ; i++) {
            sum = sum + num[i];
        }
        float avg= sum/num.length;
        System.out.printf("%f",avg);
    }
}
