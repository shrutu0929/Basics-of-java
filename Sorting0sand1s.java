import java.util.Scanner;
public class Sorting0sand1s {
    static void printArray(int []arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int[]arr,int i,int j ){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sortzeroOne(int[]arr){
        int n=arr.length;
        int zeroes=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeroes++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<zeroes){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter array size:");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter" + n+ "elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array:");
        printArray(arr);
        sortzeroOne(arr);
        System.out.println("sorted array:");
        printArray(arr);
    }
}
