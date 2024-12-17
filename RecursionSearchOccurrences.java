import java.util.Scanner;
public class RecursionSearchOccurrences {
    static void FindAllIndices(int []a,int n,int target,int idx){
        if(idx>=n){
            return;
        }
        if(a[idx]==target){
            System.out.println(idx);
        }
        FindAllIndices(a,n,target,idx+1);
    }

    public static void main(String[] args) {
        int []a={1,2,3,4,4,4,4,4,5,6};
        int target=4;
        int n=a.length;
        FindAllIndices(a,n,target,0);
    }
}
