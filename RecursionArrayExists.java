import java.util.Scanner;
public class RecursionArrayExists {
    static boolean search(int []a,int n,int target,int idx){
        if(idx>=n) return false;
        if(a[idx]==target)return true;
        return search(a,n,target,idx+1);
    }
    public static void main(String[] args) {
        int []a={1,2,4,6};
        int target=4;
        if(search(a,a.length,target,0)){
            System.out.println("Yes");

        }else {
            System.out.println("No");
        }
    }
}