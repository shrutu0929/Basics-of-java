import java.util.Scanner;
public class RecursionStringRemoveOccurrences {
    static String remove(String s){
        if(s.length()==0) return " ";
        String SmallAns=remove(s.substring(1));
        char currchar=s.charAt(0);
        if(currchar!='a'){
            return currchar+SmallAns;
        }else{
            return SmallAns;
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter string: ");
        String s=sc.nextLine();
        System.out.println(remove(s));
    }
}