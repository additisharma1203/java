import java.util.Scanner;

public class Palindrome{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int rev=0;
        while(m>0){
            int d=m%10;
            rev=(rev*10)+d;
            m/=10;
        }
        if(n==rev){
            System.out.println("Number is paindrome");
        }else{
            System.out.println("Number is not paindrome");
        }
    }
}
