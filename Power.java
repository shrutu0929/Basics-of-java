import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=1;
        for(int i=1;i<=b;i++){
            ans*=a;
        }
        System.out.println(ans);
    }
}
