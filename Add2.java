import java.util.Scanner;
public class Add2 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=0;
        // while(n>0){
        //     int d=n%10;
        //     d+=2;
        //     m=(m*10)+d;
        //     n/=10;
        // }
        // int r=0;
        // while(m>0){
        //     int d=m%10;
        //     r=(r*10)+d;
        //     m/=10;
        // }
        // System.out.println(r);

        int l=n;
        int c=0;
        while(l>0){
            int d=l%10;
            c++;
            l/=10;
        }
        int addn=0;
        while(c>0){
            addn=(addn*10)+2;
            c--;
        }
        int newn=n+addn;
        System.out.println(newn);
    }
}
