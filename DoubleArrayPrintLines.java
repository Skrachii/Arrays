package ArraysExercises;

public class DoubleArrayPrintLines {
    public static void main(String[] args) {
        int[][] myArr = new int[10][10];
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <10 ; j++) {
                System.out.printf("%4d",myArr[i][j]);
            }
            System.out.println();
        }
    }
}
