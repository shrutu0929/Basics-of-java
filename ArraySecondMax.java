import java.util.Scanner;

public class ArraySecondMax {
    static int FindMax(int []arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int FindSecondMax(int []arr){
        int max=FindMax(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int SecondMax=FindMax(arr);
        return SecondMax;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter " +n+ "elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Second maximum element:"+FindSecondMax(arr));
    }
}
