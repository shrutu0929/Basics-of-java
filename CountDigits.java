import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number : ");
        int n=sc.nextInt();
        int numOfDigits=0;
        int original_n=n;
        while(n>0){
            n=n/10;
            numOfDigits++;
        }
        System.out.println("number of digits in" +original_n+"="+numOfDigits);
    }
}
