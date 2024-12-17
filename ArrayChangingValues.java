import java.util.Scanner;
public class ArrayChangingValues {
    static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        arr[0]=5;
        arr[1]=6;
        arr[2]=7;
        arr[3]=8;
        arr[4]=9;
        System.out.print("Original arr ");
        printArray(arr);
        int[]arr_2=arr;
        System.out.print("copied arr_2");
        printArray(arr_2);
        arr_2[0]=1;
        arr_2[3]=2;
        System.out.println("original array after changing arr_2");
        printArray(arr);
        System.out.println("copied arr_2 after changing arr_2");
        printArray(arr_2);
    }
}
