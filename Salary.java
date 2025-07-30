import java.util.Scanner;

public class Salary {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int id=sc.nextInt();
        int basic=sc.nextInt();
        float hra=10/100f;
        float ta=12/100f;
        float da=5/100f;
        float gross=basic + basic*hra+ basic*ta+basic*da;
        gross-=(0.15*gross);
        System.out.println(gross);
        sc.close();
    }
}
