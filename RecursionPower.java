import java.util.Scanner;
public class RecursionPower {
    static int pow(int p,int q){
        if(q==0) return 1;
        return pow(p,q-1)*p;//recursive call
    }
    public static void main(String[]args){
        System.out.println(pow(5,4));
    }
}
