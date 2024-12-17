import java.util.Scanner;

public class Practice {
    static void PrintMatrix(int [][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j< matrix[i].length;j++){
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void add(int [][]a,int r1,int c1,int [][]b,int r2,int c2){
        if(r1!=r2  || c1!=c2){
            System.out.println("wrong input");
            return;
        }
        int [][]sum=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("sum of matrix 1 and matrix 2");
PrintMatrix(sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of rows and columns of matrix 1");
        int r1=sc.nextInt();
        int c1= sc.nextInt();
        int [][]a=new int[r1][c1];
        System.out.println("enter matrix values");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter no.of rows and columns of matrix 2");
        int r2=sc.nextInt();
        int c2= sc.nextInt();
        int [][]b=new int[r2][c2];
        System.out.println("enter matrix values");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix 1");
        PrintMatrix(a);
        System.out.println("matrix 2");
        PrintMatrix(b);
        add(a,r1,c1,b,r2,c2);
    }
}