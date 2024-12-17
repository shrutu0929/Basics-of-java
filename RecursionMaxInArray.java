import java.util.Scanner;
public class RecursionMaxInArray {
    static int maxInArray(int []arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int SmallAns=maxInArray(arr,idx+1);
        return Math.max(arr[idx],SmallAns);
    }
    public static void main(String[]args){
        int []arr={3,4,5,6,7};
        System.out.println(maxInArray(arr,0));
    }
}
