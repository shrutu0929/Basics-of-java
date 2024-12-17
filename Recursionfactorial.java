import java.util.Scanner;
public class Recursionfactorial {
    static int factorial(int n){
        if(n==1) return 1;
        return n * factorial(n-1);//if(n==1)return 1 return n* factorial(n:n-1)
    }
    public static void main(String[]args){
        System.out.println(factorial(5));
    }
}