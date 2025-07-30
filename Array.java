import java.util.Scanner;

public class Array {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int []arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        int sum=0;
        int avg=0;
        for(int i=0;i<N;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of elements: "+sum);
        avg=(sum)/N;
        System.out.println("Average of elements: "+avg);

        int []brr=new int[N];
        int j=N-1;
        for(int i=0;i<N;i++){
            brr[i]=arr[j];
            j--;
        }
         for(int i=0;i<N;i++){
            System.out.print(brr[i]+" ");
        }

    }
}
