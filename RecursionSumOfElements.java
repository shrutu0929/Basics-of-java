import java.util.Scanner;
public class RecursionSumOfElements {
    static int sum(int []arr,int idx){
        if(idx==arr.length){
            return 0;
        }
        int SmallAns=sum(arr,idx+1);
        return SmallAns+arr[idx];
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4};
        System.out.println(sum(arr,0));
    }
}
