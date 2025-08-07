import java.util.Scanner;

public class Majority {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=MajorityElement(arr,n);
        System.out.println(m);
    }

    public static int MajorityElement(int[] arr,int n){
        int c=0;  // person from left coming to fight
        int candidate=0;  // nothing is behinf 0 index
        for(int num:arr){
            if(c==0){
                candidate=num;
            }
            if(num==candidate) c++;
            else c--;
        }
        c=0;
        for(int num:arr){
            if(num==candidate) c++;
        }
        if(c>n/2){
            return candidate;
        }else{
            return -1;
        }
    }
}
