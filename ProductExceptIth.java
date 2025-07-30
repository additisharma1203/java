import java.util.Scanner;

public class ProductExceptIth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []arr=new int[N];
        int []ans=new int[N];
        int product=1;
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<N;i++){
            if(arr[i]==0){
                c++;
            }
            else{
                product*=arr[i];
            }
        }
        for(int i=0;i<N;i++){
            if(arr[i]==0 && c>1) {
                ans[i]=0;
            }
            if(arr[i]==0 && c==1) ans[i]=product;

        }

        for(int i=0;i<N;i++){
            System.out.println(ans[i]);
        }

    }
}
