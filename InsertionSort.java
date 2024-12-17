import java.util.Scanner;
public class InsertionSort {
    static void sort(int [] a){
        int n=a.length;
        for(int i=0;i<n;i++){
            int j=i;
            while (j>0 && a[j]<a[j-1]){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int []a={8,4,3,2,6};
        sort(a);
        for(int val:a){
            System.out.println(val + " ");
        }
    }
}
