import java.util.Scanner;

public class ChangingArray {
    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        System.out.println("Original arr");
        printArray(arr);
        int []arr_2=arr;
        System.out.println("Copied arr_2");
        printArray(arr_2);
        //changing values of arr_2
        arr_2[0]=5;
        arr_2[4]=9;
        System.out.println("Original array after changing arr_2");
        printArray(arr);
        System.out.println("Copied arr_2 after changing arr_2");
        printArray(arr_2);
    }
}
