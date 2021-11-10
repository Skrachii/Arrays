package ArraysExercises;

public class Ex6_FindTheIndex {
    public static void main(String[] args) {
    int[] FirstArray={10,20,30,40};
        System.out.println("Index position of 40: "+findInd(FirstArray, 40));
    }
    public static int findInd(int[]myArr,int t){
        if(myArr==null)
            return -1;
        int len=myArr.length;
        int i=0;
        while(i<len){
            if(myArr[i]==t)
                return i;
            else
                i=i+1;
        }
        return -1;
    }
}
