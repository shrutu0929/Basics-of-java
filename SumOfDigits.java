import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number : ");
        int n=sc.nextInt();
        int sumofdigits=0;
        int Original_n=n;
        while(n>0){
            sumofdigits+=n%10;
            n=n/10;
        }
        System.out.println("sum of digits in " +Original_n+  "=" +sumofdigits);
    }
}
