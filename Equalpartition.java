import java.util.Scanner;
public class Equalpartition {
    static int findArraySum(int []arr){
        int totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        return totalSum;
    }
    static boolean equalsum(int []arr){
        int totalSum=findArraySum(arr);
        int prefsum=0;
        for(int i=0;i<arr.length;i++){
            prefsum+=arr[i];
            int suffixsum=totalSum-prefsum;
            if(suffixsum==prefsum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println(" enter " +n+  "elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("equal partition possible:"+equalsum(arr));
    }
}
